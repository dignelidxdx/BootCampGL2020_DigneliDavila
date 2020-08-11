

import java.util.List;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;

public class ExampleApplication {

    private static Logger LOGGER = LoggerFactory.logger(ExampleApplication.class);

    public static void main(String[] args) {

        AlumnoDAO alumnoDao = new AlumnoDAO();
        alumnoDao.createAlumno(new Alumno(1, "Jose", "Perez"));
        alumnoDao.createAlumno(new Alumno(2, "Esteban ", "Quito"));
        alumnoDao.createAlumno(new Alumno(3, "Ulrica ", "Godofreda"));

        List<Alumno> alumnos = alumnoDao.getAlumnos();
        LOGGER.info("Todos los alumnos: {}");
        
        Alumno alumnoCorregido =alumnos.get(1);
        alumnoCorregido.setNombre("Estefano");
        alumnoDao.updateAlumno(alumnoCorregido);
        LOGGER.info("Alumnos corregidos: {}",(Throwable) alumnoDao.getAlumnos());

        alumnoDao.removeAlumno(alumnoDao.getAlumnos("Jose", "Perez").get(1));
        LOGGER.info("Alumnos filtrados: {}", (Throwable) alumnoDao.getAlumnos());

        

    }

    
}