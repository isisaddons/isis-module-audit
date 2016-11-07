/*
 *  Copyright 2013~2014 Dan Haywood
 *
 *  Licensed under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.isisaddons.module.audit.fixture.scripts;

import org.apache.isis.applib.fixturescripts.DiscoverableFixtureScript;
import org.apache.isis.applib.services.jdosupport.IsisJdoSupport;

import org.isisaddons.module.audit.fixture.dom.notaudited.SomeNotAuditedObject;
import org.isisaddons.module.audit.fixture.dom.notaudited.SomeNotAuditedObjects;

public class SomeNotAuditedObjectsFixture extends DiscoverableFixtureScript {

    public SomeNotAuditedObjectsFixture() {
        withDiscoverability(Discoverability.DISCOVERABLE);
    }

    @Override
    protected void execute(ExecutionContext executionContext) {

        // create
        create("Foo", executionContext);
        create("Bar", executionContext);
        create("Baz", executionContext);
    }

    // //////////////////////////////////////

    private SomeNotAuditedObject create(final String name, ExecutionContext executionContext) {
        return executionContext.add(this, someNotAuditedObjects.create(name));
    }

    // //////////////////////////////////////

    @javax.inject.Inject
    private SomeNotAuditedObjects someNotAuditedObjects;

    @javax.inject.Inject
    private IsisJdoSupport isisJdoSupport;


}
