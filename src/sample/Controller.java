package sample;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML
    private Circle ball1, ball2;

    @FXML
    void initialize() {
        ball1.setOnMouseDragged(this::drag);
        ball2.setOnMouseDragged(this::drag);
    }

    public void drag(MouseEvent event) {
        Node n = (Node)event.getSource();
        n.setTranslateX(n.getTranslateX() + event.getX());
        n.setTranslateY(n.getTranslateY() + event.getY());
    }
}
