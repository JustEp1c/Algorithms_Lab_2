package com.stack;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Graph {

    ArrayList<Arc> listOfArcs;

    public Graph(ArrayList<Arc> listOfArcs) {
        this.listOfArcs = listOfArcs;
    }

    public  void ADD_Arc(Arc newArc) {

        listOfArcs.add(newArc);
    }

    public ArrayList<String> getVertexes(String vertex1) {
        ArrayList<String> listOfVertexes = new ArrayList<>();
        for (Arc arc : listOfArcs) {

            if (arc.getVertex1().equals(vertex1)) {
                listOfVertexes.add(arc.getVertex2());
            }
        }
        return listOfVertexes;
    }

    public void  SearchPathsFromOneVertex(String vertex1, String vertex2, String s) {
        s += vertex1 + " -> ";

        if (vertex1.equals(vertex2)) {
            System.out.println(s.substring(0, s.length() - 4));
            return;
        }
        ArrayList<String> listOfVertexes = this.getVertexes(vertex1);
        if (listOfVertexes.size() == 0) {

            return;
        }
        for (String vertex : listOfVertexes) {
            SearchPathsFromOneVertex(vertex, vertex2, s);
        }

    }

    public ArrayList<String> findStocks() {
        //int count = 0;
        ArrayList<String> stockVertexes = new ArrayList<>();
        for (Arc arc : listOfArcs) {
            int count = 0;
            for (Arc arcVertex : listOfArcs) {

                if (!arcVertex.getVertex1().equals(arc.getVertex2())) {

                    count++;
                }
            }
            if (count == listOfArcs.size()) {
                stockVertexes.add(arc.getVertex2());
            }
        }
        return (ArrayList<String>) stockVertexes.stream().distinct().collect(Collectors.toList());
    }


    public  void SearchAllPaths() {
        //String stockVertex = findStock();
        ArrayList<String> vertexes = new ArrayList<>();
        int findStocksSize = findStocks().size();
        for (int i = 0; i < findStocksSize; i++) {
            SearchPathsFromOneVertex(listOfArcs.get(0).getVertex1(), findStocks().get(i), "");
        }
        vertexes.add(listOfArcs.get(0).getVertex1());
        for (int i = 1; i <= listOfArcs.size()-1; i++) {
            boolean flag = false;
            for (String vertex : vertexes) {
                if (listOfArcs.get(i).getVertex1().equals(vertex)) {
                    flag = true;
                    break;
                }
            }
            vertexes.add(listOfArcs.get(i).getVertex1());
            if (!flag) {
                for (int j = 0; j < findStocksSize; j++) {
                    SearchPathsFromOneVertex(listOfArcs.get(i).getVertex1(), findStocks().get(j), "");
                }
            }
        }
    }

}
