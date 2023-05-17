import java.util.List;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) throws Exception {
        
        Museo louvre = new Museo(5);
        List<Turista> turisti = new ArrayList<>();

        for(int i = 0; i < 50; i++){
            turisti.add(new Turista("Turista" + (i+1), louvre));
        }

        for (Turista t : turisti) {
            t.start();
        }
    }
}
