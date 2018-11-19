package com.mithilesh.pathbuilder;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class URL {
    public static final URLBuilder URL_BUILDER= new URLBuilder();
    private final String url;
    private final String port;
    private final String host;
    private final String path1;
    private final String path2;
    private final String path3;

    public  static String _url;

    private URL(URLBuilder urlBuilder) {
        this.url = urlBuilder.url;
        this.port = urlBuilder.port;
        this.host = urlBuilder.host;
        this.path1 = urlBuilder.path1;
        this.path2 = urlBuilder.path2;
        this.path3 = urlBuilder.path3;
    }

    public  static final class URLBuilder
    {
        private  String url;
        private  String port;
        private  String host;
        private String path1;
        private String path2;
        private String path3;

        public URLBuilder addUrl(String url)
        {
            this.url=url;
            return this;
        }
        public URLBuilder addPort(String port)
        {
            this.port=port;
            return this;
        }
        public URLBuilder addhost(String host)
        {
            this.host=host;
            return this;
        }
        public URLBuilder addPath1(String path1)
        {
            this.path1=path1;
            return this;
        }
        public URLBuilder path2(String path2)
        {
            this.path2=path2;
            return this;
        }

        public URLBuilder path3(String path3)
        {
            this.path3=path3;
            return this;
        }

        public URL build()
        {
            URL._url = ReflectionToStringBuilder.toString(this,NotNullToStringStyle.NOT_NULL_STYLE,true,true);
           return new URL(this);
        }
    }


}
