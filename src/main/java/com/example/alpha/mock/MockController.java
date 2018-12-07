package com.example.alpha.mock;


import com.example.alpha.mock.model.ru.alfabank.ws.cs.eq.wscustomerbaseinfoinoutparms11.WSCustomerBaseInfoGetInParms;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

@Endpoint
public class MockController {
    private static final String NAMESPACE_URI = "http://WSCustomerBaseInfo11.EQ.CS.ws.alfabank.ru";


    @PayloadRoot(namespace = NAMESPACE_URI,localPart = "WSCustomerBaseInfoGet")
    public void mocked(@RequestPayload WSCustomerBaseInfoGetInParms request) {
        //Проблема в том, что приходит реквест, но в нем везде null, хотя нет никаких эксепшенов или других видимых проблем, думаю что дело в построении неправильной модели, xjc строит две модели данных вместо одной(((
        System.out.println(request);
        //Todo generate response model, generate request model, make a replace value

    }
}
