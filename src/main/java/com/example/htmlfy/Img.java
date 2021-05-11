package com.example.htmlfy;

import com.example.htmlfy.models.Attribute;
import com.example.htmlfy.models.Tag;

public class Img extends Tag {

    public Img(Boolean closable, Attribute[] attributes, String... childElements) {
        super("img", closable, attributes, childElements);
    }

    public Img(Attribute[] attributes, String... childElements) {
        super("img", attributes, childElements);
    }

    public Img(Boolean closable, Attribute... attributes) {
        super("img", closable, attributes);
    }

    public Img(Boolean closable, String... childElements) {
        super("img", closable, childElements);
    }

    public Img(Attribute... attributes) {
        super("img", attributes);
    }

    public Img(String... childElements) {
        super("img", childElements);
    }

    public Img() {
        super("img");
    }

}
