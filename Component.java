package pharmacy;

import java.util.Objects;

public class Component implements Comparable<Component>{
    private String name;
    private String weight;
    private int power;
    private int index;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;

    }
    public String getName() {
        return name;
    }

    public String getWeight() {
        return weight;
    }

    public int getPower() {
        return power;
    }

    public int getIndex() {
        return index;
    }
    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", power=" + power +
                ", index=" + index +
                '}';
    }

    @Override
    public int compareTo(Component o) {
        return Integer.compare(this.power, o.power);
        //if(this.power > o.power) return -1;
//        if(this.power < o.power) return 1;
//        return 0;
    }

}
