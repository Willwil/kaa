/*
 * Copyright 2014 CyberVision, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kaaproject.kaa.server.sync;

public class RedirectServerSync {
    private int accessPointId;

    public RedirectServerSync() {
    }

    /**
     * All-args constructor.
     */
    public RedirectServerSync(int accessPointId) {
        this.accessPointId = accessPointId;
    }

    public int getAccessPointId() {
        return accessPointId;
    }

    public void setAccessPointId(int accessPointId) {
        this.accessPointId = accessPointId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + accessPointId;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        RedirectServerSync other = (RedirectServerSync) obj;
        if (accessPointId != other.accessPointId)
            return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("RedirectServerSync [accessPointId=");
        builder.append(accessPointId);
        builder.append("]");
        return builder.toString();
    }
}
