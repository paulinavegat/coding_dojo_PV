//1. Dados un array y un valor Y, cuenta e imprime (print) el número de valores del array que sean mayores que Y. 								

function greaterY(arr, Y) {
    var count = 0;
    for (var i = 0; i < arr.length; i++) {
        if (arr[i] > Y) {
            count++;
        }
    }
    return count;
}

Y = greaterY([1, 2, 5, 7], 1); // ejemplos, OUTPUT = 3					
console.log(Y);

//2. Dado un array, imprime los valores máximos (max), mínimos (min) y promedio (average) para el array. 								

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

//3. Dado un array de números, crea una función que dé como resultado un nuevo array donde los valores negativos se reemplacen por el texto (string) ‘Dojo’. Por ejemplo, reemplazarNegativos([1,2,-3,-5,5]) debiera devolver [1,2, “Dojo”, “Dojo”, 5].								

function nonegativos(arr) {
    for (var i = 0; i < arr.length; i++) {
        if (arr[i] < 0) {
            arr[i] = "Dojo";
        }
    }
    return arr;
}
console.log(nonegativos([1, -2, -9])); //ejemplo, OUTPUT = [1,"Dojo","Dojo"]			

//4. Dado un array y su respectivo índice, remueve los valores en el rango del índice dado( acortando el array). Por ejemplo, removerRango([20,30,40,50,60,70],2,4)debiera devolver [20,30,70].								

function RemoverRango(arr, a, b) {

    arr.splice(a, (b - a + 1))
    return arr;
}

console.log(RemoverRango([20, 30, 40, 50, 60, 70], 2, 4));