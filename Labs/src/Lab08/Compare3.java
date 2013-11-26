package Lab08;
import java.lang.Comparable;

public class Compare3 {

    public static Comparable largest(Comparable val1, Comparable val2, Comparable val3){
        Comparable largestNum = null;
        
        if ((val1.compareTo(val2) > 0) && (val1.compareTo(val3) > 0)) {
            largestNum = val1;
        }else if ((val2.compareTo(val1) > 0) && (val2.compareTo(val3) > 0)){
            largestNum = val2;
        }else{
            largestNum = val3;
        }
      return largestNum;  
    } 
}
