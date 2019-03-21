package com.Testing.MyMavenProject12.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.widget.client.TextButton;

public class App implements EntryPoint {

    @Override
    public void onModuleLoad() {
        RootPanel.get().add(new TextButton("TextButton"));
    }
}
