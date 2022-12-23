package com.example.application.views.main;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
// import com.example.application.models.main.*;

@PageTitle("Main")
@Route(value = "")
public class MainView extends HorizontalLayout {

    private TextField name;
    private Button sayHello;
    // private Surface surface = new Surface("Sphere", 1, 1, 0, 0, 0, -1);

    public MainView() {
        name = new TextField("Your name123");
        sayHello = new Button("Say hello");
        sayHello.addClickListener(e -> {
            Notification.show("surface.toString()");
        });
        sayHello.addClickShortcut(Key.ENTER);


        setMargin(true);
        setVerticalComponentAlignment(Alignment.END, name, sayHello);

        add(name, sayHello);
    }

}
