package uk.ac.cam.lxp20.supo3;

import uk.ac.cam.lxp20.supo2.AccessModifiers.A;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class TextReader {
    public static void main(String[] args) {
        File file = new File("TextReader.txt");
        ArrayList<Line> lines = new ArrayList<>();
        try {
            InputStream is = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine()) != null){
                lines.add(new Line(line.split(",")));
            }
            Collections.sort(lines);
            for (Line l: lines){
                System.out.print(l.getFirst());
                System.out.print(",");
                System.out.println(l.getSecond());
            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}

class Line implements Comparable{
    int first;
    int second;
    Line(String[] strings){
        this.first = Integer.parseInt(strings[0]);
        this.second = Integer.parseInt(strings[1]);
    }
    @Override
    public int compareTo(Object o){
        Line other = (Line)o;
        if (other.first == first){
            return second - other.second;
        }
        return  first - other.first;
    }

    int getFirst(){return first;}
    int getSecond(){return second;}
}
