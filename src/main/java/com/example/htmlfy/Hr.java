package com.example.htmlfy;

import com.example.htmlfy.models.Attribute;
import com.example.htmlfy.models.Tag;

public class Hr extends Tag {

    public Hr(Boolean closable, Attribute[] attributes, String... childElements) {
        super("hr", closable, attributes, childElements);
    }

    public Hr(Attribute[] attributes, String... childElements) {
        super("hr", attributes, childElements);
    }

    public Hr(Boolean closable, Attribute... attributes) {
        super("hr", closable, attributes);
    }

    public Hr(Boolean closable, String... childElements) {
        super("hr", closable, childElements);
    }

    public Hr(Attribute... attributes) {
        super("hr", attributes);
    }

    public Hr(String... childElements) {
        super("hr", childElements);
    }

    public Hr(Boolean closable) {
        super("hr", closable);
    }

    public Hr() {
        super("hr");
    }

}
