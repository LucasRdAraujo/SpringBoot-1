package com.example.htmlfy;

import com.example.htmlfy.models.Attribute;
import com.example.htmlfy.models.Tag;

public class Br extends Tag {

    public Br(Boolean closable, Attribute[] attributes, String... childElements) {
        super("br", closable, attributes, childElements);
    }

    public Br(Boolean closable, Attribute... attributes) {
        super("br", closable, attributes);
    }

    public Br(Boolean closable, String... childElements) {
        super("br", closable, childElements);
    }

    public Br(Attribute... attributes) {
        super("br", attributes);
    }

    public Br(String... childElements) {
        super("br", childElements);
    }

    public Br() {
        super("br");
    }
    
}
