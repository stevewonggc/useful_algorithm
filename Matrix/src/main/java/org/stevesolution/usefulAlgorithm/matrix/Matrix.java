package org.stevesolution.usefulAlgorithm.matrix;

import java.util.StringTokenizer;

public class Matrix {

    private int rowSize;
    private int columnSize;
    private double matrix[][];

    @SuppressWarnings("unused")
    private Matrix()
    {

    }

    public Matrix(String matrixString)
    {
        StringTokenizer tokenizer = new StringTokenizer(matrixString, ";");
        int rows = tokenizer.countTokens();
        rowSize = rows;
        matrix = new double[rows][];
        String tempString = null;
        for(int i = 0; tokenizer.hasMoreTokens(); i ++)
        {
            tempString = tokenizer.nextToken();
            StringTokenizer rowTokenizer = new StringTokenizer(tempString, ",");
            matrix[i] = new double[rowTokenizer.countTokens() + 1];
            int j = 0;
            while (rowTokenizer.hasMoreTokens())
            {
                matrix[i][j++] = Double.parseDouble(rowTokenizer.nextToken().trim());
            }
            columnSize = j;
        }
    }

    public Matrix(int rowSize, int columnSize)
    {
        this.rowSize = rowSize;
        this.columnSize = columnSize;
        matrix = new double[rowSize][columnSize];
    }

    public Matrix add(Matrix matrix2)
    {
        Matrix toReturn = new Matrix(this.rowSize, this.columnSize);
        double result[] = new double[this.columnSize];
        for(int i = 0; i < this.rowSize; i ++)
        {
            for(int j = 0; j < this.columnSize; j ++)
            {
                result[j] = this.matrix[i][j] + matrix2.matrix[i][j];
            }
            toReturn.setLine(i, result);
        }
        return toReturn;
    }

    public void setLine(int i, double[] line)
    {
        this.matrix[i] = line;
    }

    @Override
    public String toString()
    {
        String toReturn = new String("");
        for(int i = 0; i < rowSize; i ++)
        {
            for(int j = 0; j < columnSize; j ++)
            {
                toReturn += matrix[i][j] + ", ";
            }
            toReturn += "\n";
        }
        return toReturn;
    }

    public boolean equals(Matrix matrix2)
    {
        return false;
    }
}
