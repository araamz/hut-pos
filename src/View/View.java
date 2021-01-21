package View;

import javafx.stage.Stage;
import View.login_view.login_view;

public class View {

    Stage main_window;

    public View() {
/*
        selection_cashierScene selection_scene = new selection_cashierScene();

        this.main_window = new Stage();
        this.main_window.setScene(selection_scene.create_scene());

        this.main_window.show();
        this.main_window.setFullScreen(true);
*/
        login_view View_test = new login_view();

        this.main_window = new Stage();
        main_window.setScene(View_test.create_scene());
        main_window.setFullScreen(true);
        this.main_window.show();


    }

}
