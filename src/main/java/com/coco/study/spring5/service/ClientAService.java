package com.coco.study.spring5.service;

/**
 * @author wangzz
 * @date 2020年04月09日 14:37
 */

public class ClientAService {

    private static ClientAService clientAService = new ClientAService();

    private ClientAService() {
    }

    public static ClientAService createInstance() {
        return clientAService;
    }

}
