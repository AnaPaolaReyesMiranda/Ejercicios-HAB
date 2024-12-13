package logica;

import java.time.LocalDate;


public class Persona {
    
    //atributos en minuscula
    int id_personal;
    String nombre;
    String apelido;
    LocalDate fecha_nac;
    String direccion;
    
    //metodos
    //constructores  mayusculas
    public Persona() {
    
    }
    
    public Persona(int id_personal, String nombre, String apelido, LocalDate fecha_nac, String direccion) {
        this.id_personal = id_personal;
        this.nombre = nombre;
        this.apelido = apelido;
        this.fecha_nac = fecha_nac;
        this.direccion = direccion;
    }
    
    //getters y setters

    public int getId_personal() {
        return id_personal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApelido() {
        return apelido;
    }

    public LocalDate getFecha_nac() {
        return fecha_nac;
    }

    public String getDireccion() {
        return direccion;
    }

    
    
    
    
    public void setId_personal(int id_personal) {
        this.id_personal = id_personal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setFecha_nac(LocalDate fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    

    

    
    
}
