package com.example.htmlfy;

import com.example.htmlfy.models.Attribute;
import com.example.htmlfy.models.Tag;

public class Form extends Tag {

    public Form(Boolean closable, Attribute[] attributes, String... childElements) {
        super("form", closable, attributes, childElements);
    }

    public Form(Boolean closable, Attribute... attributes) {
        super("form", closable, attributes);
    }

    public Form(Boolean closable, String... childElements) {
        super("form", closable, childElements);
    }

    public Form(Attribute... attributes) {
        super("form", attributes);
    }

    public Form(String... childElements) {
        super("form", childElements);
    }

    public Form() {
        super("form");
    }

}
