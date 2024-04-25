package com.ds.tutos.microfrontendvaadin.sub1;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

public class Sub1Component extends Div {

    public Sub1Component() {
        add(new Text("Sub1"));
        add(new Button("sub1 button"));
    }
}
