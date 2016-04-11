/*
 _____________________________________________________________________________
 
            Project:    GUI 2016
  _____________________________________________________________________________
  
         Created by:    Johannes Weigend, QAware GmbH
      Creation date:    March 2016
  _____________________________________________________________________________
  
          License:      Apache License 2.0
  _____________________________________________________________________________ 
 */
package v3.login;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 *
 * @author weigend
 */
public class LoginController implements Initializable {

    @FXML
    private TextField user;
    
    @FXML
    private TextField password;

    
    public void doLogin(ActionEvent e) {
        System.out.println("Login: " + user.getText() + ", password: " + password.getText());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
            
    }
}
