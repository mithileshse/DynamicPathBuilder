package com.mithilesh.pathbuilder;

public class Main {
    public static void main(String[] args) {

        URL url = URL.URL_BUILDER.
                addUrl("http:/").addhost("localhost").addPort("8086").addPath1("view.jsp").build();
        System.out.println(URL._url);
    }
}
