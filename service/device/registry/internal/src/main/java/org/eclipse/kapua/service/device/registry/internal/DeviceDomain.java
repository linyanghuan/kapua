/*******************************************************************************
 * Copyright (c) 2011, 2016 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.service.device.registry.internal;

import com.google.common.collect.Lists;
import org.eclipse.kapua.commons.model.AbstractKapuaEntity;
import org.eclipse.kapua.service.authorization.domain.Domain;
import org.eclipse.kapua.service.authorization.permission.Actions;

import java.util.HashSet;
import java.util.Set;

/**
 * Device domanin.
 *
 * @since 1.0
 */
public class DeviceDomain extends AbstractKapuaEntity implements Domain {

    private static final long serialVersionUID = 3782336558657796495L;

    public static final DeviceDomain INSTANCE = new DeviceDomain();

    private String name = "device";
    private String serviceName = "deviceRegistryService";
    private Set<Actions> actions = new HashSet<>(Lists.newArrayList(Actions.read, Actions.delete, Actions.write));
    private boolean groupable = true;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public String getServiceName() {
        return serviceName;
    }

    @Override
    public void setActions(Set<Actions> actions) {
        this.actions = actions;
    }

    @Override
    public Set<Actions> getActions() {
        return actions;
    }

    @Override
    public void setGroupable(boolean groupable) {
        this.groupable = groupable;
    }

    @Override
    public boolean getGroupable() {
        return groupable;
    }
}