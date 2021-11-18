package ComienzoDateyCalendar;

import java.util.Calendar;

public class principal {
    public static void main(String[] args) {
        
        Calendar fecha = Calendar.getInstance();
        int anio = fecha.get(Calendar.YEAR);

        System.out.println(anio);
    }
}
