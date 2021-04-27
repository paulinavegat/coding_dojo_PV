var users = [{ name: "Michael", age: 37 }, { name: "John", age: 30 }, { name: "David", age: 27 }];
//var users= [0,1,2]

//como es un arreglo, debo tener claro cual es la posición de cada elemento en este caso, usuarios.

console.log(users[1].age); //¿Cómo harías print/log de la edad de John?. User en posicion 1 del arreglo y traigo el atributo

console.log(users[0].name); // ¿Cómo harías print/log del nombre del primer objeto? User en la posicion 0 del arreglo y traigo el atributo

//¿Cómo harías print/log del nombre y la edad de cada usuario utilizando un for loop? 
for (var i = 0; i < users.length; i++) {
    console.log(users[i].name, "-", users[i].age);
}

//¿Cómo harías para imprimir el nombre de los mayores de edad?
function findMayordeEdad() {
    var users = [{ name: "Michael", age: 37 }, { name: "John", age: 30 }, { name: "David", age: 27 }];
    var min = 18;
    for (var i = 0; i < users.length; i++) {
        //condición si el usario tiene igual o mas de la edad minima, imprimira su valor
        //  if (users[i].age >= min) {
        //      console.log(users[i].name);
        // } else{
        //	console.log("Menor de edad"); //sino cumple la condición imprirá menor de edad.			
        //}
        var resultado = (users[i].age >= min) ? users[i].name : "Menor de edad";
        console.log(resultado);
    }
}
y = findMayordeEdad();