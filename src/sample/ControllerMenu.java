package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ControllerMenu {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ListView<String> listView;

    @FXML
    private Button addFood;

    @FXML
    void OnMouseClickedAdd(MouseEvent event) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("StageAdd.fxml"));
            Stage stageAdd = new Stage();
            stageAdd.initStyle(StageStyle.UTILITY);
            stageAdd.setResizable(false);
            stageAdd.setTitle("+ Tilføj ny fødevarer");
            stageAdd.setScene(new Scene(root, 600, 335));
            stageAdd.show();
            //((Node)(event.getSource())).getScene().getWindow().hide();

            //TODO Set items in list view
        }
        catch (IOException e) {
        e.printStackTrace();
        }
    }

    @FXML
    void initialize() {
        assert addFood != null : "fx:id=\"addFood\" was not injected: check your FXML file 'StageMenu.fxml'.";
        assert listView != null : "fx:id=\"listView\" was not injected: check your FXML file 'StageMenu.fxml'.";

        ListView<String> list = new ListView<String>();
        ObservableList<String> items =FXCollections.observableArrayList (
                "Gulerødder", "Agurk", "Løg", "Mælk");
        listView.setItems(items);

    }
}
