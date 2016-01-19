package com.cobaltians.helloworld.activities;

import com.cobaltians.helloworld.fragments.MainFragment;

import org.cobaltians.cobalt.Cobalt;
import org.cobaltians.cobalt.activities.CobaltActivity;
import org.cobaltians.cobalt.fragments.CobaltFragment;

public class MainActivity extends CobaltActivity {

	protected CobaltFragment getFragment() {
		return Cobalt.getInstance(this).getFragmentForController(MainFragment.class, "default", "index.html");
	}
}
