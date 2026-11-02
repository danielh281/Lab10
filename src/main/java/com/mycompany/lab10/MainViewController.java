package com.mycompany.lab10;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

/**
 * FXML Controller class
 *
 * @author 2588731
 */
public class MainViewController implements Initializable {

    @FXML
    private MenuItem newItem;
    @FXML
    private MenuItem openItem;
    @FXML
    private MenuItem closeItem;
    @FXML
    private MenuItem saveItem;
    @FXML
    private MenuItem gridItem;
    @FXML
    private MenuItem copyItem;
    @FXML
    private Menu searchMenu;
    @FXML
    private MenuItem findItem;
    @FXML
    private MenuItem replaceItem;
    @FXML
    private MenuItem smallItem;
    @FXML
    private MenuItem mediumItem;
    @FXML
    private MenuItem largeItem;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleNew(ActionEvent event) {
    }

    @FXML
    private void handleOpen(ActionEvent event) {
    }

    @FXML
    private void handleClose(ActionEvent event) {
    }

    @FXML
    private void handleGrid(ActionEvent event) {
    }

    @FXML
    private void handleCopy(ActionEvent event) {
    }

    @FXML
    private void handleFind(ActionEvent event) {
    }

    @FXML
    private void handleReplace(ActionEvent event) {
    }

    @FXML
    private void handleSizeSmall(ActionEvent event) {
    }

    @FXML
    private void handleSizeMedium(ActionEvent event) {
    }

    @FXML
    private void handleSizeLarge(ActionEvent event) {
    }
    
}
