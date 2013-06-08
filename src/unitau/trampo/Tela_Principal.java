package unitau.trampo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class Tela_Principal extends Activity {

	Button bnt;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela_principal);

		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		addListenerOnButtonTela1();
		addListenerOnButtonTela2();
		addListenerOnButtonDesenvolvedor();
		addListenerOnButtonSobre();

	}

	public void addListenerOnButtonTela1() {
		final Context context = this;
		bnt = (Button) findViewById(R.id.B_tela1);
		bnt.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View v) {
				Intent abreTelaWallpaper = new Intent(context, Tela1.class);
				startActivity(abreTelaWallpaper);
			}
		});
	}

	public void addListenerOnButtonTela2() {
		final Context context = this;
		bnt = (Button) findViewById(R.id.B_tela2);
		bnt.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View v) {
				Intent abreTelaWallpaper = new Intent(context, Tela2.class);
				startActivity(abreTelaWallpaper);
			}
		});
	}

	public void addListenerOnButtonDesenvolvedor() {
		final Context context = this;
		bnt = (Button) findViewById(R.id.B_desenvolvedor);
		bnt.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View v) {
				Intent abreTelaWallpaper = new Intent(context, Desenvolvedor.class);
				startActivity(abreTelaWallpaper);
			}
		});
	}

	public void addListenerOnButtonSobre() {
		final Context context = this;
		bnt = (Button) findViewById(R.id.B_sobre);
		bnt.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View v) {
				Intent abreTelaWallpaper = new Intent(context, Sobre.class);
				startActivity(abreTelaWallpaper);
			}
		});
	}

}
