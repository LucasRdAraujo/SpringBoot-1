package com.example.htmlfy;

import com.example.htmlfy.models.Attribute;
import com.example.htmlfy.models.Tag;

public class Meta extends Tag {

    public Meta(Boolean closable, Attribute[] attributes, String... childElements) {
        super("meta", closable, attributes, childElements);
    }

    public Meta(Attribute[] attributes, String... childElements) {
        super("meta", attributes, childElements);
    }

    public Meta(Boolean closable, Attribute... attributes) {
        super("meta", closable, attributes);
    }

    public Meta(Boolean closable, String... childElements) {
        super("meta", closable, childElements);
    }

    public Meta(Attribute... attributes) {
        super("meta", attributes);
    }

    public Meta(String... childElements) {
        super("meta", childElements);
    }

    public Meta() {
        super("meta");
    }

}
