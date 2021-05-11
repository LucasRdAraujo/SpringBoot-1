package com.example.htmlfy;

import com.example.htmlfy.models.Attribute;
import com.example.htmlfy.models.Tag;

public class Link extends Tag {

    public Link(Boolean closable, Attribute[] attributes, String... childElements) {
        super("link", closable, attributes, childElements);
    }

    public Link(Attribute[] attributes, String... childElements) {
        super("link", attributes, childElements);
    }

    public Link(Boolean closable, Attribute... attributes) {
        super("link", closable, attributes);
    }

    public Link(Boolean closable, String... childElements) {
        super("link", closable, childElements);
    }

    public Link(Attribute... attributes) {
        super("link", attributes);
    }

    public Link(String... childElements) {
        super("link", childElements);
    }

    public Link() {
        super("link");
    }

}
