package HW.Task_Additoanal_3;

public class Running {
    public static void main(String[] args) {

        Year season;

        System.out.println("\nHere are all elements of the 'Year' enum:");
        for (Year s : Year.values()) {
            System.out.println(s);
        }

        season = Year.valueOf("WINTER");    // выдаст ошибку, если компилятор в enum не найдет введенную стороку.

        System.out.println("\nHere are a description method of all elements of the 'Year' enum:");
        for (Year s : Year.values()) {
            System.out.println(s.seasonDescription());
        }

        Year.favoriteSeason(season);

        for (int i=0; i<Year.values().length; i++) {
            System.out.println("\n" + Year.values()[i]);
            System.out.println("The simple average year temperature: " + Year.values()[i].getTemp());
            System.out.println("This season is " + Year.values()[i].seasonDescription() + "\n");
        }
    }
}