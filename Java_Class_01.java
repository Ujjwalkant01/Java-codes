class Pen{                                   //CLASS
    String color;
    String type;
    public void write(){                      //FUNCTIONS TO PERFORM SOMETHING
        System.out.println("Write anything using this pen.");
    }
}
public class Java_Class_01 {
    public static void main(String[] args){

        // CREATING OBJECTS.
        Pen pen1= new Pen();
        pen1.color="Blue";              //WE USED PROPERTY USING DOT.
        pen1.type="ink";

        pen1.write();                   //METHOD/FUNCTION IS CALLED HERE

    }
}
