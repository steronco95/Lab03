/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.spellchecker;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.spellchecker.model.Model;
import it.polito.tdp.spellchecker.model.RichWord;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class FXMLController {

	private Model model;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblLanguage;

    @FXML
    private ComboBox<String> cBoxLingue;

    @FXML
    private TextArea txtInserisciTesto;

    @FXML
    private Button btnSpellCheck;

    @FXML
    private TextArea txtErrori;

    @FXML
    private Label lbError;

    @FXML
    private Button btnClear;

    @FXML
    private Label lblTime;

    @FXML
    void doClearText(ActionEvent event) {

    }

    @FXML
    void doSelectLanguage(ActionEvent event) {

    }

    @FXML
    void doSpellCheck(ActionEvent event) {
    	
    	String inserisci = txtInserisciTesto.getText();
    	
    	String ins = inserisci.replaceAll("[.,\\/#!?$%\\^&\\*;:{}=\\-_`~()\\[\\]\"]", "");
    	
    	model.setInserimento(ins);
    	
    	txtErrori.appendText(model.toString());
    	
     
    }

    @FXML
    void initialize() {
        assert lblLanguage != null : "fx:id=\"lblLanguage\" was not injected: check your FXML file 'Scene.fxml'.";
        assert cBoxLingue != null : "fx:id=\"cBoxLingue\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtInserisciTesto != null : "fx:id=\"txtInserisciTesto\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnSpellCheck != null : "fx:id=\"btnSpellCheck\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtErrori != null : "fx:id=\"txtErrori\" was not injected: check your FXML file 'Scene.fxml'.";
        assert lbError != null : "fx:id=\"lbError\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'Scene.fxml'.";
        assert lblTime != null : "fx:id=\"lblTime\" was not injected: check your FXML file 'Scene.fxml'.";
        cBoxLingue.getItems().addAll("English","Italian");
        model = new Model();
    }
}


