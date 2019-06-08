/**
 *
 * @author uchejustin
 */
import java.math.BigInteger;

public class SquareAndMultiply {
    
    public static void main (String [] args){
        BigInteger answer, exponentiation, base, modulo, exponent, result;
                
        base = new BigInteger ("7789966325864455355412020523003215152002");
        exponent = new BigInteger ("114779225631478552451233458");
        modulo = new BigInteger ("4477896336987455214658996321447552");
        
        answer = base.remainder(modulo);
        String binaryString = exponent.toString(2);
        int t = binaryString.length() - 1;

        for (int i = 1; i <= t; i++){   
            answer = (answer.multiply(answer)).remainder(modulo);
            if (binaryString.charAt(i) == '1'){
                answer =(answer.multiply(base)).remainder(modulo);
            }
        }
        System.out.println ("The answer is "+answer+" and t is "+t+" ,also the binary number of exponent is "+binaryString);
    }
    
}
