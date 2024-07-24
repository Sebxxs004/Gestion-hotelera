package Clases;

public class Usuario {
    private String Nombre;
    private String Apellido;
    private String Email;
    private String Cedula;

    public Usuario(String Nombre, String Apellido, String Email, String Cedula) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Email = Email;
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Email=" + Email + ", Cedula=" + Cedula + '}';
    }
    
}
