package com.example.htmlfy;

import com.example.htmlfy.models.Attribute;
import com.example.htmlfy.models.Tag;

public class Table extends Tag {

    public Table(Boolean closable, Attribute[] attributes, String... childElements) {
        super("table", closable, attributes, childElements);
    }

    public Table(Attribute[] attributes, String... childElements) {
        super("table", attributes, childElements);
    }

    public Table(Boolean closable, Attribute... attributes) {
        super("table", closable, attributes);
    }

    public Table(Boolean closable, String... childElements) {
        super("table", closable, childElements);
    }

    public Table(Attribute... attributes) {
        super("table", attributes);
    }

    public Table(String... childElements) {
        super("table", childElements);
    }

    public Table() {
        super("table");
    }
    
}
