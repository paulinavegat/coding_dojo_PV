function calcular() {
    var num1 = parseInt(document.getElementById("num1").value);
    var num2 = parseInt(document.getElementById("num2").value);
    var op = document.getElementById("operacion").value;
    var resultado;


    if (op == "+") {
        resultado = num1 + num2;
    } else if (op == "-") {
        resultado = num1 - num2;
    } else if (op == "*") {
        resultado = num1 * num2;
    } else if (op == "/") {
        resultado = num1 / num2;
    }
    //console.log(resultado);
    document.querySelector('#resultados').innerHTML = resultado;
}