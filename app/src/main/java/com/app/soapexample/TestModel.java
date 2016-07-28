package com.app.soapexample;

import org.simpleframework.xml.Element;

public class TestModel {
    @Element(name = "tes:test")
    public String tes;

    public TestModel() {
        tes = "";
    }
}
