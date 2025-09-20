package volatileLearnig;

public class volatileThread {
    

   
    public static void main(String[] args) {
        count count = new count();
        Thread t1= new Thread(()->count.checkFlag());
        Thread t2 = new Thread(()-> count.flaseFlag());
        t1.start();
        t2.start();

    }
}
class count {
     volatile  boolean intFlag= true;
    public void checkFlag(){
        if (intFlag){
            System.out.println("the flag is true");
        }
        intFlag = false;
    }
    public void flaseFlag(){
         while (intFlag){
            System.out.println("the flag is false");
        }
    }
   
   }
