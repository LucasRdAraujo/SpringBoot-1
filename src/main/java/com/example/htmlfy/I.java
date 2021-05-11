package com.example.htmlfy;

import com.example.htmlfy.models.Attribute;
import com.example.htmlfy.models.Tag;

public class I extends Tag {

    public I(Boolean closable, Attribute[] attributes, String... childElements) {
        super("i", closable, attributes, childElements);
    }

    public I(Attribute[] attributes, String... childElements) {
        super("i", attributes, childElements);
    }

    public I(Boolean closable, Attribute... attributes) {
        super("i", closable, attributes);
    }

    public I(Boolean closable, String... childElements) {
        super("i", closable, childElements);
    }

    public I(Attribute... attributes) {
        super("i", attributes);
    }

    public I(String... childElements) {
        super("i", childElements);
    }

    public I() {
        super("i");
    }
    
}
