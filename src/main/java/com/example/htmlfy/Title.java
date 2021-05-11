package com.example.htmlfy;

import com.example.htmlfy.models.Attribute;
import com.example.htmlfy.models.Tag;

public class Title extends Tag{

    public Title(Boolean closable, Attribute[] attributes, String... childElements) {
        super("title", closable, attributes, childElements);
    }

    public Title(Attribute[] attributes, String... childElements) {
        super("title", attributes, childElements);
    }

    public Title(Boolean closable, Attribute... attributes) {
        super("title", closable, attributes);
    }

    public Title(Boolean closable, String... childElements) {
        super("title", closable, childElements);
    }

    public Title(Attribute... attributes) {
        super("title", attributes);
    }

    public Title(String... childElements) {
        super("title", childElements);
    }

    public Title() {
        super("title");
    }
    
}
