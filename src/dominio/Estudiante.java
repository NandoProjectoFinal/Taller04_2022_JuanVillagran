package dominio;

public class Estudiante {
    private String Nombre;
    private String Correo;
    private int rut;

    public String getNombre() {
        return Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public int getRut() {
        return rut;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }
}