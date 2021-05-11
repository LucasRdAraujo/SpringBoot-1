package com.example.htmlfy;

import com.example.htmlfy.models.Attribute;
import com.example.htmlfy.models.Tag;

public class Tr extends Tag {

    public Tr(Boolean closable, Attribute[] attributes, String... childElements) {
        super("tr", closable, attributes, childElements);
    }

    public Tr(Attribute[] attributes, String... childElements) {
        super("tr", attributes, childElements);
    }

    public Tr(Boolean closable, Attribute... attributes) {
        super("tr", closable, attributes);
    }

    public Tr(Boolean closable, String... childElements) {
        super("tr", closable, childElements);
    }

    public Tr(Attribute... attributes) {
        super("tr", attributes);
    }

    public Tr(String... childElements) {
        super("tr", childElements);
    }

    public Tr() {
        super("tr");
    }
    
}
