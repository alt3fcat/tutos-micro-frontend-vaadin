package com.ds.tutos.microfrontendvaadin.main;

import com.vaadin.flow.component.*;

import static com.ds.tutos.microfrontendvaadin.main.Sub1ComponentStub.TAG_NAME;

@Tag(TAG_NAME)
public class Sub1ComponentStub extends Component implements HasSize {

    public static final String TAG_NAME = "sub1-comp";

    @Override
    protected void onAttach(AttachEvent attachEvent) {
        super.onAttach(attachEvent);
        UI.getCurrent().getPage().executeJs("var s = document.createElement('script');s.type='module'; s.src=$0;document.head.appendChild(s);",
                "http://localhost:8001/web-component/"+TAG_NAME+".js");
    }
}
