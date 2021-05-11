package com.example.htmlfy;

import com.example.htmlfy.models.Attribute;
import com.example.htmlfy.models.Tag;

public class Script extends Tag {

    public Script(Boolean closable, Attribute[] attributes, String... childElements) {
        super("script", closable, attributes, childElements);
    }

    public Script(Attribute[] attributes, String... childElements) {
        super("script", attributes, childElements);
    }

    public Script(Boolean closable, Attribute... attributes) {
        super("script", closable, attributes);
    }

    public Script(Boolean closable, String... childElements) {
        super("script", closable, childElements);
    }

    public Script(Attribute... attributes) {
        super("script", attributes);
    }

    public Script(String... childElements) {
        super("script", childElements);
    }

    public Script() {
        super("script");
    }
    
}
