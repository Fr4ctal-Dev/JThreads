package com.company.u2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ObservableFile extends File {

    private String text;

    private PropertyChangeSupport support;

    public ObservableFile(String pathname) {
        super(pathname);
        support = new PropertyChangeSupport(this);

    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    public void write(String text) throws IOException {
        FileWriter fw = new FileWriter(this);
        fw.write(text);
        support.firePropertyChange("text", this.text, text);
        this.text = text;
    }


}
