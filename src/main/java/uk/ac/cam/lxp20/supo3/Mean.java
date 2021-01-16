package uk.ac.cam.lxp20.supo3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Mean {

    static double ForLoopMean(List<Integer> elements) {
        double total = 0;
        for (int i =0; i<elements.size(); i++) {
            total += elements.get(i);
        }
        return total/ elements.size();
    }

    static double ForEachMean(List<Integer> elements) {
        double total = 0;
        for (int i: elements) {
            total += i;
        }
        return total/elements.size();
    }

    static double IteratorMean(List<Integer> elements) {
        Iterator<Integer> it = elements.iterator();
        double total = 0;
        while (it.hasNext()) {
            total += it.next();
        }
        return total/ elements.size();
    }

    public static void main(String[] args) {
        List<Integer> l = new ArrayList(List.of(10,2,5,2,3,7));
        System.out.println(Mean.ForLoopMean(l));
        System.out.println(Mean.ForEachMean(l));
        System.out.println(Mean.IteratorMean(l));
    }


}
