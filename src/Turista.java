public class Turista extends Thread{
    
    Museo museo;


    public Turista(String cognome, Museo museo) {
        super(cognome); //uso il name della classe padre come variabile per il cognome
        this.museo = museo;
    }
    
    @Override
    public void run() {
        museo.entraNelMuseo();
        try {
            int i = (int)(Math.random() * 10000 + 1);
            sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
        museo.esceDalMuseo();
    }
}
