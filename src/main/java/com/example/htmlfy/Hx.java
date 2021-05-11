package com.example.htmlfy;

import com.example.htmlfy.models.Attribute;
import com.example.htmlfy.models.Tag;

public class Hx extends Tag {
    
    public Hx(Boolean closable, Integer number, Attribute[] attributes, String... childElements) {
        super((number == null) ? "h1" : "h"+number, closable, attributes, childElements);
    }

    public Hx(Integer number, Attribute[] attributes, String... childElements) {
        super((number == null) ? "h1" : "h"+number, attributes, childElements);
    }

    public Hx(Boolean closable, Integer number, Attribute... attributes) {
        super((number == null) ? "h1" : "h"+number, closable, attributes);
    }

    public Hx(Boolean closable, Integer number, String... childElements) {
        super((number == null) ? "h1" : "h"+number, closable, childElements);
    }

    public Hx(Integer number, Attribute... attributes) {
        super((number == null) ? "h1" : "h"+number, attributes);
    }

    public Hx(Integer number, String... childElements) {
        super((number == null) ? "h1" : "h"+number, childElements);
    }

    public Hx(Integer number) {
        super((number == null) ? "h1" : "h"+number);
    }
    
}
