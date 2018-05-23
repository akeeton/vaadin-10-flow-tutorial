package com.vaadin;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * The main view contains a button and a template element.
 */
@HtmlImport("styles/shared-styles.html")
@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        ExampleTemplate myTemplate = new ExampleTemplate();

        Button button = new Button("Click me 3",
                event -> myTemplate.setValue("Clicked!"));

        add(button, myTemplate);
        setClassName("main-layout");
    }
}
