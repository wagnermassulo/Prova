package unitau.trampo;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.WindowManager;

public class Desenvolvedor extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.desenvolvedor);

		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, // define
																			// como
																			// full
																			// screen
																			// e
				WindowManager.LayoutParams.FLAG_FULLSCREEN);// mantem o action
															// bar

		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);// mantem
																			// a
																			// tela
																			// somente
																			// como
																			// retrato

	}

}
