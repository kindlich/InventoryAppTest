package org.example;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.stage.*;


public class InventoryApp extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        final Rectangle2D visualBounds = Screen.getPrimary().getVisualBounds();
        final double height = visualBounds.getHeight();
        final double width = visualBounds.getWidth();
    
        
        final GridPane pane = new GridPane();
        final Border border = new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.DOTTED, CornerRadii.EMPTY, BorderWidths.DEFAULT));
        pane.borderProperty().setValue(border);
        pane.add(new Label("Some text"), 0, 0);
        pane.add(new Label("More Text"), 1, 0);
        pane.add(new Label("DoubleText"), 0, 1, 2, 1);
        pane.add(new Button("Some Button"), 0, 2);
        pane.add(new Button("Another Button"), 1, 2);
    
        final Scene scene = new Scene(pane, width, height);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
}
