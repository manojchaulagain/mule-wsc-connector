/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.extension.ws.runtime.wss;

import static org.mule.extension.ws.AllureConstants.WscFeature.WSC_EXTENSION;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.ws.security.wss4j.WSS4JInInterceptor;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@Feature(WSC_EXTENSION)
@Story("WSS")
public class WssSignTestCase extends AbstractWebServiceSecurityTestCase {

  private final static String SIGN = "sign";

  public WssSignTestCase() {
    super(SIGN);
  }

  @Override
  protected Interceptor buildInInterceptor() {
    final Map<String, Object> props = new HashMap<>();
    props.put("action", "Signature");

    final String signaturePropRefId = "serverInSecurityProperties";
    props.put("signaturePropRefId", signaturePropRefId);
    final Properties securityProperties = new Properties();
    securityProperties.put("org.apache.ws.security.crypto.merlin.truststore.type", "jks");
    securityProperties.put("org.apache.ws.security.crypto.merlin.truststore.password", "mulepassword");
    securityProperties.put("org.apache.ws.security.crypto.merlin.truststore.file", "security/trustStore");
    props.put(signaturePropRefId, securityProperties);

    return new WSS4JInInterceptor(props);
  }
}
