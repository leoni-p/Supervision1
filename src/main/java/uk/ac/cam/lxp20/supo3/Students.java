package uk.ac.cam.lxp20.supo3;

import java.util.*;
import java.util.stream.Collectors;


public class Students {
    TreeMap<String,Double> marks;

    Students(){
        marks = new TreeMap();
    }

    Students(Map<String, Double> elements){
        marks = new TreeMap(elements);
    }

    void add(String key, Double value){
        marks.put(key,value);
    }

    List<String> listStudents(){
        return new ArrayList<String>(marks.keySet());
    }

    List<String> topByPercent(Double percent){
        List<Double> elements = marks.values().stream().sorted().collect(Collectors.toList());
        elements.add(101.0);
        double min = elements.get((int)Math.round((100 - percent)*marks.size()*0.01));
        ArrayList<String> result = new ArrayList<>();

        for (String key: marks.keySet()){
            if (marks.get(key) >= min){ result.add(key);}
        }
        return result;
    }

    Double median(){
        List<Double> values = marks.values().stream().collect(Collectors.toList());
        return (marks.size()%2 == 0) ? (values.get(Math.floorDiv(marks.size(), 2)) + values.get(Math.floorDiv(marks.size(), 2)-1))/2 : values.get(marks.size()/2);

    }

    public static void main(String[] args) {
        Students s = new Students();
        s.add("Student 2",50.0);
        s.add("Student 1",60.0);
        s.add("Student 3",40.0);
        s.add("Student 4",30.0);
        s.add("Student 5",20.0);
        System.out.println(s.listStudents());
        System.out.println(s.topByPercent(50.0));
        System.out.println(s.topByPercent(80.0));
        System.out.println(s.median());
    }

}
