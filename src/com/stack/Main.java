package com.stack;

import javax.xml.transform.Source;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Инициализация первого графа
        Arc arc1_graph1 = new Arc(0, "A", "B");
        Arc arc2_graph1 = new Arc(0, "A", "D");
        Arc arc3_graph1 = new Arc(0, "A", "C");
        Arc arc4_graph1 = new Arc(0, "B", "D");
        Arc arc5_graph1 = new Arc(0, "B", "E");
        Arc arc6_graph1 = new Arc(0, "B", "F");
        Arc arc7_graph1 = new Arc(0, "D", "E");
        Arc arc8_graph1 = new Arc(0, "C", "E");
        Arc arc9_graph1 = new Arc(0, "E", "F");
        ArrayList<Arc> listofArcs_graph1 = new ArrayList<Arc>();
        listofArcs_graph1.add(arc1_graph1);
        listofArcs_graph1.add(arc2_graph1);
        listofArcs_graph1.add(arc3_graph1);
        listofArcs_graph1.add(arc4_graph1);
        listofArcs_graph1.add(arc5_graph1);
        listofArcs_graph1.add(arc6_graph1);
        listofArcs_graph1.add(arc7_graph1);
        listofArcs_graph1.add(arc8_graph1);
        listofArcs_graph1.add(arc9_graph1);

        //Инициализация второго графа
        Arc arc1_graph2 = new Arc(0, "A", "C");
        Arc arc2_graph2 = new Arc(0, "A", "F");
        Arc arc3_graph2 = new Arc(0, "B", "C");
        Arc arc4_graph2 = new Arc(0, "C", "D");
        Arc arc5_graph2 = new Arc(0, "C", "E");
        Arc arc6_graph2 = new Arc(0, "C", "H");
        Arc arc7_graph2 = new Arc(0, "F", "E");
        Arc arc8_graph2 = new Arc(0, "G", "F");
        Arc arc9_graph2 = new Arc(0, "G", "H");
        ArrayList<Arc> listofArcs_graph2 = new ArrayList<Arc>();
        listofArcs_graph2.add(arc1_graph2);
        listofArcs_graph2.add(arc2_graph2);
        listofArcs_graph2.add(arc3_graph2);
        listofArcs_graph2.add(arc4_graph2);
        listofArcs_graph2.add(arc5_graph2);
        listofArcs_graph2.add(arc6_graph2);
        listofArcs_graph2.add(arc7_graph2);
        listofArcs_graph2.add(arc8_graph2);
        listofArcs_graph2.add(arc9_graph2);

        Graph graph1 = new Graph(listofArcs_graph1);
        Graph graph2 = new Graph(listofArcs_graph2);
        System.out.println("Все полные пути первого графа:");
        graph1.SearchAllPaths();
        System.out.println("----------");
        System.out.println("Все полные пути второго графа:");
        graph2.SearchAllPaths();

    }
}
