package Model;

import java.util.UUID;

public class person {

    protected final String first_name;
    protected final String last_name;

    public person(String first_name, String last_name) {

        this.first_name = first_name;
        this.last_name = last_name;

    }

    public person(String first_name, String last_name, UUID identification_number) {

        this.first_name = first_name;
        this.last_name = last_name;

    }

    public String get_firstName() {

        return this.first_name;

    }

    public String get_lastName() {

        return this.last_name;

    }

}
