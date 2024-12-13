
package logica;

public class VideoJuego {

    String codigo;
    String titulo;
    String consola;
    int cantjugadores;
    String categoria;

    public VideoJuego() {
    }
    
    
    

    public VideoJuego(String codigo, String titulo, String consola, int cantjugadores, String categoria) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.consola = consola;
        this.cantjugadores = cantjugadores;
        this.categoria = categoria;
    }
    
    
    
    
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public int getCantjugadores() {
        return cantjugadores;
    }

    public void setCantjugadores(int cantjugadores) {
        this.cantjugadores = cantjugadores;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
    
    
    
    
}
