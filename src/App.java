import controllers.EmpleadoContoller;
import controllers.EmpleadoDAO;
import controllers.EmpleadoDAOHashMap;
import controllers.EmpleadoDAOTreeMap;
import controllers.Mapa;
import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExample();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjercicios();
    }

    private static void runEmpleadoExample() {
        EmpleadoDAO empleadoDAOHash = new EmpleadoDAOHashMap();
        EmpleadoContoller empleadoContoller = new EmpleadoContoller(empleadoDAOHash);

        EmpleadoDAO empleadoDAOTree = new EmpleadoDAOTreeMap();
        EmpleadoContoller empleadoContoller2 = new EmpleadoContoller(empleadoDAOTree);

        Empleado emp1 = new Empleado(5, "Pedro", "Dev");
        Empleado emp2 = new Empleado(3, "Juan", "Dev");
        Empleado emp3 = new Empleado(1, "Jose", "Dev");
        Empleado emp4 = new Empleado(2, "Pedro", "Dev");
        Empleado emp5 = new Empleado(4, "Pedro", "Dev");

        empleadoContoller.agregarEmpleado(emp1);
        empleadoContoller.agregarEmpleado(emp2);
        empleadoContoller.agregarEmpleado(emp3);
        empleadoContoller.agregarEmpleado(emp4);
        empleadoContoller.agregarEmpleado(emp5);

        empleadoContoller2.agregarEmpleado(emp1);
        empleadoContoller2.agregarEmpleado(emp2);
        empleadoContoller2.agregarEmpleado(emp3);
        empleadoContoller2.agregarEmpleado(emp4);
        empleadoContoller2.agregarEmpleado(emp5);

        empleadoContoller.listarEmpleados();
        empleadoContoller2.listarEmpleados();
    }
    
    private static void runMapExample() {
        Mapa mapa = new Mapa();
        mapa.ejemploConHashMap();
        mapa.ejemploConLinkedHashMap();
        mapa.ejemploConTreeMap();
    }

    private static void runEjercicios() {
    }
}