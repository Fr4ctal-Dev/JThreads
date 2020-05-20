package com.company.u2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        ObservableFile observable = new ObservableFile("/Users/matt/IdeaProjects/JThreads/src/com/company/u2/jeff.txt");
        FileObserver observer = new FileObserver();



        observable.addPropertyChangeListener(observer);
        observable.write("text");

        //assertEquals(observer.getText(), "text");

    }

}
