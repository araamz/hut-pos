package Model;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class terminal {

    private final String name;
    private final String mainDirectory_path;
    private final String terminalCredentials_path;
    private final String orderLog_path;
    private cashier loggedIn_cashier;

    private ArrayList<cashier> cashiers;

    public terminal(String name) {

        this.name = name;
        this.mainDirectory_path = "./" + this.name;
        this.terminalCredentials_path = mainDirectory_path + "/terminal_credentials.csv";
        this.orderLog_path = mainDirectory_path + "/order_logs";
        this.cashiers = new ArrayList<cashier>();

        this.create_fileStructure();
        this.load_terminalCredentials();

    }

    private boolean create_fileStructure() {

        try {

            File main_directory = new File(this.mainDirectory_path);
            if (main_directory.mkdir()) {

                System.out.println("LOGGING *-> PATH: \"" + this.mainDirectory_path + "\" CREATED.");

            } else {

                System.out.println("LOGGING *-> PATH: \"" + this.mainDirectory_path + "\" NOT CREATED. PERHAPS ALREADY CREATED.");

            }

            File terminal_credentials = new File(this.terminalCredentials_path);
            if (terminal_credentials.createNewFile()) {

                System.out.println("LOGGING *-> PATH: \"" + this.terminalCredentials_path + "\" CREATED.");

            } else {

                System.out.println("LOGGING *-> PATH: \"" + this.terminalCredentials_path + "\" NOT CREATED. PERHAPS ALREADY CREATED.");

            }

            File orderLog_directory = new File(this.orderLog_path);
            if (orderLog_directory.mkdir()) {

                System.out.println("LOGGING *-> PATH: \"" + this.orderLog_path + "\" CREATED.");

            } else {

                System.out.println("LOGGING *-> PATH: \"" + this.orderLog_path + "\" NOT CREATED. PERHAPS ALREADY CREATED.");

            }

            System.out.println("LOGGING *-> PATHS INITIALIZATION SUCCESSFUL.");

            return true;

        } catch (IOException | SecurityException exception) {

            System.out.println("LOGGING *-> PATHS INITIALIZATION UNSUCCESSFUL.");
            System.out.println("EXCEPTION *-> " + exception.getCause());

            return false;

        }

    }

    private boolean load_terminalCredentials() {

        try {

            FileInputStream credentials_stream = new FileInputStream(terminalCredentials_path);
            Scanner credentials_scanner = new Scanner(credentials_stream);
            System.out.println("LOGGING *-> PATH: \"" + this.terminalCredentials_path + "\" OPENED.");

            String credentials_pattern = "(\\w+),(\\w+),(\\w+)-(\\w+)-(\\w+)-(\\w+)-(\\w+),(\\w+)";

            while(credentials_scanner.hasNext(credentials_pattern)) {

                String[] data = credentials_scanner.next(credentials_pattern).split(",");

                cashier loaded_cashier = new cashier(data[0], data[1], UUID.fromString(data[2]));
                loaded_cashier.set_password(data[3]);

                this.cashiers.add(loaded_cashier);

                System.out.println("LOGGING *-> CREDENTIAL: \"" + loaded_cashier.get_firstName() + " " + loaded_cashier.get_lastName() + " " + loaded_cashier.get_identificationNumber() + "\" LOADED INTO MEMORY.");

            }

            System.out.println("LOGGING *-> CREDENTIALS INITIALIZATION SUCCESSFUL.");

            return true;

        } catch (IOException exception) {

            System.out.println("LOGGING *-> PATH: \"" + this.terminalCredentials_path + "\" CREDENTIALS INITIALIZATION UNSUCCESSFUL.");
            System.out.println("EXCEPTION *-> " + exception.getCause());

            return false;

        }

    }
    

}
