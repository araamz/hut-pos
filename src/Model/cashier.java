package Model;

import java.time.LocalDateTime;
import java.util.UUID;

public class cashier extends person {

    private String password;
    private UUID identification_number;

    public cashier(String first_name, String last_name) {

        super(first_name, last_name);
        this.identification_number = UUID.randomUUID();

    }

    cashier(String first_name, String last_name, UUID identification_number) {

        super(first_name, last_name);
        this.identification_number = identification_number;

    }

    public String get_identificationNumber() {

        return identification_number.toString();

    }

    public void set_identificationNumber(String identification_number) {

        this.identification_number = UUID.fromString(identification_number);

    }

    public boolean set_password(String password) {

        this.password = password;

        return true;

    }

    public boolean authenticate_password(String password) {

        return this.password == password;

    }


}
