package Model;

import java.time.LocalDateTime;
import java.util.UUID;

public class cashier extends person {

    private LocalDateTime last_login;
    private password

    cashier(String first_name, String last_name) {

        super(first_name, last_name);

    }

    cashier(String first_name, String last_name, UUID identification_number) {

        super(first_name, last_name, identification_number);

    }



}
