package com.example.modul6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        TableView<Mahasiswa> tableView = new TableView<>();


        TableColumn<Mahasiswa, String> column1 =
                new TableColumn<>("NIM");

        column1.setCellValueFactory(
                new PropertyValueFactory<>("nim"));

        TableColumn<Mahasiswa, String> column2 =
                new TableColumn<>("Nama");

        column2.setCellValueFactory(
                new PropertyValueFactory<>("Nama"));

        tableView.getColumns().addAll(column1, column2);

        tableView.getItems().add(
                new Mahasiswa(1, "Venti", "3210817210017"));
        tableView.getItems().add(
                new Mahasiswa(2, "Zhongli", "3210817110010"));
        tableView.getItems().add(
                new Mahasiswa(3, "Raiden Ei", "3210817220015"));
        tableView.getItems().add(
                new Mahasiswa(4, "Nahida", "3210817120005"));
        tableView.getItems().add(
                new Mahasiswa(5, "Furina", "3210817320020"));
        tableView.getItems().add(
                new Mahasiswa(6, "Hu Tao", "3210817120001"));
        tableView.getItems().add(
                new Mahasiswa(7, "Yelan", "3210817210002"));
        tableView.getItems().add(
                new Mahasiswa(8, "Jean", "3210817120004"));
        tableView.getItems().add(
                new Mahasiswa(9, "Yanfei", "3210817320018"));
        tableView.getItems().add(
                new Mahasiswa(10, "Kazuha", "3210817220003"));

        VBox vbox = new VBox(tableView);

        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}