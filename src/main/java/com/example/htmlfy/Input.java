package com.example.htmlfy;

import com.example.htmlfy.models.Attribute;
import com.example.htmlfy.models.Tag;

public class Input extends Tag {

    public Input(Boolean closable, Attribute[] attributes, String... childElements) {
        super("input", closable, attributes, childElements);
    }

    public Input(Attribute[] attributes, String... childElements) {
        super("input", attributes, childElements);
    }

    public Input(Boolean closable, Attribute... attributes) {
        super("input", closable, attributes);
    }

    public Input(Boolean closable, String... childElements) {
        super("input", closable, childElements);
    }

    public Input(Attribute... attributes) {
        super("input", attributes);
    }

    public Input(String... childElements) {
        super("input", childElements);
    }

    public Input() {
        super("input");
    }
    
}
