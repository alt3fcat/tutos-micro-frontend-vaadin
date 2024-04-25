package com.ds.tutos.microfrontendvaadin.sub1;

import com.vaadin.flow.component.WebComponentExporter;
import com.vaadin.flow.component.webcomponent.WebComponent;

public class Sub1ComponentExporter extends WebComponentExporter<Sub1Component> {

    public static final String TAG_NAME = "sub1-comp";

    public Sub1ComponentExporter() {
        super(TAG_NAME);
//        addProperty("userlbl", "")
//                .onChange(LoginForm::setUserNameLabel);
//        addProperty("pwdlbl", "")
//                .onChange(LoginForm::setPasswordLabel);
    }

    @Override
    protected void configureInstance(WebComponent<Sub1Component> webComponent, Sub1Component sub1Component) {
//        this.
//        form.addLoginListener(() ->
//                webComponent.fireEvent("logged-in"));
    }
}
