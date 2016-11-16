package com.android.testsejasa;

import org.junit.Test;

/**
 * Created by sociabuzz-mobdev on 16/11/2016.
 */

public class JUnitTest {


    @Test
    public void loadImage(){
        /*MainActivity activity = new MainActivity();
        activity.loadImage();*/
        CustomVolleyRequest customVolleyRequest = new CustomVolleyRequest();
        customVolleyRequest.getImageLoader();
    }

}
