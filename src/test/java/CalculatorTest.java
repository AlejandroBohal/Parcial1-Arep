import edu.escuelaing.arep.calculator.BubbleSort;
import edu.escuelaing.arep.calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class CalculatorTest {
    @Test
    public void shouldCalculateSum(){
        String dataset1 = "2.2,3.3,4.5,4.4,3.2";
        Calculator c = new Calculator();
        System.out.println(c.calculate(dataset1));
    }
    @Test
    public void shouldOrdenateNumbers(){
        BubbleSort b = new BubbleSort();
        LinkedList<Double> numbers= new LinkedList<Double>();
        numbers.add(3.5);
        numbers.add(2.5);
        numbers.add(5.5);
        numbers.add(1.5);
        b.bubbleSort(numbers);
        Double[] resultDouble = new Double[]{1.5,2.5,3.5,5.5};
        LinkedList<Double> results = new LinkedList<Double>(Arrays.asList(resultDouble));
        Assert.assertEquals(results, numbers);
    }
    @Test
    public void shouldOrdenateStrings(){
        BubbleSort b = new BubbleSort();
        LinkedList<String> strings= new LinkedList<String>();
        strings.add("b");
        strings.add("d");
        strings.add("c");
        strings.add("a");
        b.bubbleSort(strings);
        String[] resultString = new String[]{"a","b","c","d"};
        LinkedList<String> results = new LinkedList<String>(Arrays.asList(resultString));
        Assert.assertEquals(results, strings);
    }
}
