//Lista de características
// Evita que PacMan salga del laberinto o atraviese las paredes.
// ¡Cambia el mapa del mundo y haz el laberinto más interesante!
//Haz que aparezcan cerezas. Cereza = 50 pts.
//Haz que PacMan mire hacia arriba/abajo/izquierda/derecha dependiendo de la dirección en que se está moviendo.
//(Opcional). Haz que aparezca un fantasma (el fantasma no tiene que moverse todavía). Cuando PacMan toque al fantasma, haz que pierda una vida.
//(Opcional). Haz que el fantasma se mueva alrededor de forma aleatoria.
//(Opcional) ¡Haz que aparezcan 2 Pacmans y que se muevan! (Usa un teclado para mover los 2 PacMans)

var world = [
    [2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2],
    [2, 1, 1, 2, 1, 1, 1, 2, 1, 1, 3, 1, 2, 1, 2],
    [2, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 2],
    [2, 1, 1, 2, 1, 2, 1, 2, 1, 1, 1, 1, 2, 1, 2],
    [2, 1, 1, 2, 1, 2, 1, 2, 1, 1, 1, 1, 2, 1, 2],
    [2, 1, 1, 2, 3, 2, 1, 1, 1, 2, 2, 2, 2, 1, 2],
    [2, 1, 1, 2, 2, 2, 1, 1, 1, 2, 1, 1, 1, 1, 2],
    [2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2],
    [2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2],
    [2, 1, 1, 2, 2, 2, 1, 1, 1, 1, 1, 2, 2, 2, 2],
    [2, 1, 1, 2, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 2],
    [2, 1, 1, 2, 1, 2, 2, 2, 2, 2, 2, 2, 1, 1, 2],
    [2, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 2],
    [2, 1, 1, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 2],
    [2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 1, 1, 2],
    [2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2],
    [2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2],
];

var puntaje = 0;
var vida = 3;
var pacman = {
    x: 1,
    y: 1
}
var ghost = {
    x: 6,
    y: 5
};

var puntaje = 0;

world[pacman.x][pacman.y] = 0;

function displayWorld() {
    var output = "";

    for (var i = 0; i < world.length; i++) {
        output += "\n<div class='row'>\n";
        for (var j = 0; j < world[i].length; j++) {
            if (world[i][j] === 2) {
                output += "<div class='brick'></div>";
            } else if (world[i][j] === 1) {
                output += "<div class='coin'></div>";
            } else if (world[i][j] === 0) {
                output += "<div class='empty'></div>";
            } else if (world[i][j] === 3) {
                output += "<div id='cereza'></div>";
            }
        }
        output += "\n</div>";
    }
    //console.log(output);
    document.getElementById("world").innerHTML = output;
}

function displayGhost() {
    document.getElementById("ghost").style.top = ghost.y * 20 + "px";
    document.getElementById("ghost").style.left = ghost.x * 20 + "px";
}

function displayPacman() {
    document.getElementById("pacman").style.top = pacman.y * 20 + "px";
    document.getElementById("pacman").style.left = pacman.x * 20 + "px";
}

function displayPuntaje() {
    document.getElementById("puntaje").innerHTML = puntaje;
}

function displayVida() {
    document.getElementById("vida").innerHTML = vida;
}


displayGhost();
displayVida();
displayPuntaje();
displayWorld();
displayPacman();

document.addEventListener("keydown", function(event) {
        console.log(event);
        //  var tecla = event.key;
        if (event.key === "ArrowUp" && world[pacman.y - 1][pacman.x] !== 2) {
            pacman.y--;
        } else if (
            event.key === "ArrowDown" &&
            world[pacman.y + 1][pacman.x] !== 2
        ) {
            pacman.y++;
        } else if (
            event.key == "ArrowRigth" &&
            world[pacman.y][pacman.x + 2] !== 2
        ) {
            pacman.x++;
        } else if (
            event.key === "ArrowLeft" &&
            world[pacman.y][pacman.x - 1] !== 2
        ) {
            pacman.x--;
        }
        if (world[pacman.y][pacman.x] === 1) {
            puntaje += 10;
            world[pacman.y][pacman.x] = 0;
            displayWorld();
            displayPuntaje();
        } else if (world[pacman.y][pacman.x] === 3) {
            puntaje += 50;
            world[pacman.y][pacman.x] = 0;
            displayWorld();
            displayPuntaje();
        } else if (pacman.y == ghost.y && pacman.x === ghost.x) {
            vida--;
            displayVida();
        }
        displayPacman();
        console.log(pacman);
    },
    true
);