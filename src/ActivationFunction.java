/**
 * Created by Gabriel Freire on 09/04/2017.
 */
public class ActivationFunction {

    public static int stepFunction(double x){
        if( x >= 0 ){
            return 1;
        }
        return -1;
    }
}
