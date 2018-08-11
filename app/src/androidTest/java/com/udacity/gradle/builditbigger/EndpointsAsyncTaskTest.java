package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void EndpointAsyncTaskTest() {

        onView(withId(R.id.telling_joke_btn)).check(matches(withText(R.string.button_text)));

        /**
         String result = null;
         EndpointsAsyncTask asyncTaskJoke = new EndpointsAsyncTask();
         asyncTaskJoke.execute();
         try{
         result = asyncTaskJoke.get();
         Log.d("testing", "Retrieved a non-empty string successfully: " + result);
         } catch (InterruptedException e) {
         e.printStackTrace();
         } catch (ExecutionException e) {
         e.printStackTrace();
         }
         assertNotNull(result);
         **/

    }


}