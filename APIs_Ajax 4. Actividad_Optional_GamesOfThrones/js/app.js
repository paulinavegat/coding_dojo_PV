$("img").hover(
    //para que se ejecuten cuando el puntero del mouse entra y sale de los elementos seleccionados.
    function() {
        $(this).fadeTo("fast", 0.5); //nivel de opacidad, en este caso que se opaque en un 50%
    },
    function() {
        $(this).fadeTo("fast", 1); //nivel de opacidad, en este caso que vuelva a su 100%
    }
);
$("#detalle").hide(); // ocultar el cuadro de información
$("img").click(function() {
    $("#detalle").show("fast");
    var house = $(this).attr("data");
    $.get(
        "https://www.anapioficeandfire.com/api/houses/" + house,
        function(info) {
            console.log(info);
            var region = info.region;
            var name = info.name;
            var words = info.words;
            if (words === "") {
                words = "No aplica";
            }
            var titles = ""; //los titles son un array
            for (var i = 0; i < info.titles.length - 1; i++) {
                titles += info.titles[i] + ", ";
            }
            for (var y = info.titles.length - 1; y < info.titles.length; y++) {
                titles += info.titles[y];
            }
            var display = `<h2>House Details</h2>
            <p><b>Name:</b> ${name}</p>
            <p><b>Region:</b> ${region}</p>
            <p><b>Words:</b> ${words}</p>
            <p><b>Titles:</b> ${titles}</p>`;
            $("#detalle").html(display);
        },
        "json"
    );
    return false;
});