package com.vaadin;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.*;

@Route("greet")
@PageTitle("greet")
public class HasUrlParameterExample1 extends Div implements HasUrlParameter<String> {
    @Override
    public void setParameter(BeforeEvent beforeEvent, @WildcardParameter String s) {
        setText(String.format("Hello, %s!", s));
    }
}
