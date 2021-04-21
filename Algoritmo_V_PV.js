//1. Configura un array para que los valores negativos se transformen en 0. Por ejemplo, resetNegativos([1,2,-1,-3]) debiera dar como resultado [1,2,0,0].										
function resetNeg(arr) {
    for (var i = 0; i < arr.length; i++) {
        if (arr[i] < 0) {
            arr[i] = 0;
        }
    }
    return arr;
}
y = resetNeg([1, 2, -1, -3]); //ejemplo					
console.log(y);

//.2 Dado un array, mueve todos los valores un espacio de derecha a izquierda eliminando el primer valor y dejando un 0 para el último valor. Por ejemplo, moverAdelante([1,2,3]) debiera dar como resultado [2,3,0].																		

function moverAdelante(arr) {
    for (var i = 1; i < arr.length; i++) {
        arr[i - 1] = arr[i];
    }
    arr[arr.length - 1] = 0;
    return arr;
}

y = moverAdelante([1,  2,  3]); //ejemplo
console.log(y);

//3. Configura un array para que el resultado sean los valores en el orden contrario. Por ejemplo, returnReverso([1,2,3]) debe dar [3,2,1].										


function returnReverso(arr) {
    var temp = arr[0];
    arr[0] = arr[arr.length - 1]
    arr[arr.length - 1] = temp;
    return arr;
}
y = returnReverso([1, 2, 3]); //ejemplo	
console.log(y);


//4. Crea una función que cambie un array repitiendo sus valores originales (manteniendo el mismo orden). Por ejemplo, repetirValores([4,”Ulysses”, 42, false]) debiera dar [4,4, “Ulysses”, “Ulysses”, 42, 42, false, false].										

function repetirValores(arr) {

    var newArr = [];
    for (var i = 0; i < arr.length; ++i) {
        newArr.push(arr[i]);
        newArr.push(arr[i]);
    }
    return newArr;
}

y = repetirValores([4, 'Ulysses', 42, false]);
console.log(y);