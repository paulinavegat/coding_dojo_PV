//Fundamentos Intermedios Parte 1

//1.Sigma - Implementa una función sigma(num) que, dado un número, devuelve la suma de todos los enteros positivos (incluyendo el número dado). Ej: sigma(3) = 6 (1+2+3); sigma(5) = 15 (1+2+3+4+5).
function sigma(num) {

    var sum = 0
    for (var i = 0; i <= num; i++) { //i>0>1>2>3>4
        sum = sum + i; //sum=3+0;3+1;3+2;3+3
    }
    return sum;
}

x = sigma(3); // es decir, 1+2+3=6
console.log(x);

//Factorial - Escribe una función factorial(num) que, dado un número, devuelva el producto (multiplicación) de todos los enteros positivos (incluyendo el número dado). Por ejemplo: factorial(3) = 6 (1*2*3); factorial(5) = 120 (1*2*3*4*5).

function factorial(num) {

    var producto = 1; //debo comenzar en 1 porque si comienzo en 0 cualquier valor multiplicado por 0 sera 0
    for (var i = 1; i <= num; i++) { //i>1>2>3>4>5>6
        producto = producto * i; // producto= 1*1;1*2;2*3;6*4;24*5--
    }
    return producto; // es decir, 1*2*3*4*5=120
}

x = factorial(5);
console.log(x);

//Fibonacci - Crea una función para generar números de Fibonacci. En esta famosa secuencia matemática, cada número es la suma de las dos anteriores, partiendo con los valores 0 y 1. Tu función debería aceptar un argumento, un índice en la secuencia (donde 0 corresponde al valor inicial, 4 corresponden al valor cuatro más tarde, etc). 
//Ejemplos: fibonacci(0) = 0 (dado), fibonacci(1) = 1 (dado), fibonacci(2) = 1 (fib(0)+fib(1), o 0+1), fibonacci(3) = 2 (fib(1) + fib(2)3, o 1+1), fibonacci(4) = 3 (1+2), fibonacci(5) = 5 (2+3), fibonacci(6) = 8 (3+5), fibonacci(7) = 13 (5+8). Haz esto primero sin usar recursión. Si no sabes qué es una recursión, no te preocupes puesto que vamos a introducir este concepto en la Parte 2 de esta actividad. 
function fibonacci(num) {
    var num1 = 0;
    var num2 = 1; //los dos valores inciales para comenzar la serie fibonacci
    var sum = 1; // fibonacci(0) = 0 (dado), fibonacci(1) = 1 (dado)

    for (i = 2; i <= num; i++) { //i= f(2); fibonacci(2) = 1 (fib(0)+fib(1), o 0+1
        sum = num1 + num2;
        num1 = num2;
        num2 = sum;
    }
    return sum;
}
y = fibonacci(5);
console.log(y);


//Array: Penúltimo: Devuelve el penúltimo elemento del array. Dado [42,true,4,”Liam”, 7] devuelve “Liam”. Si el array es muy pequeño, devuelve null.  

function penultimo(arr) {

    if (arr.length < 2) {
        return null;
    }

    return arr[arr.length - 2];
}

y = penultimo([42, true, 4, "Liam", 7]);
console.log(y);



//Array: “N” último: Devuelve el elemento “N” último. Dado ([5,2,3,6,4,9,7],3], devuelve 6. Si el array es muy pequeño, devuelve null. 

function ArrayNultimo(arr, n) {

    if (arr.length < n) {
        return null;
    }

    return arr[arr.length - n - 1];
}

y = ArrayNultimo([5, 2, 3, 6, 4, 9, 7], 3);
console.log(y);

//Array: Segundo más grande: Devuelve el segundo elemento más grande de un array. Dado [42,1,4,3.14,7], devuelve 7.  Si el array es muy pequeño, devuelve null.

function encontrarsegMasGrande(arr) {

    var masGrande = arr[0];
    var segMasGrande = arr[0];

    for (var i = 0; i < arr.length; i++) {
        if (arr.length < 3) {
            return "null"
        }
        if (arr[i] > masGrande) { //en cada iteración vamos a chequear si el elemento en posición i, es mayor al masGrande, si esto es verdad
            segMasGrande = masGrande; //Asigno el valor más alto al segundo más alto
            masGrande = arr[i]; //Establezco nuevo valor más alto
        } else if (arr[i] > segMasGrande) { //necesito una segunda condición, Si elemento en posición i es mayor que el segundo más alto
            segMasGrande = arr[i]; //Establezco el nuevo segundo más alto
        }
    }
    return segMasGrande;
}

y = encontrarsegMasGrande([42, 1, 4, 3.14, 7]);
console.log(y);



//Doble Problema Par: Crea una función que cambie un array dado duplicando cada uno de sus elementos en una posición par, y manteniendo el orden original. Convierte [4, "Ulysses", 42, false]   a    [4,4, "Ulysses", "Ulysses", 42, 42, false, false].
function repetirValores(arr) {

    var newArr = [];
    for (var i = 0; i < arr.length; ++i) {

        newArr.push(arr[i]);
        newArr.push(arr[i]);
    }
    return newArr;
}


console.log(repetirValores([4, 'Ulysses', 42, false]));