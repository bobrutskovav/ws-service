package com.example.alpha.mock;


import com.example.alpha.mock.model.ru.alfabank.ws.cs.eq.wscustomerbaseinfoinoutparms11.WSCustomerBaseInfoGetInParms;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

@Endpoint
public class MockController {
    private static final String NAMESPACE_URI = "http://WSCustomerBaseInfo11.EQ.CS.ws.alfabank.ru";

//    @RequestMapping(value = "/",
//            method = RequestMethod.POST,
//            consumes = MediaType.APPLICATION_XML_VALUE)
//    @ResponseStatus(HttpStatus.OK)
//    @ResponseBody

    @PayloadRoot(namespace = NAMESPACE_URI,localPart = "WSCustomerBaseInfoGet")
    public void mocked(@RequestPayload WSCustomerBaseInfoGetInParms request) {

        System.out.println(request);
        //Todo generate response model, generate request model, make a replace value

    }
}
