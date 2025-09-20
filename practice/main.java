public class main {
    
    public static void main(String[] args) {
        

        ThredClassWithExteds t1 = new ThredClassWithExteds();

        t1.start();

        ThredClassWithRunable t2= new ThredClassWithRunable();

        Thread thread = new Thread(t2);
        thread.start();

    }
}
