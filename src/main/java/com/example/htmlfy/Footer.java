package com.example.htmlfy;

import com.example.htmlfy.models.Attribute;
import com.example.htmlfy.models.Tag;

public class Footer extends Tag {

    public Footer(Boolean closable, Attribute[] attributes, String... childElements) {
        super("footer", closable, attributes, childElements);
    }

    public Footer(Boolean closable, Attribute... attributes) {
        super("footer", closable, attributes);
    }

    public Footer(Boolean closable, String... childElements) {
        super("footer", closable, childElements);
    }

    public Footer(Attribute... attributes) {
        super("footer", attributes);
    }

    public Footer(String... childElements) {
        super("footer", childElements);
    }

    public Footer() {
        super("footer");
    }
    
}
