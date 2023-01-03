package dev.friday.com.fridayscraping.crawler;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;

public class WebCrawler {

    public static final HtmlPage getFromURI(String URI) throws IOException {
        return getConfiguredWebClient().getPage(URI);
    }

    public static final WebClient getConfiguredWebClient() {
        WebClient client = new WebClient();
        client.getOptions().setCssEnabled(false);
        client.getOptions().setJavaScriptEnabled(false);
        return client;
    }
}
