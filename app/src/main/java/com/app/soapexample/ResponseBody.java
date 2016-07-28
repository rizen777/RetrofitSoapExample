package com.app.soapexample;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.NamespaceList;
import org.simpleframework.xml.Root;


@Root(name = "soap12:Body")
@NamespaceList({
        @Namespace(reference = "test.belspec.com", prefix = "tes"),
        @Namespace(prefix = "soap12", reference = "http://schemas.xmlsoap.org/soap/envelope/")
})
public class ResponseBody {
    @Element(name = "testResponse", required = false)
    ResponseData testResponse;
}
