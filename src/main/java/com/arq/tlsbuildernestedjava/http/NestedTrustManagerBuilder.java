package com.arq.tlsbuildernestedjava.http;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

public class NestedTrustManagerBuilder {
    public X509TrustManager build() {
        return NestedTrustManagerFactory.insecure();
    }
}

final class NestedTrustManagerFactory {
    static X509TrustManager insecure() {
        return new X509TrustManager() {
            @Override
            public void checkClientTrusted(X509Certificate[] chain, String authType) {
            }

            @Override
            public void checkServerTrusted(X509Certificate[] chain, String authType) {
            }

            @Override
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        };
    }
}
