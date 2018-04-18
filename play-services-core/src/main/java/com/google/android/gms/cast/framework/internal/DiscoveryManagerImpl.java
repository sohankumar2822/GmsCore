/*
 * Copyright (C) 2013-2017 microG Project Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.gms.cast.framework.internal;

import android.os.RemoteException;
import android.util.Log;

import com.google.android.gms.cast.framework.IDiscoveryManager;
import com.google.android.gms.cast.framework.IDiscoveryManagerListener;
import com.google.android.gms.cast.framework.internal.CastContextImpl;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

import java.util.Set;
import java.util.HashSet;

public class DiscoveryManagerImpl extends IDiscoveryManager.Stub {
    private static final String TAG = DiscoveryManagerImpl.class.getSimpleName();

    private CastContextImpl castContextImpl;

    private Set discoveryManagerListeners = new HashSet();

    public DiscoveryManagerImpl(CastContextImpl castContextImpl) {
        Log.d(TAG, "Creating new discovery manager");
        this.castContextImpl = castContextImpl;
    }

    @Override
    public void startDiscovery() {
        Log.d(TAG, "unimplemented Method: startDiscovery");
    }

    @Override
    public void stopDiscovery() {
        Log.d(TAG, "unimplemented Method: stopDiscovery");
    }

    @Override
    public void addDiscoveryManagerListener(IDiscoveryManagerListener listener) {
        Log.d(TAG, "unimplemented Method: addDiscoveryManagerListener");
        this.discoveryManagerListeners.add(listener);
    }

    @Override
    public void removeDiscoveryManagerListener(IDiscoveryManagerListener listener) {
        Log.d(TAG, "unimplemented Method: removeDiscoveryManagerListener");
        this.discoveryManagerListeners.remove(listener);
    }

    @Override
    public IObjectWrapper getWrappedThis() throws RemoteException {
        return ObjectWrapper.wrap(this);
    }
}
