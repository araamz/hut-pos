package Model;

import java.util.UUID;

public class person {

    protected String first_name;
    protected String last_name;
    protected UUID identification_number;

    public person() {

        this.identification_number = UUID.randomUUID();

    }

    public person(String first_name, String last_name) {

        this.first_name = first_name;
        this.last_name = last_name;
        this.identification_number = UUID.randomUUID();

    }

    public person(String first_name, String last_name, UUID identification_number) {

        this.first_name = first_name;
        this.last_name = last_name;
        this.identification_number = identification_number;

    }

    public String get_firstName() {

        return this.first_name;

    }

    public String get_lastName() {

        return this.last_name;

    }

    public UUID get_identificationNumber() {

        return this.identification_number;

    }

    public void set_firstName(String first_name) {

        this.first_name = first_name;

    }

    public void set_lastName(String last_name) {

        this.last_name = last_name;

    }

    public void set_identificationNumber(UUID identification_number) {

        this.identification_number = identification_number;

    }
}
