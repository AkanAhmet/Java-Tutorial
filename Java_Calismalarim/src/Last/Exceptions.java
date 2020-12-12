package Last;

//An exception can occur for many different reasons. Some examples:
//        - A user has entered invalid data.
//        - A file that needs to be opened cannot be found.
//        - A network connection has been lost in the middle of communications.
//        - Insufficient memory and other issues related to physical resources.
//        As you can see, exceptions are caused by user error, programmer error, or physical resource issues.
//        However, a well-written program should handle all possible exceptions.

//try {   => Multiple catch
//        //some code
//        } catch (ExceptionType1 e1) {
//        //Catch block
//        } catch (ExceptionType2 e2) {
//        //Catch block
//        } catch (ExceptionType3 e3) {
//        //Catch block
//        }
public class  Exceptions{

    public static void main(String[] args) {

        try {
            Exceptions ex = new Exceptions();
            System.out.println(ex.division(5,0));
            int[] arr = new int[2];
            System.out.println(arr[5]);

        }

        catch(Exception E) {
            System.out.println(E.toString());
        }
    }

    public int division(int a, int b) throws ArithmeticException {
        if(0==b) {
            throw new ArithmeticException("Division by zero");
        }
        else {
            return a/b;
        }

    }
}