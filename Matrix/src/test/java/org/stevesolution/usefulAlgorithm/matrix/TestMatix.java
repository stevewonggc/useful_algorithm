/**
 * 
 */
package org.stevesolution.usefulAlgorithm.matrix;

import org.junit.Test;
import org.stevesolution.usefulAlgorithm.matrix.Matrix;

/**
 * @author SteveWong
 *
 */
public class TestMatix {

    private Matrix testMatrix;
    @Test
    public void test() {
//        fail("Not yet implemented");
    }

    @Test
    public void testConstructor()
    {
        String matrixString = "1, 3, 2, 3, 2, 4; 1, 34, 6, 23, 4, 2; " +
                "23, 9, 5, 6, 54, 19;";
//        testMatrix = new Matrix();
//        if (testMatrix == null)
//        {
//            fail("Construtor failed");
//        }
        testMatrix = new Matrix(matrixString);
        System.out.println(testMatrix.toString());
    }

    @Test
    public void testAdd()
    {
        testMatrix = new Matrix("1, 2, 3; 4, 5, 6; 7, 8, 9;");
        Matrix result = testMatrix.add(new Matrix ("9, 8, 7; 6, 5, 4; 3, 2, 1;"));
        System.out.print(result.toString());
    }

    @Test
    public void testMinus()
    {
        
    }
}
