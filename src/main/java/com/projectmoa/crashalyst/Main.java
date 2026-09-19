package com.projectmoa.crashalyst;

import javafx.stage.Stage;
import javafx.application.Application;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        System.out.println("beginning the crashout on JavaFX...");
        System.exit(0);
    }
}
