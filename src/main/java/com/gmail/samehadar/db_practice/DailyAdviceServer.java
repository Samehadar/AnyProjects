package com.gmail.samehadar.db_practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by User on 16.09.2016.
 */
public class DailyAdviceServer {

    String[] adviceList = {
        "Ешьте меньшими порциями", "Купите облегающие джинсы. Нет, они не делают вас полнее",
            "Два слова: не годится", "Будьте честны хотя бы сегодня. Скажите своему началньику все, что вы \" на самом деле\" о нем думаете.",
            "Возможно, вам стоит подобрать другую прическу."};

    public void doIt() {
        try {
            ServerSocket serverSocket = new ServerSocket(4242);

            while (true) {
                Socket sock = serverSocket.accept();

                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getAdvice() {
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.doIt();
    }

}
