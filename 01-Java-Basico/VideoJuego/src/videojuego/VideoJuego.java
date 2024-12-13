package videojuego;


public class VideoJuego {

    
    public static void main(String[] args) {
        
        VideoJuego[] juegos = new VideoJuego [5];
        
        
        juegos[0] = new VideoJuego("VJ001", "Super Mario 64", "Nintendo 64", 2, "Aventura");
        juegos[1] = new VideoJuego("VJ002", "The Legend of Zelda: Ocarina of Time", "Nintendo 64", 1, "Aventura");
        juegos[2] = new VideoJuego("VJ003", "Mario Kart 64", "Nintendo 64", 4, "Carreras");
        juegos[3] = new VideoJuego("VJ004", "Final Fantasy VII", "PlayStation", 1, "RPG");
        juegos[4] = new VideoJuego("VJ005", "Gran Turismo", "PlayStation", 2, "Simulación");
        
        
    }
    
}
