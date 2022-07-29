import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            int a = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println("1");
        } catch (Exception e) {
            throw new RuntimeException();
        }
        finally {
            System.out.println("Final!!");
        }


    }

}


