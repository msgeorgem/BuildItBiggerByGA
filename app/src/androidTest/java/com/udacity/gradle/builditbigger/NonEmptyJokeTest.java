package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.util.Log;


public class NonEmptyJokeTest extends AndroidTestCase {

    private static final String LOG_TAG = "NonEmptyJokeTest";

    @SuppressWarnings("unchecked")
    public void test() {

        // Testing that Async task successfully retrieves a non-empty string
        Log.i(LOG_TAG, "Running NonEmptyJokeTest test");
        String result = null;
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(getContext(), null);
        endpointsAsyncTask.execute();
        try {
            result = endpointsAsyncTask.get();
            Log.i(LOG_TAG, "Retrieved a non-empty joke successfully: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }
}