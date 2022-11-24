import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PassportList {
    private final Map<Integer, Passport> passports = new HashMap<>();
    public void addOrUpdatePassport(Passport passport) {
        this.passports.put(passport.getPassportID(), passport);
    }

    public Passport findByNumber(int number) {
            return passports.get(number);
            //Элемент по ключу
    }

    @Override
    public String toString() {
        return "База паспортов: \n" + passports;
    }
}
