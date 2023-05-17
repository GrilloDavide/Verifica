import java.util.List;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) throws Exception {
        
        Museo louvre = new Museo(2);
        List<Turista> turisti = new ArrayList<>();

        turisti.add(new Turista("Bianchi", louvre));
        turisti.add(new Turista("Martelli", louvre));
        turisti.add(new Turista("Novi", louvre));

        for (Turista t : turisti) {
            t.start();
        }
    }
}
