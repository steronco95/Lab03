/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.spellchecker;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.spellchecker.model.Dictionary;
import it.polito.tdp.spellchecker.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class FXMLController {

	private Model model;
	private Dictionary dictionary = new Dictionary();
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> boxTendina;

    @FXML
    private TextArea txtVisualizza;

    @FXML
    private Button btnControlloTesto;

    @FXML
    private TextArea txtErrori;

    @FXML
    private Label numeroErrori;

    @FXML
    private Button btnCleat;

    @FXML
    private Label lblTime;

    @FXML
    void addBox(ActionEvent event) {

    	dictionary.loadDictionary(boxTendina.getId());
    	
    	txtVisualizza.appendText(dictionary.getDictionary());
    	
    }

    @FXML
    void doClear(ActionEvent event) {

    }

    @FXML
    void doControlloTesto(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert boxTendina != null : "fx:id=\"boxTendina\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtVisualizza != null : "fx:id=\"txtVisualizza\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnControlloTesto != null : "fx:id=\"btnControlloTesto\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtErrori != null : "fx:id=\"txtErrori\" was not injected: check your FXML file 'Scene.fxml'.";
        assert numeroErrori != null : "fx:id=\"numeroErrori\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnCleat != null : "fx:id=\"btnCleat\" was not injected: check your FXML file 'Scene.fxml'.";
        assert lblTime != null : "fx:id=\"lblTime\" was not injected: check your FXML file 'Scene.fxml'.";
        boxTendina.getItems().addAll("English","Italian");
        
    }
    
    public void setModel(Model model) {
    	this.model = model;
    	
    }
}
