/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wws.fx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Günther
 */
public class Start_FXMLController implements Initializable
{
    @FXML
    private TextField userNameTextField;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
       System.out.println("Controller initialized, works fine");
    }
    
    @FXML
    private void handleLoginButtonAction(ActionEvent e)
    {
        
    }
    
    @FXML
    private void handleConnectionButtonAction(ActionEvent e)
    {
        
    }
}
