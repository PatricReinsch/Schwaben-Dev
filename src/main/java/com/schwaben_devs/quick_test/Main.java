package com.schwaben_devs.quick_test;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(80), 0);

        server.createContext("/api/offers", new HttpHandlerClass());

        server.start();
        System.out.println("Server läuft auf http://localhost:8000");
    }
}
