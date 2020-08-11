import javax.persistence.*;

@Entity
@Table(name = "alumno")
public class Alumno {
    

    @Id
    @Column(name = "id")
    private int alumnoId;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "nombre2")
    private String apellido;

    public Alumno(int alumnoId, String nombre, String apellido) {
        this.alumnoId = alumnoId;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getAlumnoId() {
        return this.alumnoId;
    }

    public void setAlumnoId(final int alumnoId) {
        this.alumnoId = alumnoId;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(final String apellido) {
        this.apellido = apellido;
    }


    @Override
    public String toString() {
        return ("Soy clase alunmo");
    }

}