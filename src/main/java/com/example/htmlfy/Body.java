package com.example.htmlfy;

import com.example.htmlfy.models.Attribute;
import com.example.htmlfy.models.Tag;


public class Body extends Tag {

    public Body(Boolean closable, Attribute[] attributes, String... childElements) {
        super("body", closable, attributes, childElements);
    }

    public Body(Attribute[] attributes, String... childElements) {
        super("body", attributes, childElements);
    }

    public Body(Boolean closable, Attribute... attributes) {
        super("body", closable, attributes);
    }

    public Body(Boolean closable, String... childElements) {
        super("body", closable, childElements);
    }

    public Body(Attribute... attributes) {
        super("body", attributes);
    }

    public Body(String... childElements) {
        super("body", childElements);
    }

    public Body() {
        super("body");
    }
    
}
