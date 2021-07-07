package depthFirstSearch;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class EvaluateDivisionTest {
    @Test
    public void calcEquation() {
        List<List<String>> equations = new ArrayList<>();
        equations.add(Arrays.asList("a","b"));
        equations.add(Arrays.asList("b","c"));
        double[] values = {2.0,3.0};
        List<List<String>> queries = new ArrayList<>();
        queries.add(Arrays.asList("a","c"));
        queries.add(Arrays.asList("b","a"));
        queries.add(Arrays.asList("a","e"));
        queries.add(Arrays.asList("a","a"));
        queries.add(Arrays.asList("x","x"));
        double[] result = {6.00000,0.50000,-1.00000,1.00000,-1.00000};
        assertArrayEquals(result, new EvaluateDivision().calcEquation(equations,values,queries),0.0000000001);
        equations = new ArrayList<>();
        equations.add(Arrays.asList("a","b"));
        equations.add(Arrays.asList("b","c"));
        equations.add(Arrays.asList("bc","cd"));
        values = new double[]{1.5,2.5,5.0};
        queries = new ArrayList<>();
        queries.add(Arrays.asList("a","c"));
        queries.add(Arrays.asList("c","b"));
        queries.add(Arrays.asList("bc","cd"));
        queries.add(Arrays.asList("cd","bc"));
        result = new double[]{3.75000,0.40000,5.00000,0.20000};
        assertArrayEquals(result, new EvaluateDivision().calcEquation(equations,values,queries),0.0000000001);

        equations = new ArrayList<>();
        equations.add(Arrays.asList("a","b"));
        values = new double[]{0.5};
        queries = new ArrayList<>();
        queries.add(Arrays.asList("a","b"));
        queries.add(Arrays.asList("b","a"));
        queries.add(Arrays.asList("a","c"));
        queries.add(Arrays.asList("x","y"));
        result = new double[]{0.50000,2.00000,-1.00000,-1.00000};
        assertArrayEquals(result, new EvaluateDivision().calcEquation(equations,values,queries),0.0000000001);

        equations = new ArrayList<>();
        equations.add(Arrays.asList("x1","x2"));
        equations.add(Arrays.asList("x2","x3"));
        equations.add(Arrays.asList("x3","x4"));
        equations.add(Arrays.asList("x4","x5"));
        values = new double[]{3.0,4.0,5.0,6.0};
        queries = new ArrayList<>();
        queries.add(Arrays.asList("x1","x5"));
        queries.add(Arrays.asList("x5","x2"));
        queries.add(Arrays.asList("x2","x4"));
        queries.add(Arrays.asList("x2","x2"));
        queries.add(Arrays.asList("x2","x9"));
        queries.add(Arrays.asList("x9","x9"));
        result = new double[]{360.00000,0.008333333333333333,20.00000,1.00000,-1.00000,-1.00000};
        assertArrayEquals(result, new EvaluateDivision().calcEquation(equations,values,queries),0.000001);

        equations = new ArrayList<>();
        equations.add(Arrays.asList("e","c"));
        equations.add(Arrays.asList("c","d"));
        equations.add(Arrays.asList("d","u"));
        equations.add(Arrays.asList("e","v"));
        equations.add(Arrays.asList("s","a"));
        equations.add(Arrays.asList("a","d"));
        equations.add(Arrays.asList("d","s"));
        values = new double[]{2.5, 1.5, 0.83333333, 7.3222222, 3.3333333, 4.8, 2.3222222};
        queries = new ArrayList<>();
        queries.add(Arrays.asList("e","s"));
        queries.add(Arrays.asList("s","e"));
        queries.add(Arrays.asList("a","s"));
        queries.add(Arrays.asList("s","c"));
        queries.add(Arrays.asList("v","s"));
        queries.add(Arrays.asList("u","v"));
        queries.add(Arrays.asList("u","a"));
        queries.add(Arrays.asList("a","c"));
        queries.add(Arrays.asList("s","s"));
        result = new double[]{8.70833,4.26666,0.3,10.66666,1.18930,2.34311,0.25,0.08612,1.0};
        assertArrayEquals(result, new EvaluateDivision().calcEquation(equations,values,queries),0.00001);
    }
}