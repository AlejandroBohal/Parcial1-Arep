package edu.escuelaing.arep.calculator;

import com.google.gson.Gson;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Calculator {
    BubbleSort bubbleSort = new BubbleSort();
    public  Calculator(){

    }
    public double calculateMean(LinkedList<Double> data){
        double answer = 0.0;
        for(double node: data){
            answer += node;
        }
        answer = answer/data.size();
        return answer;
    }
    public double calculateSum(LinkedList<Double> data){
        double answer = 0.0;
        for(double node: data){
            answer += node;
        }
        return answer;
    }
    public String calculate(String data){
        LinkedList<Double> dataDouble = convertToLinkedList(data);
        bubbleSort.bubbleSort(dataDouble);
        double mean = calculateMean(dataDouble);
        double meanR = Math.round(mean*100.0)/100.0;
        double sum = calculateSum(dataDouble);
        double sumR = Math.round(sum*100.0)/100.0;
        Gson gson = new Gson();
        String orderedNumbers= gson.toJson(dataDouble);
        return "{\"numbers\":"+orderedNumbers+",\"mean\":"+meanR+",\"sum\":"+sumR+"}";
    }
    private LinkedList<Double> convertToLinkedList(String data){
        LinkedList<Double> linkedList= new LinkedList<Double>();
        try{
            String[] splitData = data.split(",");
            for (String numberString: splitData){
                double number = Double.parseDouble(numberString);
                linkedList.add(number);
            }
        }catch (java.lang.NumberFormatException e){
            System.out.println("Ingrese los numeros separados por comas");
            linkedList.add(0.0);
        }

        return linkedList;
    }
}
