//Fundamentos Básicos II
//1. Tamaño Grande - Dado un array, escribe una función que cambie todos los números positivos en él, por el string “big”. Ejemplo: grande([-1,3,5,-5]) devuelve [-1, “big”, “big”, -5].

function NoPositivo(arr) {
    for (var i = 0; i < arr.length; i++) {
        if (arr[i] > 0) {
            arr[i] = 'big';
        }
    }
    return arr;
}

x = NoPositivo([-1, 3, 5, -5]);
console.log(x);

//2. Imprime (print) el menor, devuelve (return) el mayor - Crea una función que tome un array de números. La función debería imprimir (print) el menor valor del array, y devolver (return) el mayor. 

function MinMax(arr) {

    var max = arr[0];
    var min = arr[0];

    for (var i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    console.log(min);
    return max
}
x = MinMax([1, 7, -2]);
console.log(x);

//3. Imprime (print) uno, devuelve (return) otro- Crea una función para un array de números. La función debería imprimir (print) el penúltimo valor y devolver (return) el primer valor impar.

function imprimeImpar(arr) {
    var impar = arr[0];

    for (var i = 1; i < arr.length; i++) {
        if (arr[i] % 2 === 1) {
            impar = arr[i];
        }
    }
    console.log(arr[arr.length - 2]);
    return impar
}
x = imprimeImpar([6, 5, 8, 0, -2]);
console.log(x);

//4. Doble Visión - Dado un array, crea una función que devuelva un nuevo array donde cada valor se duplique. Entonces, doble([1,2,3]) debiera devolver [2, 4, 6] sin cambiar el array original. 
function doble(arr) {
    for (var i = 0; i < arr.length; i++) {
        arr[i] = arr[i] * 2;
    }
    return arr;
}

x = doble([1, 2, 3]); //ejemplo
console.log(x);

//5. Contar Positivos -  Dado un array de números, crea una función para reemplazar el último valor con el número de valores positivos encontrados en el array. Ejemplo, contarPositivos([-1,1,1,1]) cambia el array original y devuelve [-1,1,1,3].

function contarPositivos(arr) {
    var count = 0 //variable que contenga la cuenta de los positivos
    for (var i = 0; i <= arr.length; i++) {
        if (arr[i] > 0) { //se establece la condición que si el arreglo en posicion i es mayor que 0 countará 1 en la var count
            count++;
        }
        arr[arr.length - 1] = count; //el último elemento del arreglo será reemplazado por la var count
    }
    return arr
}
x = contarPositivos([-1, 1, 1, 1]);
console.log(x);

//6. Pares e Impares - Crea una función que acepte un array. Cada vez que ese array tenga 3 valores impares seguidos, imprime (print) “¡Qué imparcial!”, y cada vez que tenga 3 pares seguidos, imprime (print) “¡Es para bien!”.

function paresImpares(arr) {

    for (var i = 0; i < arr.length; i++) {

        if (arr[i] % 2 === 1 && arr[i + 1] % 2 === 1 && arr[i + 2] % 2 === 1) {
            console.log("Impares");
        }
        if (arr[i] % 2 != 1 && arr[i + 1] % 2 != 1 && arr[i + 2] % 2 != 1) {
            console.log("Pares");
        }
    }
}
paresImpares([2, 2, 2, 2, 2, 2, 1, 1, 1]);

//7. Incrementa los Segundos - Dado un array de números arr, agrega 1 a cualquier otro elemento, específicamente a aquellos cuyo índice es impar (arr[1], arr[3], arr[5], etc). Luego, console.log cada valor del array y devuelve arr. 
function incrementaPosImpar(arr) {
    for (var i = 0; i < arr.length; i++) { //la var i representa la posición de los elementos del arreglo
        if (i % 2 == 1) //sí el elemento está en posición impar
            arr[i] = arr[i] + 1; // a ese elemento en dicha posic. se le aumentara en un1

    }
    console.log(arr);
    return arr;
}
y = incrementaPosImpar([1, 3, 4, 5, 6, 7]);

//8. Longitudes previas - Pasado un array (similar a decir ‘tomado un array’ o ‘dado un array’) que contiene strings, reemplaza cada string con un número de acuerdo cantidad de letras (longitud) del string anterior. Por ejemplo, longitudesPrevias([“programar”,“dojo”, “genial”]) debería devolver [“programar”,9, 4]. Pista: ¿For loops solo puede ir hacia adelante?

function  LongitudPrevia(arr)  {        
    for  (var  i  =  arr.length  -  1;  i  > 0;  i--)  {    // normalmente el arr se recorre de izq a derecha, esta vez como quiero analizar los elementos previos en el arreglo, recorrer el arreglo de derecha izq.  
        //para ello establecí que la i partiría desde la última posción del arreglo, en este caso 2, Y que además la i debía ser menor que 0, ya que no queremos modificar el elemento en dicha posición,
        //por otra parte, la i va decrementar, ya que estamos recorriendo de derecha a izquierda.

        var  temp  =  arr[i];         //establezco una variable temporal para que contenta los valores que modificaré, modificar 
        arr[i]  =  arr[i  -  1].length;        
        arr[i  -  1].length  =  temp;   //sobreescritura        
    }   
    return  arr;
}

y  =  LongitudPrevia(['programar',  'dojo',  'genial']);
console.log(y);


//9. Agrega Siete - Construye una función que acepte un array. Devuelve un nuevo array con todos los valores del original, pero sumando 7 a cada uno. No alteres el array original. Por ejemplo, agregaSiete([1,2,3) debería devolver [8,9,10] en un nuevo array. 

function agregaSiete(arr) {

    for (var i = 0; i < arr.length; i++) {
        arr[i] = arr[i] + 7
    }
    return arr
}

y = agregaSiete([1, 2, 3]);
console.log(y);
//10. Array Inverso - Dado un array, escribe una función que invierte sus valores en el lugar. Ejemplo: invertir([3,1,6,4,2)) devuelve el mismo array pero con sus valores al revés, es decir [2,4,6,1,3]. Haz esto sin crear un array temporal vacío. (Pista: necesitarás intercambiar (swap) valores).

function invertir(arr) {

    for (var i = 0; i < arr.length / 2; i++) { //arr.length/2 es necesario porque, si tengo dos elementos para cambiar de posición, el cambio es solo una vez, si tuviese 4 elementos, el cambios sería 2

        var temp = arr[i] //por lo general, establezco esta variable para cambiar el primer y último elemento de posición. Esta vez, establecí primeramente un looppara que repita esta acción cambiando los elementos de  posición
        arr[i] = arr[arr.length - 1 - i]; // es arr.lentgh -1-i porque partios de la base de cambiar desde el último valor hacia el centro del arreglo, representando la i las otras posicones del elemento
        arr[arr.length - 1 - i] = temp;
    }
    return (arr);
}
y = invertir([3, 6, 4, 2, 1]);
console.log(y)


//11. Perspectiva: Negativa - Dado un array crear y devuelve uno nuevo que contenga todos los valores del array original, pero negativos (no simplemente multiplicando por -1). Dado [1,-3,5], devuelve [-1,-3,-5].

function negativos(arr) {
    var newarray = [];

    for (var i = 0; i < arr.length; i++) {
        if (arr[i] < 0) {
            newarray.push(arr[i]);

        } else if (arr[i] > 0) {
            arr[i] = (arr[i] * -1);
            newarray.push(arr[i]);
        } else {
            newarray.push(arr[i]); // si la primera y la segunda condición no se cumple, solo agregar el elemeto del arr en el newarr, esto sería para el caso de 0.
        }
    }
    return newarray
}
x = negativos([6, 5, 8, 0, -2]);
console.log(x);

//12. Siempre hambriento - Crea una función que acepte un array e imprima (print) “yummy” cada vez que alguno de los valores sea “comida”. Si ningún valor es “comida”, entonces imprime “tengo hambre” una vez. 
function siempreHabriento(arr) {

    for (var i = 0; i < arr.length; i++) {
        if (arr[i] == "comida") {
            console.log("yummy");
        } else if (arr[i] != "comida") { //este tambiém pudiese ser reemplazado por un else y eliminar la condición establecida en esta línea, ya que si no se cmple la primera condición, esta automaticamente arojaria "tengo hambre"
            console.log("tengo hambre");
        }
    }

}
x = siempreHabriento(["comida", 5, "comida", 0, -2]); //ejemplo

//13. Cambiar hacia el centro -  Dado un array, cambia el primer y último valor, el tercero con el ante penútimo, etc. Ejemplo: cambiaHaciaElCentro([true, 42, “Ada”, 2, “pizza”]) cambia el array a [“pizza¨, 42, “Ada”, 2, true]. cambiaHaciaElCentro([1,2,3,4,5,6]) cambia el array a [6,2,4,3,5,1]. No es necesario devolver (return) el array esta vez. 

function cambiarAlCentro(arr) {

    for (var i = 0; i < arr.length / 2; i++) { //arr.length/2 es necesario porque, si tengo dos elementos para cambiar de posición, el cambio es solo una vez, si tuviese 4 elemeto, el cambios sería 2

        var temp = arr[i] //por lo general, establezco esta variable para cambiar el primer y último elemento de posición. Esta vez, establecí primeramente un looppara que repita esta acción cambiando los elementos de  posición
        arr[i] = arr[arr.length - 1 - i]; // es arr.lentgh -1-i porque partios de la base de cambiar desde el último valor hacia el centro del arreglo, representando la i las otras posicones del elemento
        arr[arr.length - 1 - i] = temp;
    }
    console.log(arr); //imprimo el nuevo arreglo
}
y = cambiarAlCentro([true, 42, 'Ada', 2, 'pizza']);

//14. Escala el Array - Dado un array arr y un número num, multiplica todos los valores en el array arr por el número num, y devuelve el array arr modificado. Por ejemplo, escalaArray([1,2,3], 3] debería devolver [3,6,9].
function escalaArray(arr, num) {
    for (var i = 0; i < arr.length; i++) {
        arr[i] = arr[i] * num;
    }
    return arr;
}
y = escalaArray([1, 2, 3], 3);
console.log(y);