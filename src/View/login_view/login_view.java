package View.login_view;

import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;

import java.util.ArrayList;

public class login_view {

    private String data_terminalName;
    private ObservableList<String> data_cashierNames;

    private ListView<String> cashier_list;
    private PasswordField entered_password;

    public login_view() {

        System.out.println("LOGGING *-> VIEW: STARTING \"login_view\" INITIALIZATION.");

    }

    public Scene create_scene() {

        VBox login_selection = new VBox();
        Label terminal_name = create_terminalName();
        ListView<String> cashier_names = create_CashierList();
        login_selection.getChildren().addAll(terminal_name, cashier_names);

        VBox cashier_authentication = new VBox();
        HBox authentication_options = create_authenticationOptions();
        GridPane key_pad = create_keyPad();
        cashier_authentication.getChildren().addAll(authentication_options, key_pad);

        FlowPane container = new FlowPane();
        container.getChildren().addAll(login_selection, cashier_authentication);

        System.out.println("LOGGING *-> \"login_view\" INITIALIZATION SUCCESSFUL.");

        return new Scene(container);

    }

    public void setData_terminalName(String terminal_name) {

        data_terminalName = terminal_name;

    }

    public void setData_cashierNames(ObservableList<String> cashier_names) {

        data_cashierNames = cashier_names;

    }

    public String getData_password() {

        return entered_password.getAccessibleText();

    }

    private ListView<String> create_CashierList() {

        cashier_list = new ListView<String>(data_cashierNames);

        System.out.println("LOGGING *-> VIEW: \"cashier_list\" CREATED.");

        return cashier_list;


    }

    private Label create_terminalName() {

        Label terminal_name = new Label(data_terminalName);

        System.out.println("LOGGING *-> VIEW: \"terminal_name\" CREATED.");

        return terminal_name;

    }

    private GridPane create_keyPad() {

        GridPane key_pad = new GridPane();
        Button keyPad_buttons[] = new Button[10];
        for(int index = 0, column_position = 0, row_position = 0; index < 10; index++) {

            keyPad_buttons[index] = new Button();

            if(index < 9) {

                column_position = index % 3;
                keyPad_buttons[index].setText("" + (index + 1));
                GridPane.setConstraints(keyPad_buttons[index], column_position, row_position);
                key_pad.getChildren().add(keyPad_buttons[index]);
                row_position = column_position == 2 ? row_position += 1 : row_position;

            } else {

                column_position = 1;
                row_position = 3;
                keyPad_buttons[index].setText("0");
                GridPane.setConstraints(keyPad_buttons[index], column_position, row_position);
                key_pad.getChildren().add(keyPad_buttons[index]);

            }

        }

        System.out.println("LOGGING *-> VIEW: \"key_pad\" CREATED.");

        return key_pad;

    }

    private HBox create_authenticationOptions() {

        HBox authentication_options = new HBox();
        Button clear_selection = new Button("X");
        entered_password =  new PasswordField();
        Button password_submit = new Button("→");
        authentication_options.getChildren().addAll(clear_selection, entered_password, password_submit);

        System.out.println("LOGGING *-> VIEW: \"authentication_options\" CREATED.");

        return authentication_options;

    }

}
