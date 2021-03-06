/*******************************************************************************
 * Copyright (c) 2017 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.service.certificate;

public interface KeyUsageSetting {

    public KeyUsage getKeyUsage();

    public void setKeyUsage(KeyUsage keyUsage);

    public boolean getAllowed();

    public void setAllowed(boolean allowed);

    public Boolean getKapuaAllowed();

    public void setKapuaAllowed(Boolean allowed);

}
