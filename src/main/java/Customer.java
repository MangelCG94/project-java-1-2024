public class Customer {
    private final Long id;
    private String nombre, apellido, email;
    private int edad;
    
    private static Long total = 0L;

    public Customer(String nombre, String apellido, String email, int edad) {
        total++;
        this.id = total;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.edad = edad;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return id + "\t" + nombre + "\t" + apellido + "\t" + email;
    }
}