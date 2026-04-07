package com.arq.tlsbuildernestedjava.http;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public class NestedHostnameBuilder {
    public HostnameVerifier build() {
        return NestedTlsHelpers.hostnameVerifier();
    }
}

final class NestedTlsHelpers {
    static HostnameVerifier hostnameVerifier() {
        return new HostnameVerifier() {
            @Override
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        };
    }
}
