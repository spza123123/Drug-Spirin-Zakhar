package pharmacy;

import java.util.*;

public class PharmacyMain {
    public static void main(String[] args) {
        Component piniceline = new Component("Piniceline","10mg", 100);
        Component salt = new Component("Salt", "25mg", 10);
        Component sugar = new Component("Sugar", "87gr", 80);
        Component sugar2 = new Component("Sugar", "87gr", 80);
        Pharmacy pharmacy1 = new Pharmacy();
        pharmacy1.addComponents(salt,piniceline);

        Pharmacy pharmacy2 = new Pharmacy();
        pharmacy2.addComponents(salt,piniceline);
        //pharmacy2.addComponents(sugar, piniceline);
        Iterator<Component> iterator = pharmacy2;
//        System.out.println(sugar2.hashCode());
//        System.out.println(sugar.hashCode());
        System.out.println("-----------");

        Set<Pharmacy> list = new HashSet<>();

        Pharmacy first = new Pharmacy();
        first.addComponents(salt,piniceline);
        Pharmacy second = new Pharmacy();
        second.addComponents(salt,piniceline);
        list.add(first);
        list.add(second);
        list.add(second);
        list.add(pharmacy2);


        System.out.println(list.size());
        System.out.println(list);
        System.out.println();
        for(Pharmacy p : list) {
            System.out.println(p.getName() + p.getComponents());
        }
    }
}
