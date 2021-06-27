package ru.ilmira.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ChatWindowController {
    @FXML
    private TextArea messageTA;
    @FXML
    private TextField messageTF;

    @FXML
    private void sendMessage(ActionEvent event) {
        messageTF.requestFocus();
        if (messageTF.getText().isEmpty()) return;
        messageTA.appendText(messageTF.getText() + "\n");
        messageTF.clear();
    }
}
