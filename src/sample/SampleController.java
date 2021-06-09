package sample;

import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.util.Duration;

public class SampleController {
    public Label helloWorld;

    public Button press1;



    public void sayHelloWorld(ActionEvent actionEvent) {

        RotateTransition rotateTransition = new RotateTransition(Duration.millis(50), press1);
        rotateTransition.setByAngle(37f);
        rotateTransition.setCycleCount(10);
        rotateTransition.setAutoReverse( true );

        FadeTransition ft = new FadeTransition(Duration.millis( 500), press1);
        ft.setFromValue(1.0);
        ft.setToValue(0.0);
        ft.setCycleCount(1);
        ft.setAutoReverse(true);

        ParallelTransition parallelTransition = new ParallelTransition();
        parallelTransition.getChildren().addAll( rotateTransition, ft);

        parallelTransition.setCycleCount( 1 );
        parallelTransition.setAutoReverse( true);

        parallelTransition.play();

        helloWorld.setText("Hello World!");

        press1.setDisable( true);
    }
}
