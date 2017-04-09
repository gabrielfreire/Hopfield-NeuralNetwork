/**
 * Created by Gabriel Freire on 09/04/2017.
 */
public class Matrix {

    public static double[] matrixVectorMultiplication(double[][] matrix, double[] vector){
        double[] result = new double[vector.length];
        for(int i = 0; i < matrix.length; i++){
            double sum = 0;
            for(int j = 0; j< matrix.length; j++){
                sum += matrix[i][j] * vector[j];
            }
            result[i] = sum;
        }
        return result;
    }

    public static double[][] createMatrix(int numOfRows, int numOfCols){
        return new double[numOfRows][numOfCols];
    }

    public static double[][] outerProduct(double[] vector){
        double[][] result = new double[vector.length][vector.length];
        for(int i = 0; i < vector.length; i++){
            for(int j = 0; j < vector.length; j++){
                result[i][j] = vector[i] * vector[j];
            }
        }
        return result;
    }

    public static double[][] clearDiagonals(double[][] matrix){
        for(int i = 0; i < matrix.length; i ++){
            matrix[i][i] = 0;
        }
        return matrix;
    }

    public static double[][] addMatrix(double[][] matrixOne, double[][] matrixTwo){
        double[][] result = new double[matrixOne.length][matrixOne.length];
        for(int i = 0; i < matrixOne.length; i++){
            for(int j = 0; j < matrixOne.length; j++){
                result[i][j] = matrixOne[i][j] + matrixTwo[i][j];
            }
        }
        return result;
    }

}
