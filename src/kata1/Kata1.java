//token: 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

package kata1;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Kata1 {


    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2007,12,3);
                
        Person person = new Person("Blas", date);
        System.out.println(person.getName() + "tiene " + person.getAge() + " años.");
    }
    
}
