import java.time.LocalDate;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import static java.time.LocalDate.of;

public class Main {
    static Set<Passport> passports1 = new HashSet<>();
        public static void main(String[] args) {

        Passport passport1 = new Passport(12967889, "Лермонтов", "Михаил", "Юрьевич", LocalDate.of(1991, 3, 12));
        Passport passport2 = new Passport(27156734, "Пушкин", "Александр", "Сергеевич", LocalDate.of(1984, 12, 3));
        Passport passport3 = new Passport(92579264, "Достоевский", "Федор", "Михайлович", LocalDate.of(1997, 9, 10));

      passports1.add(passport1);
      passports1.add(passport2);
            System.out.println(passports1);




    }
}