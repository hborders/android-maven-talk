package com.github.hborders.android.maven;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(RobolectricTestRunner.class)
public class HelloAndroidActivityTest {
    @Test
    public void testHelloAndroidActivity() {
        assertNotNull(Robolectric.buildActivity(HelloAndroidActivity.class).create().get());
    }
}
