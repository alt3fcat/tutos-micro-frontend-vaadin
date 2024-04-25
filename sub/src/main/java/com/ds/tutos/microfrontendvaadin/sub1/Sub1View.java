package com.ds.tutos.microfrontendvaadin.sub1;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("")
public class Sub1View extends Div {

    public Sub1View() {
        add(new Sub1Component());
    }
}
