public class DynamicBinding {

    public static void main(String[] args) {
      // B b= new B();
      // b.show();

       A a= new B();
       a.show();
    }
    
}
class A {
        public  void show() {
            System.out.println("A show");
        }    
    }
class  B extends A {
        public void show(){
            System.out.println("B Show");
        }
        
 }