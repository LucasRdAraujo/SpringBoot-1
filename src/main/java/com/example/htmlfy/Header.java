package com.example.htmlfy;

import com.example.htmlfy.models.Attribute;
import com.example.htmlfy.models.Tag;

public class Header extends Tag {

    public Header(Boolean closable, Attribute[] attributes, String... childElements) {
        super("header", closable, attributes, childElements);
    }

    public Header(Boolean closable, Attribute... attributes) {
        super("header", closable, attributes);
    }

    public Header(Boolean closable, String... childElements) {
        super("header", closable, childElements);
    }

    public Header(Attribute... attributes) {
        super("header", attributes);
    }

    public Header(String... childElements) {
        super("header", childElements);
    }

    public Header() {
        super("header");
    }
    
}
