package tp1.ejercicio3;

public class Estudiante {
    String nombre;
    String apelido;
    String comision;
    String direccion;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApelido() {
        return apelido;
    }
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    public String getComision() {
        return comision;
    }
    public void setComision(String comision) {
        this.comision = comision;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String tusDatos() {
        return "Estudiante [nombre=" + nombre + ", apelido=" + apelido + ", comision=" + comision + ", direccion="
                + direccion + "]";
    }



    
}
