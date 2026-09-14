import version2.*;

public class Main {
    public static void main(String[] args) {
        // Instantiate and set up Name
        Name guy = new Name();
        guy.setFirstName("Kiril");
        guy.setMiddleName("Belotindos");
        guy.setLastName("Camomot");


        MyDate today = new MyDate();
        today.setDate(14);
        today.setMonth(MyDate.Month.SEPTEMBER);
        today.setYear(2026);


        System.out.println(guy);

        System.out.println(today);

    }
}
