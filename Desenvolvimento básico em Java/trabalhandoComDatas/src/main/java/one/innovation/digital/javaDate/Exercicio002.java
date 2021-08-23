package main.java.one.innovation.digital.javaDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio002 {


    public static void main(String[] args) {
        Exercicio002 e = new Exercicio002();

        e.app();
    }


    /**
     * Exercicio 1 - extra
     *
     * 
     * Descubra o timeInMillis do dia que você nasceu
     * Converta em um objeto Date
     * Verifique se ele é anterior ou posterior a 15 de maio de 2010
   

     */
    
    

    private void app() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");

        try {
            Date birthDate = sdf.parse(myBirthDate());
            System.out.println(dateInMillis(birthDate));

            Date goalDate = sdf.parse("15-05-2010");

            System.out.println(checkDate(birthDate, goalDate));

        }catch(ParseException e) {
            e.printStackTrace();
        }
    }

    private String checkDate(Date arg1, Date arg2) {
        int compare = arg1.compareTo(arg2);

        if(compare < 0) {
            return "Anterior";
        }

        if(compare == 0) {
            return "Igual";
        }

        return "Posterior";

    }

    private String myBirthDate() {
        return "22-06-1999";
    }

    private Long dateInMillis(Date date) {
        return date.getTime();
    }
}
