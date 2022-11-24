import java.time.LocalDate;
import java.util.Objects;

public class Passport {
    private final int passportID;
    private final String lastName;
    private final String name;
    private final String middleName;
    private final LocalDate localDate;

    public Passport(int passportID, String lastName, String name, String middleName, LocalDate localDate) {
        this.passportID = passportID;
        this.lastName = lastName;
        this.name = name;
        this.middleName = middleName;
        this.localDate = localDate;
    }

    public int getPassportID() {
        return passportID;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return passportID == passport.passportID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportID);
    }

    @Override
    public String toString() {
        return "\n Номер паспорта: " + passportID +
                ". Владелец паспорта: " + lastName + " " + name + " " + middleName + ", дата рождения: " + localDate;
        }
}
