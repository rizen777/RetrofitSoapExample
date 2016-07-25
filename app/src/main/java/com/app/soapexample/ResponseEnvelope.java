package com.app.soapexample;

import org.simpleframework.xml.Element;

public class ResponseEnvelope {
    @Element(name = "Name", required = false)
    public String name;
}
