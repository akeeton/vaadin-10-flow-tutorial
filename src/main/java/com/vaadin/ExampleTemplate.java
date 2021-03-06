package com.vaadin;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.ExampleTemplate.ExampleModel;

/**
 * Simple template example.
 */
@Tag("example-template")
@HtmlImport("src/example-template.html")
public class ExampleTemplate extends PolymerTemplate<ExampleModel> {

    /**
     * Template model which defines the single "value" property.
     */
    public interface ExampleModel extends TemplateModel {

        void setValue(String value);
    }

    public ExampleTemplate() {
        // Set the initial value to the "value" property.
        this.getModel().setValue("Not clicked");
    }

    /*
     * Allow setting the value property from outside of the class.
     */
    public void setValue(String value) {
        this.getModel().setValue(value);
    }
}
