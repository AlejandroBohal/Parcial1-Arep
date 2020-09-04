package edu.escuelaing.arep.calculator;

import com.google.gson.Gson;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Esta calculadora tiene 3 funcionalidades principales que son
 * ordenar numeros
 * sumar numeros
 * calcular el promedio
 */
public class Calculator {
    /**
     * The Bubble sort.
     */
    BubbleSort bubbleSort = new BubbleSort();

    /**
     * Instantiates a new Calculator.
     */
    public  Calculator(){

    }

    /**
     * Calcula la suma dada una linked list de double
     *
     * @param data numeros double en una linked list
     * @return La media
     */
    public double calculateMean(LinkedList<Double> data){
        double answer = 0.0;
        for(double node: data){
            answer += node;
        }
        answer = answer/data.size();
        return answer;
    }

    /**
     * Calcula la sumatoria de una conjunto de datos
     *
     * @param data datos en una linked list deben ser double
     * @return sumatoria de los datos
     */
    public double calculateSum(LinkedList<Double> data){
        double answer = 0.0;
        for(double node: data){
            answer += node;
        }
        return answer;
    }

    /**
     * calcula  la sumatoria, la media y ordena los numeros del data set
     *
     * @param data Datos en string
     * @return String que será parseado a json
     */
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
