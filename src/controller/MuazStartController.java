package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class MuazStartController implements Initializable {

    @FXML
    private WebView webView;

    private WebEngine engine;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        engine = webView.getEngine();
        loadPage();
    }

    public void loadPage() {
        engine.load("https://github.com/Muazgoat/");
    }
}
