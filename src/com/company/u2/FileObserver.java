package com.company.u2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class FileObserver implements PropertyChangeListener {

    String text;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.setText((String) evt.getNewValue());
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
