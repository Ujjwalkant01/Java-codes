class Penn{                                   //CLASS
    String color;
    String type;
    public void write(){                      //FUNCTIONS TO PERFORM SOMETHING
        System.out.println("Write anything using this pen.");
    }
    public void printColor(){
        System.out.println(this.color);     // This IS A KEYWORD
    }
}
public class Java_Class_2 {
    public static void main(String[] args){

        // CREATING OBJECTS.
        Penn pen1= new Penn();
        pen1.color="Blue";              //WE USED PROPERTY USING DOT.
        pen1.type="ink";


        Penn pen2 = new Penn();
        pen2.color="Red";
        pen2.type="Gel";



        pen1.write();     //METHOD/FUNCTION IS CALLED HERE

        pen1.printColor();
        pen2.printColor();

    }
}
