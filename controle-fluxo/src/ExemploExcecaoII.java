import java.text.NumberFormat;
import java.text.ParseException;
public class ExemploExcecaoII {
   public static void main(String[] args) {
        Number valor = Double.valueOf("a1.75");

        try{
            
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);

        } catch (ParseException e) {
            //TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(valor); 
    }
}
