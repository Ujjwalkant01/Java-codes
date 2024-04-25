//METHOD OVERLOADING.
public class Method_Overloading {
        static void overloading(){
            System.out.println("No argument in this method");
        }
        static void overloading(int a){
            System.out.println("Hello, this is method overlaoding");
        }
        public static void main(String[] args){
            overloading(); //Function/Method is called here.
            overloading(500);
        }

}
