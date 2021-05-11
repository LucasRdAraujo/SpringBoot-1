package com.example.htmlfy;

import com.example.htmlfy.models.Attribute;
import com.example.htmlfy.models.Tag;

public class P extends Tag {

    public P(Boolean closable, Attribute[] attributes, String... childElements) {
        super("p", closable, attributes, childElements);
    }

    public P(Attribute[] attributes, String... childElements) {
        super("p", attributes, childElements);
    }

    public P(Boolean closable, Attribute... attributes) {
        super("p", closable, attributes);
    }

    public P(Boolean closable, String... childElements) {
        super("p", closable, childElements);
    }

    public P(Attribute... attributes) {
        super("p", attributes);
    }

    public P(String... childElements) {
        super("p", childElements);
    }

    public P() {
        super("p");
    }
    
}
