package ru.ilmira.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ChatWindowController {
    @FXML
    private TextArea messageTA;
    @FXML
    private TextField inputTF;

    @FXML
    private void sendMessage(ActionEvent event) {
        inputTF.requestFocus();
        if (inputTF.getText().isEmpty()) return;
        messageTA.appendText(inputTF.getText() + "\n");
        inputTF.clear();
    }
}
