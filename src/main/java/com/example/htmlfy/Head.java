package com.example.htmlfy;

import com.example.htmlfy.models.Attribute;
import com.example.htmlfy.models.Tag;

public class Head extends Tag {

    public Head(Boolean closable, Attribute[] attributes, String... childElements) {
        super("head", closable, attributes, childElements);
    }

    public Head(Boolean closable, Attribute... attributes) {
        super("head", closable, attributes);
    }

    public Head(Boolean closable, String... childElements) {
        super("head", closable, childElements);
    }

    public Head(Attribute... attributes) {
        super("head", attributes);
    }

    public Head(String... childElements) {
        super("head", childElements);
    }

    public Head() {
        super("head");
    }
    
}
