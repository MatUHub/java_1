package MyTime;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyTime {
    public String getTime(){
        Calendar calendar = new GregorianCalendar();
        return (calendar.get(Calendar.HOUR) +":"+ calendar.get(Calendar.MINUTE) +":"+ calendar.get(Calendar.SECOND));
    }


}
