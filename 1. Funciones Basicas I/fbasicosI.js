//ejercicio 1												
function a() { // predicción 35; output 35							
    return 35;
}
console.log(a())

//ejercicio 2													
function a() { //predicción 8; output 8							
    return 4;
}
console.log(a() + a());

//ejercicio 3												
function a(b) { //predicción 6; output 6							
    return b;
}
console.log(a(2) + a(4)); //2+4=6											

//ejercicio 4													
function a(b) {
    console.log(b); //imprimo el valor de b											
    return b * 3; //3*3									
}
console.log(a(3)); // predicción 3,9; output 3,9											

//ejercicio 5													
function a(b) {
    return b * 4; //40										
    console.log(b); // el "return" da por terminada la función, no puede haber un console.log dentro de la función despues de un return.									
}
console.log(a(10)); // imprimo el valor	devuelto por la función	--predicción y output 40									

//ejercicio 6													
function a(b) {
    if (b < 10) { //15 menor que 10? no, por lo tanto devuelve 4										
        return 2;
    } else {
        return 4;
    }
    console.log(b); // el "return" da por terminada la función, no puede haber un console.log dentro de la función después de un return.										
}
console.log(a(15)); // Imprimo el valor devuelto por la función										


//ejercicio 7
function a(b, c) {
    return b * c; //3*10=30;						
}
console.log(10, 3); //no hay llamado a la funcion, solo imprimir estos valores												
console.log(a(3, 10)); //imprimir valor devuelto por la función= 30		
// predicción y output 10,3,30									


//ejercicio 8												
function a(b) {
    for (var i = 0; i < 10; i++) {
        console.log(i);
    }
    return i;
}
console.log(3);
console.log(4);
//no hay llamado a la función así que imrimo los valores de las dos últimas líneas												


//ejercicio 9												
function a() {
    for (var i = 0; i < 10; i++) { //	i= 0>3>6>9>12 ;	i+2	2>5>8>11		
        i = i + 2;
        console.log(i); //imprimo valores que toma i luego de cumplir la condición											
    }
}
a(); //llamado a la función
// predicción y output 2,5,8,11


//ejercicio 10								var	value			
function a(b, c) { //b=0 , c=10									
    for (var i = b; i < c; i++) { // i=0>1>2>3>4>5>6>7>8>9>10											
        console.log(i); //imprimo los valores de la var i mientras cumpla la función 										
    }
    return b * c; //termina la función con valor 0; 0*10											
}
a(0, 10); //llamado a la función												
console.log(a(0, 10));
//output 0, 1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0



//ejercicio 11												
function a() { //no hay llamado a la funcion, por lo tanto, no hay output								
    for (var i = 0; i < 10; i++) {
        for (var j = 0; j < 10; j++) {
            console.log(j);
        }
        console.log(i);
    }
}

//ejercicio 12												
function a() { //no hay llamado a la funcion, por lo tanto, no hay output							
    for (var i = 0; i < 10; i++) {
        for (var j = 0; j < 10; j++) {
            console.log(i, j);
        }
        console.log(j, i);
    }
}

//ejercicio 13												
var z = 10;

function a() {
    var z = 15; //no hay llamado a la funcion, solo imprimo el valor de la var z que esta fuera de la función									
    console.log(z);
}
console.log(z);
//predicción y output 10


//ejercicio 14												
var z = 10;

function a() {
    var z = 15;
    console.log(z); //imprimo el valor devuelto por la función = 15											
}
a(); //llamado a la funcion										
console.log(z); //imprimir valor de la var z=10										
//output 15, 10												


//ejercicio 14												
var z = 10;

function a() {
    var z = 15;
    console.log(z); //imprimo la var z de la funcion 15										
    return z;
}
z = a(); //la Z es el valor returned por a funcion ejecutada										
console.log(z); //	imprimo el valor de la var z que entrega la función										
//output 15,15