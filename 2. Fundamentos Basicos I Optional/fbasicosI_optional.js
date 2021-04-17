//1. Obtén del 1 al 255: Escribe una función que devuelve un array con todos los números del 1 al 255.
function get_array() {
    var arr = [];
    for (var i = 1; i <= 255; i++) { //la variable i comienza en 1 ya que desde ese num nos piden, si fuese de 0  a 255, pues empezaría en 0.
        arr.push(i);
    }
    return arr; // para que nos devuelva el arreglo.
}
y = get_array(255)
console.log(y);

//2. Consigue pares hasta 1000: Escribe una función que entregue la suma de todos los números pares del 1 al 1000 - Puedes usar un operador de módulo para este ejercicio. 

function sum_num_pares() {
    var sum = 0;
    for (var i = 1; i <= 1000; i++) {
        if (i % 2 === 0) { // si nos pidieran los números impares usaría i%2===1, porque el residuo es uno
            sum = sum + i;
        }
    }
    return sum;
}

y = sum_num_pares(1000)
console.log(y);

//3. Suma impares hasta 5000: Escribe una función que devuelva la suma de todos los números impares entre 1 y 5000 (ej: 1+3+5+...+4997+4999).

function sum_num_impares() {
    var sum = 0;
    for (var i = 1; i <= 5000; i++) {
        if (i % 2 === 1) {
            sum = sum + 1;
        }
    }
    return sum;
}
y = sum_num_impares(5000)
console.log(y);

//4. Itera un array: Escribe una función que devuelva la suma de todos los valores dentro de un array (ej:  [1,2,5] retorna 8. [-5,2,5,12] retorna 14). 

function IterArr(arr) {
    var sum = 0;
    for (var i = 0; i < arr.length; i++) {
        sum = sum + arr[i];
    }
    return sum;
}
y = IterArr([1, 2, 5]); //ejemplo para probar la func.
console.log(y);

//5. Encuentra el mayor (max): Dado un array con múltiples valores, escribe una función que devuelva el número mayor (ej: para [-3,3,5,7] el número mayor (max) es 7). 
function findMax(arr) {
    var max = 0;
    for (var i = 0; i < arr.length; i++) {
        if (max < arr[i]) {
            max = arr[i];
        }
    }
    return max;
}
y = findMax([-3, 3, 5, 7]);
console.log(y);


//6. Encuentra el promedio (avg): Dado un array con múltiples valores, escribe una función que devuelva el promedio de los valores (ej: para [1,3,5,7,20] el promedio es 7.2).
function findAvg(arr) {
    var sum = 0;
    for (var i = 0; i < arr.length; i++) {
        sum = sum + arr[i];
    }
    return sum / arr.length; //sabemos que para obtener el promedio de cualquier cosa, sumaremos todos los valores lo dividiremos por la cantidad de elementos.
}
y = findAvg([1, 3, 5, 7, 20]);
console.log(y);

//7. Array de impares: Escribe una función que devuelva un array de todos los números impares entre 1 y 50 (ej: [1,3,5, …, 47,49]). Pista: Usa el método ‘push’.
function num_impares() {
    var arr = [];
    for (var i = 1; i <= 50; i++) {
        if (i % 2 === 1) {
            arr.push(i);
        }
    }
    return arr;
}
y = num_impares([]);
console.log(y);

//8. Mayor que Y: Dado un valor Y, escribe una función que toma un array y devuelve los valores mayores que Y. Por ejemplo, si arr = [1,3,5,7] y Y = 3, tu función devolverá 2 (hay 2 números en el array mayores que 3, esto son 5 y 7). 

function greaterY(arr, Y) {
    var count = 0; //variable que contendra la cantidad de elementos que son mayores que Y
    for (var i = 0; i < arr.length; i++) {
        if (arr[i] > Y) { //si el arreglo en posicion i es mayor que Y, la variable contara 1 and so on so on...
            count++;
        }
    }
    return count;
}

x = greaterY([1, 3, 5, 7], 3);
console.log(x);

//9. Cuadrados: Dado un array con múltiples valores, escribe una función que reemplace cada valor por el cuadrado del mismo valor (ej: [1,5,10,-2] será [1,25,100,4]).
function cuadrados(arr) {
    for (var i = 0; i < arr.length; i++) {
        arr[i] = arr[i] * arr[i]; // como me piden el cuadrado de cada elemento, debo multiplicar cada valor por si mismo
    }
    return arr;
}

x = cuadrados([1, 5, 10, -2]);
console.log(x);

//10. Negativos: Dado un array con múltiples valores, escribe una función que reemplace cualquier número negativo dentro del array por 0. Cuando el programa esté listo, el array no debiera contener números negativos (ej: [1,5,10,-2] se convertirá en [1,5,10,0]).
function NoNeg(arr) {
    for (var i = 0; i < arr.length; i++) {
        if (arr[i] < 0) {
            arr[i] = 0;
        }
    }
    return arr;
}

x = NoNeg([1, 5, 10, -2]);
console.log(x);

//11. Max/Min/Avg: Dado un array con múltiples valores, escribe una función que devuelva un nuevo array que solo contenga el valor mayor (max), menor (min) y promedio (avg) del array original (ej: [1,5,10,-2] devolverá [10,-2,3.5]).

function MaxMinAvg(arr) {
    var max = arr[0];
    var min = arr[0];
    var sum = arr[0];

    for (var i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
        if (arr[i] < min) {
            min = arr[i];
        }
        sum = sum + arr[i];
    }
    var avg = sum / arr.length;
    var arrnew = [max, min, avg];
    return arrnew;
}
console.log(MaxMinAvg([1, 2, 9])); //ejemplo, OUTPUT =[9,1,3]


// 12. Intercambia Valores: Escribe una función que intercambie el primer y el último valor de cualquier array. La extensión mínima predeterminada del array es 2 (ej: [1,5,10,-2] será [-2,5,10,1]). 

function returnReverso(arr) {

    var temp = arr[0];
    arr[0] = arr[arr.length - 1]
    arr[arr.length - 1] = temp;
    return arr;
}
console.log(returnReverso([1, 2, 3])); //ejemplo



//13. De Número a String: Escribe una función que tome un array de números y reemplace cualquier valor negativo por el string ‘Dojo’. Por ejemplo, dado el array = [-1,-3,2], tu función devolverá [‘Dojo’,‘Dojo’,2]..

function nonegativos(arr) {

    for (var i = 0; i < arr.length; i++) {
        if (arr[i] < 0) {
            arr[i] = "Dojo";
        }
    }
    return arr;
}
console.log(nonegativos([1, -2, -9])); //ejemplo, OUTPUT = [1,"Dojo","Dojo"]