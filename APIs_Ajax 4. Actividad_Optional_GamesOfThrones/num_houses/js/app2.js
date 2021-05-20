//JAVASCRIPT PURO de esta forma entender la lógica para traer los elementos al HTML
//NECESITO TRAER LOS NUMEROS DE HOUSES Y DE ESTA FORMA TRAER LOS DATOS DE CADA HOUSE REQUERIDA

function obtenerDatos() {
    var NHouses = `https://www.anapioficeandfire.com/api/houses/`;
    N = 444; // revisando un aproximado de número de paginas, hasta que llegué a la última que me entrego
    // el ultimo numero de casa, https: //www.anapioficeandfire.com/api/houses/?page=2
    for (var i = 1; i <= N; i++) {
        // realizo un for para obtener los valores de cada "house"
        link = NHouses + i;

        var api = new XMLHttpRequest(); // crea un nuevo objeto que se guarda  en esa variable
        api.onreadystatechange = function() {
            // metodo
            if (this.status == 200 && this.readyState == 4) {
                //4: solicitud finalizada y respuesta lista, 200:0k
                var datos = JSON.parse(this.responseText); //para recibir la información desde el webserver como string
                // console.log(datos);
                //console.log(datos.url);
                //console.log(datos.name);

                var pagina = document.querySelector("#pagina");
                pagina.innerHTML += `<li>${datos.url}: ${datos.name}</li>`;
            }
        };
        api.open("GET", link, true); //solicitamos el request
        api.send();
    }
}

// enJquery sería algo como lo siguiente:

/* $(document).ready(function() {
            $("#info").click(function() {
                var NHouses =
                    "https://www.anapioficeandfire.com/api/houses/";
                N = 444; //https://www.anapioficeandfire.com/api/houses/?page=2
                for (var i = 1; i <= N; i++) {
                    link = Nhouses + i;

                    $.ajax({url: link,
                        success: function(datos) {
                            //console.log(datos);
                            $("#pagina").append("<li>" + datos.url + ": " +  datos.name +  "</li>" );
                        },
                        dataType: "json",
                        async: true,
                        method: "GET",
                    });
                }
            });
        });*/