package com.vaadin;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("some/path")
public class PathComponent extends Div {
    public PathComponent() {
        setText("Hello @Route!");
    }
}
