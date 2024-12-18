package videojuego;


public class VideoJuego {

    
    

    
    public class Main {
    public static void main(String[] args) {
        // Crear un vector de VideoJuegos que puede almacenar 5 videojuegos
        Vjuego[] juegos = new Vjuego[5];

        // Crear 5 videojuegos y guardarlos en el vector
        juegos[0] = new Vjuego("VJ001", "Super Mario 64", "Nintendo 64", 2, "Aventura");
        juegos[1] = new Vjuego("VJ002", "The Legend of Zelda: Ocarina of Time", "Nintendo 64", 1, "Aventura");
        juegos[2] = new Vjuego("VJ003", "Mario Kart 64", "Nintendo 64", 4, "Carreras");
        juegos[3] = new Vjuego("VJ004", "Final Fantasy VII", "PlayStation", 1, "RPG");
        juegos[4] = new Vjuego("VJ005", "Gran Turismo", "PlayStation", 2, "Simulación");

        // Recorrer el vector y mostrar los títulos, consola y cantidad de jugadores
        System.out.println("Información de los videojuegos:");
        for (Vjuego juego : juegos) {
            juego.mostrarInfo();
        }

        // Cambiar el nombre y la cantidad de jugadores de dos videojuegos
        juegos[1].setTitulo("The Legend of Zelda: Majora's Mask");
        juegos[1].setCantidadJugadores(2);

        juegos[3].setTitulo("Final Fantasy IX");
        juegos[3].setCantidadJugadores(2);

        // Mostrar los datos después del cambio
        System.out.println("\nInformación después del cambio:");
        for (Vjuego juego : juegos) {
            juego.mostrarInfo();
        }

        // Recorrer el vector y mostrar únicamente los videojuegos de "Nintendo 64"
        boolean encontrado = false;
        System.out.println("\nVideojuegos de la consola 'Nintendo 64':");
        for (Vjuego juego : juegos) {
            if (juego.getConsola().equals("Nintendo 64")) {
                juego.mostrarInfo();
                encontrado = true;
            }
        }

        // Si no se encontró ningún videojuego de "Nintendo 64", informar al usuario
        if (!encontrado) {
            System.out.println("No se encontraron videojuegos para la consola 'Nintendo 64'.");
        }
    }
}

           


}
