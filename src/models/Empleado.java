package models;

public class Empleado implements Comparable<Empleado>{
    private int id;
    private String name;
    private String position;

    public Empleado(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "\nID: " + id + ", \nNombre: " + name + ", \nPosition: " + position;
    }

    @Override
    public int compareTo(Empleado o) {
        int positionComparison = this.position.compareTo(o.position);

        if (positionComparison == 0) {
            return this.name.compareTo(o.name);
        }
        return positionComparison;
    }
}