package com.example.htmlfy;

import com.example.htmlfy.models.Attribute;
import com.example.htmlfy.models.Tag;

public class Html extends Tag {

    public Html(Boolean closable, Attribute[] attributes, String... childElements) {
        super("html", closable, attributes, childElements);
    }

    public Html(Attribute[] attributes, String... childElements) {
        super("html", attributes, childElements);
    }

    public Html(Boolean closable, Attribute... attributes) {
        super("html", closable, attributes);
    }

    public Html(Boolean closable, String... childElements) {
        super("html", closable, childElements);
    }

    public Html(Attribute... attributes) {
        super("html", attributes);
    }

    public Html(String... childElements) {
        super("html", childElements);
    }

    public Html() {
        super("html");
    }

}
