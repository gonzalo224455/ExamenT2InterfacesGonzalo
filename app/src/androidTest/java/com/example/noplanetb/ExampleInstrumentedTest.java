package com.example.ejemploernestexamn;

import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
//import static android.support.test.espresso.Espresso.onView;

import android.test.TouchUtils;
import android.widget.Button;
import android.widget.EditText;
import com.example.noplanetb.BLogin;
import com.example.noplanetb.BMain;
import com.example.noplanetb.R;


/**
 * @author ernesto
 */

public class ExampleInstrumentedTest extends ActivityInstrumentationTestCase2<BLogin> {

    private Button mloginbutton;


    public ExampleInstrumentedTest() {
        super(BLogin.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
        BLogin actividad = getActivity();

        mloginbutton = actividad.findViewById(R.id.button);

    }




    public void testLoginSignup() {

        TouchUtils.tapView(this, mloginbutton);


    }
}