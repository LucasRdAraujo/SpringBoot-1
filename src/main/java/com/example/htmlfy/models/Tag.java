package com.example.htmlfy.models;

public class Tag {
    private String name;
    private Attribute[] attributes;
    private String[] childElements;
    private Boolean closable;

    public Tag(String name, Boolean closable, Attribute[] attributes, String... childElements) {
        this.name = name;
        this.closable = closable;
        this.attributes = attributes;
        this.childElements = childElements;
    }

    public Tag(String name, Attribute[] attributes, String... childElements) {
        this.name = name;
        this.closable = true;
        this.attributes = attributes;
        this.childElements = childElements;
    }

    public Tag(String name, Boolean closable, Attribute... attributes) {
        this.name = name;
        this.closable = closable;
        this.attributes = attributes;
    }

    public Tag(String name, Boolean closable, String... childElements) {
        this.name = name;
        this.closable = closable;
        this.childElements = childElements;
    }

    public Tag(String name, Boolean closable) {
        this.name = name;
        this.closable = closable;
    }

    public Tag(String name, Attribute... attributes) {
        this.name = name;
        this.closable = true;
        this.attributes = attributes;
    }

    public Tag(String name, String... childElements) {
        this.name = name;
        this.closable = true;
        this.childElements = childElements;
    }

    public Tag(String name) {
        this.name = name;
        this.closable = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Attribute[] getAttributes() {
        return attributes;
    }

    public void setAttributes(Attribute[] attributes) {
        this.attributes = attributes;
    }

    public String[] getChildElements() {
        return childElements;
    }

    public void setChildElements(String[] childElements) {
        this.childElements = childElements;
    }

    public Boolean getClosable() {
        return closable;
    }

    public void setClosable(Boolean closable) {
        this.closable = closable;
    }

    public String create() {
        StringBuilder sb = new StringBuilder().append("<").append(name);

        if (attributes != null)
            for (Attribute att : attributes) {
                String type = att.getType();
                String value = att.getValue();
                if (type != null)
                    sb.append(" ").append(type);
                if (value != null)
                    sb.append("=\"").append(value).append("\"");
            }

        sb.append(">");
        if (childElements == null) {
            if (closable)
                sb.append("</").append(name).append(">");
        } else {
            for (String element : childElements)
                sb.append(element);
            sb.append("</").append(name).append(">");
        }
        return sb.toString();
    }
}
