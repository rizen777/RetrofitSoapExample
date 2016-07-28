package com.app.soapexample;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.NamespaceList;
import org.simpleframework.xml.Root;

@Root(name = "soap12:Envelope")
@NamespaceList({
        @Namespace(reference = "test.belspec.com", prefix = "tes"),
        @Namespace(prefix = "soap12", reference = "http://schemas.xmlsoap.org/soap/envelope/")
})
public class RequestEnvelope {
    @Element(name = "soap12:Body")
    public TestModel body;

    public void setBody(TestModel body) {
        this.body = body;
    }
}
