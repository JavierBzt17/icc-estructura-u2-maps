import controllers.EmpleadoContoller;
import controllers.EmpleadoDAO;
import controllers.EmpleadoDAOHashMap;
import controllers.EmpleadoDAOTreeMap;
import controllers.Mapa;
import models.Empleado;
import controllers.Ejercicios;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos.
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
        Ejercicios ejercicios = new Ejercicios();

        System.out.println("\n Comprobando anagramas:");
        System.out.println("¿'roma' y 'amor' son anagramas?: " + ejercicios.sonAnagramas("roma", "amor"));
        System.out.println("¿'hello' y 'bello' son anagramas?: " + ejercicios.areAnagrams("hello", "bello"));
        System.out.println("¿'triangle' y 'integral' son anagramas?: " + ejercicios.areAnagrams("triangle", "integral"));

        System.out.println("\n Sumatorias:");
        int[] numsA = {9, 2, 3, 6};
        int[] resultadoA = ejercicios.sumatoriaDeDos(numsA, 5);
        System.out.println("Resultado sumatoria A (objetivo 5): " + Arrays.toString(resultadoA));

        int[] resultadoB = ejercicios.sumatoriaDeDos(numsA, 10);
        System.out.println("Resultado sumatoria B (objetivo 10): " + Arrays.toString(resultadoB));

        System.out.println("\n Frecuencia de caracteres:");
        System.out.print("Cadena 'hola': ");
        ejercicios.contarCaracteres("hola");

        System.out.print("Cadena 'banana': ");
        ejercicios.contarCaracteres("banana");
    }
}
