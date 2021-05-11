package com.example.htmlfy;

import com.example.htmlfy.models.Attribute;
import com.example.htmlfy.models.Tag;

public class Td extends Tag {

    public Td(Boolean closable, Attribute[] attributes, String... childElements) {
        super("td", closable, attributes, childElements);
    }

    public Td(Attribute[] attributes, String... childElements) {
        super("td", attributes, childElements);
    }

    public Td(Boolean closable, Attribute... attributes) {
        super("td", closable, attributes);
    }

    public Td(Boolean closable, String... childElements) {
        super("td", closable, childElements);
    }

    public Td(Attribute... attributes) {
        super("td", attributes);
    }

    public Td(String... childElements) {
        super("td", childElements);
    }

    public Td() {
        super("td");
    }

}
