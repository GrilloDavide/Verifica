

public class Museo {

    private int visiteMax;
    private int visiteInCorso = 0;

    public Museo(int visiteMax) {
      
        this.visiteMax = visiteMax;
    }
    
    public synchronized void entraNelMuseo(){

        Thread t  = Thread.currentThread();
        
        while(visiteInCorso == visiteMax){
            try {
                //System.out.println(t.getName() + " aspetta"); Utilizzato in debug
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            
            
        }
        System.out.println(t.getName() + " entra nel museo");
        visiteInCorso++;
    }

    public synchronized void esceDalMuseo(){
        Thread t  = Thread.currentThread();
        System.out.println(t.getName() + " esce dal museo");
        visiteInCorso--;

        notifyAll();
    }
}
