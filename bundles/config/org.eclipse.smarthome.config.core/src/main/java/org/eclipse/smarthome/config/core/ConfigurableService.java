/**
 * Copyright (c) 2014-2017 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.config.core;

import org.osgi.framework.Constants;
import org.osgi.service.component.ComponentConstants;

/**
 * <p>
 * {@link ConfigurableService} can be used as a marker interface for configurable services. But the interface itself is
 * not relevant for the runtime. Each service which has the property
 * {@link ConfigurableService#SERVICE_PROPERTY_DESCRIPTION_URI} set will be considered as a configurable service. The
 * properties {@link ConfigurableService#SERVICE_PROPERTY_LABEL} and
 * {@link ConfigurableService#SERVICE_PROPERTY_CATEGORY} are optional.
 * </p>
 *
 * <p>
 * The services are configured through the OSGi configuration admin. Therefore each service must provide a PID or a
 * component name service property if the configuration is done by declarative services. If the
 * {@link Constants#SERVICE_PID} property is not set the
 * {@link ComponentConstants#COMPONENT_NAME} property will be used as fallback.
 * </p>
 *
 * @author Dennis Nobel - Initial contribution
 *
 */
public interface ConfigurableService {

    /**
     * The config description URI for the configurable service. See also {@link ConfigDescription}.
     */
    public static final String SERVICE_PROPERTY_DESCRIPTION_URI = "service.config.description.uri";

    /**
     * The label of the service to be configured.
     */
    public static final String SERVICE_PROPERTY_LABEL = "service.config.label";

    /**
     * The category of the service to be configured (e.g. binding).
     */
    public static final String SERVICE_PROPERTY_CATEGORY = "service.config.category";

}
