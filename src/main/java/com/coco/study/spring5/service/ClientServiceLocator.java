package com.coco.study.spring5.service;

/**
 * @author wangzz
 * @date 2020年04月09日 14:42
 */

public class ClientServiceLocator {

    private static ClientAService clientAService = ClientAService.createInstance();
    private static ClientBService clientBService = ClientBService.createInstance();

    public ClientAService createClientAServiceInstance() {
        return clientAService;
    }

    public ClientBService createClientBServiceInstance() {
        return clientBService;
    }

}
