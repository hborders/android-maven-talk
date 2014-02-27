package com.github.hborders.android.maven;

import android.test.ActivityInstrumentationTestCase2;
import com.jayway.android.robotium.solo.Solo;

public class HelloAndroidActivityInstrumentationTest extends ActivityInstrumentationTestCase2<HelloAndroidActivity> {

    private Solo solo;

    public HelloAndroidActivityInstrumentationTest() {
        super(HelloAndroidActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        solo = new Solo(getInstrumentation(), getActivity());
    }

    public void testClickingButtonShowsCalendar() {
        solo.clickOnButton("Show Calendar");
        solo.sleep(1000);
        assertEquals(solo.getCurrentActivity().getClass(), CalendarActivity.class);
    }
}
