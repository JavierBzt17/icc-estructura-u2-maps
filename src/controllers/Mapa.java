package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import models.Empleado;

public class Mapa {
    public Mapa() {
    }

    public void ejemploConHashMap() {
        Map<String, String> capitales = new HashMap<>();
        capitales.put("Ecuador", "Quito");
        capitales.put("Peru", "Lima");
        capitales.put("Colombia", "Bogota");

        System.out.println("Mapa de capitales");
        for (String pais : capitales.keySet()){
            System.out.println("Pais: " + pais + ", Capital: " + capitales.get(pais));
        }

        // Ejemplo de acceso directo
        String capital = capitales.get("Ecuador");
        System.out.println("La capital de Ecuador es: " + capital);

        Map<Integer, Empleado> empleados = new HashMap<>();
        empleados.put(3, new Empleado(3, "Pedro", "Tester"));
        empleados.put(1, new Empleado(1, "Ana", "Dev"));
        empleados.put(2, new Empleado(2, "Luis", "Diseñador"));
        empleados.put(1, new Empleado(3, "Pedro", "Tester"));

        for (Map.Entry<Integer, Empleado> entry : empleados.entrySet()){
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        Map<Empleado, Integer> empleadosDos = new HashMap<>();
        Empleado emp1 = new Empleado(1, "Ana", "Dev");
        Empleado emp2 = new Empleado(2, "Pedro", "Dev");
        Empleado emp3 = new Empleado(3, "Ana", "Dev");
        Empleado emp4 = new Empleado(3, "Ana", "Dev");

        empleadosDos.put(emp1, 1000);
        empleadosDos.put(emp2, 1200);
        empleadosDos.put(emp3, 1500);
        empleadosDos.put(emp4, 2000);

        for (Map.Entry<Empleado, Integer> entry : empleadosDos.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

    public void ejemploConLinkedHashMap() {
        Map<String, Integer> productos = new LinkedHashMap<>();
        productos.put("Harina", 12);
        productos.put("Pan", 20);
        productos.put("Jugo", 10);

        System.out.println("Mapa de Productos");
        for (String cantidad : productos.keySet()){
            System.out.println("Producto: " + productos + ", Cantidad: " + productos.get(cantidad));
        }
    }

    public void ejemploConTreeMap(){
         TreeMap<Integer, String> personas = new TreeMap<>();
        personas.put(1, "Juan");
        personas.put(2, "Pedro");
        personas.put(3, "Pablo");
        personas.put(4, "Jose");
        personas.put(5, "Pepe");
        for(Integer cedula : personas.keySet()){
            System.out.println("Cedula: " + cedula + ", Nombre: " + personas.get(cedula));
        }

        Map<Empleado, Integer> empleadosDos = new TreeMap<>();
        Empleado emp1 = new Empleado(1, "Ana", "Dev");
        Empleado emp2 = new Empleado(2, "Pedro", "Dev");
        Empleado emp3 = new Empleado(3, "Ana", "Dev");
        Empleado emp4 = new Empleado(3, "Ana", "Dev");

        empleadosDos.put(emp1, 1000);
        empleadosDos.put(emp2, 1200);
        empleadosDos.put(emp3, 1500);
        empleadosDos.put(emp4, 2000);

        for (Map.Entry<Empleado, Integer> entry : empleadosDos.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}