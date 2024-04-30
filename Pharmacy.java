package pharmacy;

import java.util.*;

public class Pharmacy implements Iterator<Component>, Iterable<Component> {
    private int index;
    private final List<Component> components;
    private String name;

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }

    public Pharmacy() {
        this.index = 0;
        this.components = new ArrayList<>();

    }


    public void addComponents(Component ... components) {

        if(components.length == 0) System.out.println("Вы ничего не добавили!");
        else  Collections.addAll(this.components, components);
    }
    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    public int compareTo(Component o) {
        return Integer.compare(o.hashCode(), this.hashCode());
    }
    @Override
    public Component next() {
        //component c =  components.get(index);
        //index++;
        //return c;

        return components.get(index++);
    }
    public List<Component> getComponents() {
        return components;
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "index=" + index +
                ", components=" + components +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy pharmacy = (Pharmacy) o;
        return index == pharmacy.index && Objects.equals(components, pharmacy.components);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, components);
    }

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            @Override
            public boolean hasNext() {
                return index <components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }
}
