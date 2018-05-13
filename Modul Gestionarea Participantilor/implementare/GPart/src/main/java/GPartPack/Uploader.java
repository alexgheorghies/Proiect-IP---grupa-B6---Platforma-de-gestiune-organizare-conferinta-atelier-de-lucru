package GPartPack;

import org.apache.http.HttpHeaders;
import org.apache.http.HttpHost;
import org.apache.http.NameValuePair;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicAuthCache;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.util.ArrayList;
import java.util.List;


public class Uploader {
    String currentUrl="http://desktop-jl7pmkf:8081/xwiki/rest/wikis/xwiki/spaces/XWiki/pages/Admin/objects";
    String host="desktop-jl7pmkf";
    String user="Admin";
    String password="Admin123";
    int port=8081;

    public void uploadPresentation () throws Exception
    {
        HttpHost target = new HttpHost(host, port, "http");
        CredentialsProvider credsProvider = new BasicCredentialsProvider();
        credsProvider.setCredentials(
                new AuthScope(target.getHostName(), target.getPort()),
                new UsernamePasswordCredentials(user, password));
        CloseableHttpClient httpclient = HttpClients.custom().setDefaultCredentialsProvider(credsProvider).build();

        try {
            // Create AuthCache instance
            AuthCache authCache = new BasicAuthCache();

            // Generate BASIC scheme object and add it to the local auth cache
            BasicScheme basicAuth = new BasicScheme();
            authCache.put(target, basicAuth);

            // Add AuthCache to the execution context
            HttpClientContext localContext = HttpClientContext.create();
            localContext.setAuthCache(authCache);
            localContext.setAttribute("preemptive-auth", basicAuth);

            HttpPost httpPost = new HttpPost(currentUrl);

            List<NameValuePair> nvps = new ArrayList<NameValuePair>();
            nvps.add(new BasicNameValuePair("className", "XWiki.XWikiUsers"));
            nvps.add(new BasicNameValuePair("property#first_name", "John"));
            nvps.add(new BasicNameValuePair("property#last_name", "Doe"));

            httpPost.addHeader(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
            httpPost.setHeader(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
            httpPost.setEntity(new UrlEncodedFormEntity(nvps));

            CloseableHttpResponse response = httpclient.execute(target, httpPost, localContext);

            try {
                // Request status
                int requestStatus = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();

                // do something useful with the response body

                // Request String response
                String requestResponse = EntityUtils.toString(entity);
                EntityUtils.consume(entity);
            } finally {
                response.close();
            }
        } finally {
            httpclient.close();
        }
    }
}
