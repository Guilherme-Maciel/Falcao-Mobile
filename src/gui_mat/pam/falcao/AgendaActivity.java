package gui_mat.pam.falcao;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;

public class AgendaActivity extends Activity {

int status = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature (Window.FEATURE_NO_TITLE);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_agenda);
		
		//WebView
		WebView wv = (WebView) findViewById(R.id.webView1);
		
		WebSettings ws = wv.getSettings();
		ws.setJavaScriptEnabled(true);
		ws.setSupportZoom(false);
		
		wv.loadUrl("https://falcaoagendagui.wixsite.com/agenda");
		
		//End WebView
		
		//Menu buttons.
		ImageButton bioMuda = (ImageButton) findViewById(R.id.bio);
		bioMuda.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				status = 0;
				ImageButton menu = (ImageButton) findViewById(R.id.menu);
				ImageButton bio = (ImageButton) findViewById(R.id.bio);
				ImageButton disco = (ImageButton) findViewById(R.id.disco);
				ImageButton video = (ImageButton) findViewById(R.id.video);
				ImageButton hq = (ImageButton) findViewById(R.id.hq);
				ImageButton agenda = (ImageButton) findViewById(R.id.agenda);
				ImageButton contato = (ImageButton) findViewById(R.id.contato);
				
				menu.setImageResource(R.drawable.menu_on);
				bio.setVisibility(View.INVISIBLE);
				disco.setVisibility(View.INVISIBLE);
				video.setVisibility(View.INVISIBLE);
				hq.setVisibility(View.INVISIBLE);
				agenda.setVisibility(View.INVISIBLE);
				contato.setVisibility(View.INVISIBLE);
				
				Intent it = new Intent(AgendaActivity.this, BioActivity.class);
				startActivity(it);
				AgendaActivity.this.finish();
				
			}	
		});
		ImageButton discoMuda = (ImageButton) findViewById(R.id.disco);
		discoMuda.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				status = 0;
				ImageButton menu = (ImageButton) findViewById(R.id.menu);
				ImageButton bio = (ImageButton) findViewById(R.id.bio);
				ImageButton disco = (ImageButton) findViewById(R.id.disco);
				ImageButton video = (ImageButton) findViewById(R.id.video);
				ImageButton hq = (ImageButton) findViewById(R.id.hq);
				ImageButton agenda = (ImageButton) findViewById(R.id.agenda);
				ImageButton contato = (ImageButton) findViewById(R.id.contato);
				
				menu.setImageResource(R.drawable.menu_on);
				bio.setVisibility(View.INVISIBLE);
				disco.setVisibility(View.INVISIBLE);
				video.setVisibility(View.INVISIBLE);
				hq.setVisibility(View.INVISIBLE);
				agenda.setVisibility(View.INVISIBLE);
				contato.setVisibility(View.INVISIBLE);
				
				Intent it = new Intent(AgendaActivity.this, DiscoActivity.class);
				startActivity(it);
				AgendaActivity.this.finish();
				
				
			}	
		});
		ImageButton contatoMuda = (ImageButton) findViewById(R.id.contato);
		contatoMuda.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				status = 0;
				ImageButton menu = (ImageButton) findViewById(R.id.menu);
				ImageButton bio = (ImageButton) findViewById(R.id.bio);
				ImageButton disco = (ImageButton) findViewById(R.id.disco);
				ImageButton video = (ImageButton) findViewById(R.id.video);
				ImageButton hq = (ImageButton) findViewById(R.id.hq);
				ImageButton agenda = (ImageButton) findViewById(R.id.agenda);
				ImageButton contato = (ImageButton) findViewById(R.id.contato);
				
				menu.setImageResource(R.drawable.menu_on);
				bio.setVisibility(View.INVISIBLE);
				disco.setVisibility(View.INVISIBLE);
				video.setVisibility(View.INVISIBLE);
				hq.setVisibility(View.INVISIBLE);
				agenda.setVisibility(View.INVISIBLE);
				contato.setVisibility(View.INVISIBLE);
				
				Intent it = new Intent(AgendaActivity.this, ContatoActivity.class);
				startActivity(it);
				AgendaActivity.this.finish();

			}	
		});
		
		ImageButton hqMuda = (ImageButton) findViewById(R.id.hq);
		hqMuda.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				status = 0;
				ImageButton menu = (ImageButton) findViewById(R.id.menu);
				ImageButton bio = (ImageButton) findViewById(R.id.bio);
				ImageButton disco = (ImageButton) findViewById(R.id.disco);
				ImageButton video = (ImageButton) findViewById(R.id.video);
				ImageButton hq = (ImageButton) findViewById(R.id.hq);
				ImageButton agenda = (ImageButton) findViewById(R.id.agenda);
				ImageButton contato = (ImageButton) findViewById(R.id.contato);
				
				menu.setImageResource(R.drawable.menu_on);
				bio.setVisibility(View.INVISIBLE);
				disco.setVisibility(View.INVISIBLE);
				video.setVisibility(View.INVISIBLE);
				hq.setVisibility(View.INVISIBLE);
				agenda.setVisibility(View.INVISIBLE);
				contato.setVisibility(View.INVISIBLE);
				
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://cchq.com.br/falcao-hq/")));
			}
			});
		//End Menu buttons.
		
	}
	
	public void menuAction (View view){
		ImageButton menu = (ImageButton) findViewById(R.id.menu);
		ImageButton bio = (ImageButton) findViewById(R.id.bio);
		ImageButton disco = (ImageButton) findViewById(R.id.disco);
		ImageButton video = (ImageButton) findViewById(R.id.video);
		ImageButton hq = (ImageButton) findViewById(R.id.hq);
		ImageButton agenda = (ImageButton) findViewById(R.id.agenda);
		ImageButton contato = (ImageButton) findViewById(R.id.contato);
		
		if (status == 0){
			
		menu.setImageResource(R.drawable.menu_cancel);
		bio.setVisibility(View.VISIBLE);
		disco.setVisibility(View.VISIBLE);
		video.setVisibility(View.VISIBLE);
		hq.setVisibility(View.VISIBLE);
		agenda.setVisibility(View.VISIBLE);
		contato.setVisibility(View.VISIBLE);
		
		status = 1;
		}
		else{
			menu.setImageResource(R.drawable.menu_on);
			bio.setVisibility(View.INVISIBLE);
			disco.setVisibility(View.INVISIBLE);
			video.setVisibility(View.INVISIBLE);
			hq.setVisibility(View.INVISIBLE);
			agenda.setVisibility(View.INVISIBLE);
			contato.setVisibility(View.INVISIBLE);
			
			status = 0;
		}
	}
	}
