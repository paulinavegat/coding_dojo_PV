//Parte 1

//Devuelve la suma de 1 a N. Por ejemplo,  Sum1toN(3) devolverá la suma de 1+2+3, la cual es 6
//sum1toN(255) devuelve la suma de todos los números de 1 a 255
function Sum1toN(n) {
    var sum = 0;
    for (var i = 1; i <= n; i++) {
        sum = sum + i;
    }
    return sum
}
y = Sum1toN(255);
console.log(y);

//devuelve la suma del primer y último número en el array
function sumFirstLast(arr) {
    var n1 = Number(arr[0]);
    var n2 = Number(arr[arr.length - 1]);
    return (n1 + n2);
}

y = sumFirstLast([1, 2, 3, 4, 5]);
console.log(y);

describe("Sum1toN", function() {
    it("should return 3 when we pass 2 as an argument", function() {
        expect(Sum1toN(2)).toEqual(3);
    });
    it("should return 6 when we pass 3 as an argument", function() {
        expect(Sum1toN(3)).toEqual(6);
    });
    it("should return 10 when we pass 4 as an argument", function() {
        expect(Sum1toN(4)).toEqual(10);
    });
});

describe("sumFirstLast", function() {
    it("should return 3 when we pass [1,2] as an argument", function() {
        expect(sumFirstLast([1, 2])).toEqual(3);
    });
    it("should return 10 when we pass [2,3,8] as an argument", function() {
        expect(sumFirstLast([2, 3, 8])).toEqual(10);
    });
    it("should return -10 when we pass [-6,23,3,-4] as an argument", function() {
        expect(sumFirstLast([-6, 23, 3, -4])).toEqual(-10);
    });
});


//Parte 2
//Ya sea en el mismo archivo o en uno diferente, crea una prueba o función que devuelva la suma del número más grande y el más pequeño del array.
// Por ejemplo, sumMaxMin([1,3,10]) debería devolver 10 + 1 = 11, y sumMaxMin([-2,-5,-10]) debería devolver -2 + -10 = -12. 
//Una vez que hayas escrito la prueba, ejecútala (sin escribir toda la función para asegurarte de que fallen todas las pruebas), luego completa la función cerciorándote de que pase todas las pruebas. 
function sumMaxMin(arr) {
    var Max = arr[0];
    var Min = arr[0];
    var sum = 0;

    for (var i = 1; i < arr.length; i++) {
        if (arr[i] > Max) {
            Max = arr[i];
        }
        if (arr[i] < Min) {
            Min = arr[i];
        }
        sum = Min + Max;
    }
    return sum;
}
y = sumMaxMin([1, 5, 10]);
console.log(y);


describe("sumMaxMin", function() {
    it("should return 7 when we pass [1,2,3] as an argument", function() {
        expect(sumMaxMin([1, 3, 6])).toEqual(7);
    });
    it("should return 10 when we pass [2,8,3] as an argument", function() {
        expect(sumMaxMin([2, 8, 3])).toEqual(10);
    });
    it("should return 17 when we pass [-6,23,3,-4] as an argument", function() {
        expect(sumMaxMin([-6, 23, -3, -4])).toEqual(17);
    });
});