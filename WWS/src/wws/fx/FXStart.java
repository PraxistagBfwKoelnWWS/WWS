/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wws.fx;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Günther
 */
public class FXStart extends Application
{    
    @Override
    public void start(Stage primaryStage) throws IOException
    {
        GridPane root = FXMLLoader.load(getClass().getResource("Start_FXML.fxml"));        
        Scene scene = new Scene(root);        
        primaryStage.setTitle("WWS");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }    
}
