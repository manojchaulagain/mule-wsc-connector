/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.extension.ws.internal.metadata;

import org.mule.extension.ws.internal.ParseResponseOperation;
import org.mule.extension.ws.internal.WebServiceConsumer;
import org.mule.metadata.api.model.MetadataType;
import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.metadata.MetadataContext;
import org.mule.runtime.api.metadata.MetadataResolvingException;

/**
 * Resolves the metadata for output payload of the {@link ParseResponseOperation}.
 *
 * @since 1.7
 */
public class ParseResponseOutputResolver extends AbstractOutputResolver<String> {

  @Override
  public String getCategoryName() {
    return WebServiceConsumer.NAME;
  }

  @Override
  public String getResolverName() {
    return WebServiceConsumer.NAME + "ResponseOutputResolver";
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public MetadataType getOutputType(MetadataContext context, String operation)
      throws ConnectionException, MetadataResolvingException {
    return getOperationOutputType(context, operation);
  }
}
