package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();

        Locale local = new Locale("pt", "BR");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", local);

//        d = sdf.parse("20/09/2000");

        System.out.println(sdf.format(d));
        for (int i = 0; i < 10; i++){
            System.out.println(System.currentTimeMillis());
        }

        Calendar c = Calendar.getInstance().getInstance();
        c.set(1980, Calendar.FEBRUARY, 12);
        System.out.println(c.getTime());

        System.out.println(c.get(Calendar.YEAR));

        System.out.println(c.get(Calendar.MONTH)); // month begin count in 0 = Janeiro

        System.out.println(c.get(Calendar.DAY_OF_MONTH));

        c.set(Calendar.YEAR, 1955);
        c.set(Calendar.MONTH, Calendar.MAY);
        c.set(Calendar.DAY_OF_MONTH, 12);
        System.out.println(c.getTime());

        c.clear(Calendar.MINUTE);
        c.clear(Calendar.SECOND);
        System.out.println(c.getTime());
    }
}
