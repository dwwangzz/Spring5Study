package com.coco.study.spring5.service;

/**
 * @author wangzz
 * @date 2020年04月09日 14:37
 */

public class ClientBService {

    private static ClientBService clientBService = new ClientBService();

    private ClientBService() {
    }

    public static ClientBService createInstance() {
        return clientBService;
    }

}
