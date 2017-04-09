/**
 * Created by Gabriel Freire on 09/04/2017.
 */
public class HopfieldNetwork {

    private double[][] weightMatrix;

    public HopfieldNetwork(int dimension){
        this.weightMatrix = new double[dimension][dimension];
    }

    public void train(double[] pattern){
        double[] patternBipolar = Utils.transform(pattern);
        double[][] patternMatrix = Matrix.createMatrix(patternBipolar.length, patternBipolar.length);

        patternMatrix = Matrix.outerProduct(patternBipolar);
        patternMatrix = Matrix.clearDiagonals(patternMatrix);

        this.weightMatrix = Matrix.addMatrix(this.weightMatrix, patternMatrix);
    }

    public void recall(double[] pattern){
        double[] patterBipolar = Utils.transform(pattern);
        double[] result = Matrix.matrixVectorMultiplication(this.weightMatrix, patterBipolar);

        for(int i = 0; i < patterBipolar.length; i++){
            result[i] = ActivationFunction.stepFunction(result[i]);
        }

        for(int i = 0; i < patterBipolar.length; i++){
            if(patterBipolar[i] != result[i]){
                System.out.println("Pattern is not recognized...");
                return;
            }
        }

        System.out.println("Pattern is recognized...");
    }

}
