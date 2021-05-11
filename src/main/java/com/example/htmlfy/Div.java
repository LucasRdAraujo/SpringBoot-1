package com.example.htmlfy;

import com.example.htmlfy.models.Attribute;
import com.example.htmlfy.models.Tag;

public class Div extends Tag {

    public Div(Boolean closable, Attribute[] attributes, String... childElements) {
        super("div", closable, attributes, childElements);
    }

    public Div(Attribute[] attributes, String... childElements) {
        super("div", attributes, childElements);
    }

    public Div(Boolean closable, Attribute... attributes) {
        super("div", closable, attributes);
    }

    public Div(Boolean closable, String... childElements) {
        super("div", closable, childElements);
    }

    public Div(Attribute... attributes) {
        super("div", attributes);
    }

    public Div(String... childElements) {
        super("div", childElements);
    }

    public Div() {
        super("div");
    }

}
