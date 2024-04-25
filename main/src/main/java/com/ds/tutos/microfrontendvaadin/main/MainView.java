package com.ds.tutos.microfrontendvaadin.main;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.Unit;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends Div {

    public MainView() {
        add(new Text("Main view"));

        Sub1ComponentStub sub1ComponentStub = new Sub1ComponentStub();
        sub1ComponentStub.setWidth(100, Unit.PIXELS);
        sub1ComponentStub.setHeight(100, Unit.PIXELS);
        add(sub1ComponentStub);
    }
}
