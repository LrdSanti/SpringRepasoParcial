package repaso.com.demo.models.entity;

import jakarta.validation.constraints.NotEmpty;

public class Contactar {
    
    @NotEmpty(message = "El nombre no puede estar vacio")
    private String nombre;
    @NotEmpty
    private String correo;
    @NotEmpty
    private String mensaje;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    

    

}
