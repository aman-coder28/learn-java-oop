// Class should start with smaller letter i.e. class
public class ErrorFree {
    // mian method should be a static method
    public static void main(String [] args){
        int i, j = 32768;
        // should convert int to short before assingment
        short s = (short)j;

        double m = 5.3d, n = 2.1d;
        // you should add "f" at the end of values for floats 
        float x = 5.3f, y = 2.1f;
        // byte can only hold from -128 to 127 
        byte z = 127;

        // should add brackates to modulo opertation so its performed before concationation
        System.out.println("x % y = " + (x % y));

        // boolean type can only hold true or false
        boolean b = true;
        
        if (b) System.out.println("b is true");
        else System.out.println("b is false");
    }
}
