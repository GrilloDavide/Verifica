public class Turista extends Thread{
    
    Museo museo;


    public Turista(String cognome, Museo museo) {
        super(cognome); //uso il name della classe padre come variabile per il cognome
        this.museo = museo;
    }
    
    @Override
    public void run() {
        try {
            sleep((int)(Math.random() * 2000 + 1));
        
            museo.entraNelMuseo();
        
            sleep((int)(Math.random() * 10000 + 1));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
        museo.esceDalMuseo();
    }
}
