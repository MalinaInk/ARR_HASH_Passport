import java.time.LocalDate;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import static java.time.LocalDate.of;

public class Main {

        public static void main(String[] args) {
            PassportList passportList1 = new PassportList();

        Passport passport1 = new Passport(12967889, "Лермонтов", "Михаил", "Юрьевич", LocalDate.of(1991, 3, 12));
        Passport passport2 = new Passport(27156734, "Пушкин", "Александр", "Сергеевич", LocalDate.of(1984, 12, 3));
        Passport passport3 = new Passport(92579264, "Бэггинс", "Фродо", "Михайлович", LocalDate.of(1997, 9, 10));
        Passport passport4 = new Passport(92579264, "Достоевский", "Федор", "Михайлович", LocalDate.of(1997, 9, 10));

      passportList1.addOrUpdatePassport(passport1);
      passportList1.addOrUpdatePassport(passport2);
      passportList1.addOrUpdatePassport(passport3);
      passportList1.addOrUpdatePassport(passport4);
            System.out.println(passportList1);
            System.out.println(passportList1.findByNumber(92579264));
    }
}