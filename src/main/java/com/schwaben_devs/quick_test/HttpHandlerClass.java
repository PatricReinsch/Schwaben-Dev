package com.schwaben_devs.quick_test;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class HttpHandlerClass implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String method = exchange.getRequestMethod();
        String response = "";

        switch (method) {
            case "GET":
                response = "GET Request erfolgreich ye\n";
                System.out.println("GET Request");
                break;
            case "POST":
                response = "POST Request erfolgreich ye\n";
                System.out.println("POST Request");
                break;
            case "DELETE":
                response = "DELETE Request erfolgreich ye\n";
                System.out.println("DELETE Request");
                break;
        }

        exchange.sendResponseHeaders(200, response.getBytes().length);
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}
