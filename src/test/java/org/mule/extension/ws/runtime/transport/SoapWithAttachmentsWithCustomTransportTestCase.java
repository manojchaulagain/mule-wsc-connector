/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.extension.ws.runtime.transport;

import static org.mule.extension.ws.AllureConstants.WscFeature.WSC_EXTENSION;

import io.qameta.allure.Stories;
import org.mule.extension.ws.runtime.SoapWithAttachmentsTestCase;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;

@Feature(WSC_EXTENSION)
@Stories({@Story("Attachments"), @Story("MTOM")})
public class SoapWithAttachmentsWithCustomTransportTestCase extends SoapWithAttachmentsTestCase {

  @Override
  protected String getConfigurationFile() {
    return "config/transport/attachments-with-http-custom-transport.xml";
  }
}
