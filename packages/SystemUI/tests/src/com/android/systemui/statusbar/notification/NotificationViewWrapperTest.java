/*
 * Copyright (C) 2017 The Android Open Source Project
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

package com.android.systemui.statusbar.notification;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;

import com.android.systemui.statusbar.ExpandableNotificationRow;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class NotificationViewWrapperTest {

    private Context mContext;

    @Before
    public void setUp() throws Exception {
        mContext = InstrumentationRegistry.getTargetContext();
    }

    @Ignore("Broken")
    @Test
    public void constructor_doesntUseViewContext() throws Exception {
        new TestableNotificationViewWrapper(mContext, new View(null /* context */), null /* row */);
    }

    static class TestableNotificationViewWrapper extends NotificationViewWrapper {
        protected TestableNotificationViewWrapper(Context ctx, View view,
                ExpandableNotificationRow row) {
            super(ctx, view, row);
        }
    }
}