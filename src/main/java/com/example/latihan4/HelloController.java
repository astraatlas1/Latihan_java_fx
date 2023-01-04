package com.example.latihan4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    TextField tfBilanganPertama;
    @FXML
    TextField tfBilanganKedua;
    @FXML
    Button btnTambah;
    @FXML
    Button btnKurang;
    @FXML
    Button btnKali;
    @FXML
    Button btnBagi;
    @FXML
    TextField hasilBilangan;
    @FXML
    public void onButtonClicked(ActionEvent e){
        BilanganModel bilanganModel = new BilanganModel();

        try {
            bilanganModel.setBilanganPertama(
                    Double.parseDouble(tfBilanganPertama.getText())
            );
            bilanganModel.setBilanganKedua(
                    Double.parseDouble(tfBilanganKedua.getText())
            );
        } catch (NumberFormatException e1) {
            hasilBilangan.setText("Masukkan hanya boleh angka");
            return;
        }
        if (e.getTarget().equals(btnTambah)) {
            bilanganModel.setHasil(bilanganModel.getBilanganPertama() + bilanganModel.getBilanganKedua());
            hasilBilangan.setText(String.valueOf(bilanganModel.getHasil()));
        } else if(e.getTarget().equals(btnKurang)) {
            bilanganModel.setHasil(bilanganModel.getBilanganPertama() - bilanganModel.getBilanganKedua());
            hasilBilangan.setText(String.valueOf(bilanganModel.getHasil()));
        } else if (e.getTarget().equals(btnKali)) {
            bilanganModel.setHasil(bilanganModel.getBilanganPertama() * bilanganModel.getBilanganKedua());
            hasilBilangan.setText(String.valueOf(bilanganModel.getHasil()));
        } else if (e.getTarget().equals(btnBagi)) {
            bilanganModel.setHasil(bilanganModel.getBilanganPertama() / bilanganModel.getBilanganKedua());
            hasilBilangan.setText(String.valueOf(bilanganModel.getHasil()));
        }
    }
}