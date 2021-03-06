/**
 * Created by Gabriel Freire on 09/04/2017.
 */
public class App {
    public static void main(String[] args) {
        HopfieldNetwork hopfieldNetwork = new HopfieldNetwork(4);

        hopfieldNetwork.train(new double[]{1, 0, 1, 0});
        hopfieldNetwork.train(new double[]{0, 1, 0, 1});

        hopfieldNetwork.recall(new double[]{0, 1, 0, 1});
        hopfieldNetwork.recall(new double[]{1, 0, 1, 0});
    }
}
