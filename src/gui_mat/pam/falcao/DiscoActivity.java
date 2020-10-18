package gui_mat.pam.falcao;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;

public class DiscoActivity extends Activity {

	int status = 0;
	int disco = 0;
	int vez = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature (Window.FEATURE_NO_TITLE);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_disco);
		
		//Menu buttons.
		ImageButton bioMuda = (ImageButton) findViewById(R.id.bio);
		bioMuda.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				Intent it = new Intent(DiscoActivity.this, BioActivity.class);
				startActivity(it);
				DiscoActivity.this.finish();
			}	
		});
		ImageButton discoMuda = (ImageButton) findViewById(R.id.disco);
		discoMuda.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				Intent it = new Intent(DiscoActivity.this, DiscoActivity.class);
				startActivity(it);
				DiscoActivity.this.finish();
			}	
		});
		ImageButton contatoMuda = (ImageButton) findViewById(R.id.contato);
		contatoMuda.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				Intent it = new Intent(DiscoActivity.this, ContatoActivity.class);
				startActivity(it);
				DiscoActivity.this.finish();
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
		
		ImageButton agenda = (ImageButton) findViewById(R.id.agenda);
		agenda.setOnClickListener (new View.OnClickListener(){
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
				
				Intent it = new Intent(DiscoActivity.this, AgendaActivity.class);
				startActivity(it);
				DiscoActivity.this.finish();
			}
		});
		//End Menu buttons.
		
		//Social Media Buttons.
		ImageButton facebook = (ImageButton) findViewById(R.id.face);
		facebook.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/cantorfalcao/")));
			}
		});
		ImageButton twitter = (ImageButton) findViewById(R.id.twitter);
		twitter.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/brega_falcao")));
			}
		});
		ImageButton instagram = (ImageButton) findViewById(R.id.instagram);
		instagram.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/falcaomaia/?hl=pt-br")));
			}
		});
		ImageButton youtube = (ImageButton) findViewById(R.id.youtube);
		youtube.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCdgoqm00Hf-NpEFhivZTTOQ")));
			}
		});
		//End Social Media.
		
		//Listening Musics Buttons
		ImageButton youtubeMusic = (ImageButton) findViewById(R.id.youtubeMusic);
		youtubeMusic.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://music.youtube.com/channel/UCxcG_dRwO91dHdwZAOGwQRw")));
			}
		});
		ImageButton spotify = (ImageButton) findViewById(R.id.spotify);
		spotify.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/artist/6arRXoJBfebp5a9VKlEATa")));
			}
		});
		ImageButton deezer = (ImageButton) findViewById(R.id.deezer);
		deezer.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.deezer.com/br/artist/613836?")));
			}
		});
		ImageButton google = (ImageButton) findViewById(R.id.google);
		google.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/music/preview/Aiylpkhpoydhqzm7ddlnqbiuhfq?u=0#")));
			}
		});
		//End Listening Musics Buttons
		
		//musics albums
		ImageButton a1 = (ImageButton) findViewById(R.id.a1);
		a1.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				ImageView album = (ImageView) findViewById(R.id.seta);
				ImageButton a1 = (ImageButton) findViewById(R.id.a1);
				ImageButton a2 = (ImageButton) findViewById(R.id.a2);
				ImageButton a3 = (ImageButton) findViewById(R.id.a3);
				ImageButton a4 = (ImageButton) findViewById(R.id.a4);
				ImageButton a5 = (ImageButton) findViewById(R.id.a5);
				ImageButton a6 = (ImageButton) findViewById(R.id.a6);
				ImageButton a7 = (ImageButton) findViewById(R.id.a7);
				ImageButton a8 = (ImageButton) findViewById(R.id.a8);
				ImageButton a9 = (ImageButton) findViewById(R.id.a9);
				
				a1.setImageResource(R.drawable.a1_on);
				a2.setImageResource(R.drawable.a2);
				a3.setImageResource(R.drawable.a3);
				a4.setImageResource(R.drawable.a4);
				a5.setImageResource(R.drawable.a5);
				a6.setImageResource(R.drawable.a6);
				a7.setImageResource(R.drawable.a7);
				a8.setImageResource(R.drawable.a8);
				a9.setImageResource(R.drawable.a9);
				
				album.setImageResource(R.drawable.album0);
			}
			});
		ImageButton a2 = (ImageButton) findViewById(R.id.a2);
		a2.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				ImageView album = (ImageView) findViewById(R.id.seta);
				ImageButton a1 = (ImageButton) findViewById(R.id.a1);
				ImageButton a2 = (ImageButton) findViewById(R.id.a2);
				ImageButton a3 = (ImageButton) findViewById(R.id.a3);
				ImageButton a4 = (ImageButton) findViewById(R.id.a4);
				ImageButton a5 = (ImageButton) findViewById(R.id.a5);
				ImageButton a6 = (ImageButton) findViewById(R.id.a6);
				ImageButton a7 = (ImageButton) findViewById(R.id.a7);
				ImageButton a8 = (ImageButton) findViewById(R.id.a8);
				ImageButton a9 = (ImageButton) findViewById(R.id.a9);
				
				a1.setImageResource(R.drawable.a1);
				a2.setImageResource(R.drawable.a2_on);
				a3.setImageResource(R.drawable.a3);
				a4.setImageResource(R.drawable.a4);
				a5.setImageResource(R.drawable.a5);
				a6.setImageResource(R.drawable.a6);
				a7.setImageResource(R.drawable.a7);
				a8.setImageResource(R.drawable.a8);
				a9.setImageResource(R.drawable.a9);
				
				album.setImageResource(R.drawable.album1);
			}
			});
		ImageButton a3 = (ImageButton) findViewById(R.id.a3);
		a3.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				ImageView album = (ImageView) findViewById(R.id.seta);
				ImageButton a1 = (ImageButton) findViewById(R.id.a1);
				ImageButton a2 = (ImageButton) findViewById(R.id.a2);
				ImageButton a3 = (ImageButton) findViewById(R.id.a3);
				ImageButton a4 = (ImageButton) findViewById(R.id.a4);
				ImageButton a5 = (ImageButton) findViewById(R.id.a5);
				ImageButton a6 = (ImageButton) findViewById(R.id.a6);
				ImageButton a7 = (ImageButton) findViewById(R.id.a7);
				ImageButton a8 = (ImageButton) findViewById(R.id.a8);
				ImageButton a9 = (ImageButton) findViewById(R.id.a9);
				
				a1.setImageResource(R.drawable.a1);
				a2.setImageResource(R.drawable.a2);
				a3.setImageResource(R.drawable.a3_on);
				a4.setImageResource(R.drawable.a4);
				a5.setImageResource(R.drawable.a5);
				a6.setImageResource(R.drawable.a6);
				a7.setImageResource(R.drawable.a7);
				a8.setImageResource(R.drawable.a8);
				a9.setImageResource(R.drawable.a9);
				
				album.setImageResource(R.drawable.album2);
			}
			});
		ImageButton a4 = (ImageButton) findViewById(R.id.a4);
		a4.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				ImageView album = (ImageView) findViewById(R.id.seta);
				album.setImageResource(R.drawable.album3);
				ImageButton a1 = (ImageButton) findViewById(R.id.a1);
				ImageButton a2 = (ImageButton) findViewById(R.id.a2);
				ImageButton a3 = (ImageButton) findViewById(R.id.a3);
				ImageButton a4 = (ImageButton) findViewById(R.id.a4);
				ImageButton a5 = (ImageButton) findViewById(R.id.a5);
				ImageButton a6 = (ImageButton) findViewById(R.id.a6);
				ImageButton a7 = (ImageButton) findViewById(R.id.a7);
				ImageButton a8 = (ImageButton) findViewById(R.id.a8);
				ImageButton a9 = (ImageButton) findViewById(R.id.a9);
				
				a1.setImageResource(R.drawable.a1);
				a2.setImageResource(R.drawable.a2);
				a3.setImageResource(R.drawable.a3);
				a4.setImageResource(R.drawable.a4_on);
				a5.setImageResource(R.drawable.a5);
				a6.setImageResource(R.drawable.a6);
				a7.setImageResource(R.drawable.a7);
				a8.setImageResource(R.drawable.a8);
				a9.setImageResource(R.drawable.a9);
				
			}
			});
		ImageButton a5 = (ImageButton) findViewById(R.id.a5);
		a5.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				ImageView album = (ImageView) findViewById(R.id.seta);
				ImageButton a1 = (ImageButton) findViewById(R.id.a1);
				ImageButton a2 = (ImageButton) findViewById(R.id.a2);
				ImageButton a3 = (ImageButton) findViewById(R.id.a3);
				ImageButton a4 = (ImageButton) findViewById(R.id.a4);
				ImageButton a5 = (ImageButton) findViewById(R.id.a5);
				ImageButton a6 = (ImageButton) findViewById(R.id.a6);
				ImageButton a7 = (ImageButton) findViewById(R.id.a7);
				ImageButton a8 = (ImageButton) findViewById(R.id.a8);
				ImageButton a9 = (ImageButton) findViewById(R.id.a9);
				
				a1.setImageResource(R.drawable.a1);
				a2.setImageResource(R.drawable.a2);
				a3.setImageResource(R.drawable.a3);
				a4.setImageResource(R.drawable.a4);
				a5.setImageResource(R.drawable.a5_on);
				a6.setImageResource(R.drawable.a6);
				a7.setImageResource(R.drawable.a7);
				a8.setImageResource(R.drawable.a8);
				a9.setImageResource(R.drawable.a9);
				
				album.setImageResource(R.drawable.album4);
				
			}
			});
		ImageButton a6 = (ImageButton) findViewById(R.id.a6);
		a6.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				ImageView album = (ImageView) findViewById(R.id.seta);
				ImageButton a1 = (ImageButton) findViewById(R.id.a1);
				ImageButton a2 = (ImageButton) findViewById(R.id.a2);
				ImageButton a3 = (ImageButton) findViewById(R.id.a3);
				ImageButton a4 = (ImageButton) findViewById(R.id.a4);
				ImageButton a5 = (ImageButton) findViewById(R.id.a5);
				ImageButton a6 = (ImageButton) findViewById(R.id.a6);
				ImageButton a7 = (ImageButton) findViewById(R.id.a7);
				ImageButton a8 = (ImageButton) findViewById(R.id.a8);
				ImageButton a9 = (ImageButton) findViewById(R.id.a9);
				
				a1.setImageResource(R.drawable.a1);
				a2.setImageResource(R.drawable.a2);
				a3.setImageResource(R.drawable.a3);
				a4.setImageResource(R.drawable.a4);
				a5.setImageResource(R.drawable.a5);
				a6.setImageResource(R.drawable.a6_on);
				a7.setImageResource(R.drawable.a7);
				a8.setImageResource(R.drawable.a8);
				a9.setImageResource(R.drawable.a9);
				
				album.setImageResource(R.drawable.album5);
			}
			});
		ImageButton a7 = (ImageButton) findViewById(R.id.a7);
		a7.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				ImageView album = (ImageView) findViewById(R.id.seta);
				ImageButton a1 = (ImageButton) findViewById(R.id.a1);
				ImageButton a2 = (ImageButton) findViewById(R.id.a2);
				ImageButton a3 = (ImageButton) findViewById(R.id.a3);
				ImageButton a4 = (ImageButton) findViewById(R.id.a4);
				ImageButton a5 = (ImageButton) findViewById(R.id.a5);
				ImageButton a6 = (ImageButton) findViewById(R.id.a6);
				ImageButton a7 = (ImageButton) findViewById(R.id.a7);
				ImageButton a8 = (ImageButton) findViewById(R.id.a8);
				ImageButton a9 = (ImageButton) findViewById(R.id.a9);
				
				a1.setImageResource(R.drawable.a1);
				a2.setImageResource(R.drawable.a2);
				a3.setImageResource(R.drawable.a3);
				a4.setImageResource(R.drawable.a4);
				a5.setImageResource(R.drawable.a5);
				a6.setImageResource(R.drawable.a6);
				a7.setImageResource(R.drawable.a7_on);
				a8.setImageResource(R.drawable.a8);
				a9.setImageResource(R.drawable.a9);
				
				album.setImageResource(R.drawable.album6);
			}
			});
		ImageButton a8 = (ImageButton) findViewById(R.id.a8);
		a8.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				ImageView album = (ImageView) findViewById(R.id.seta);
				ImageButton a1 = (ImageButton) findViewById(R.id.a1);
				ImageButton a2 = (ImageButton) findViewById(R.id.a2);
				ImageButton a3 = (ImageButton) findViewById(R.id.a3);
				ImageButton a4 = (ImageButton) findViewById(R.id.a4);
				ImageButton a5 = (ImageButton) findViewById(R.id.a5);
				ImageButton a6 = (ImageButton) findViewById(R.id.a6);
				ImageButton a7 = (ImageButton) findViewById(R.id.a7);
				ImageButton a8 = (ImageButton) findViewById(R.id.a8);
				ImageButton a9 = (ImageButton) findViewById(R.id.a9);
				
				a1.setImageResource(R.drawable.a1);
				a2.setImageResource(R.drawable.a2);
				a3.setImageResource(R.drawable.a3);
				a4.setImageResource(R.drawable.a4);
				a5.setImageResource(R.drawable.a5);
				a6.setImageResource(R.drawable.a6);
				a7.setImageResource(R.drawable.a7);
				a8.setImageResource(R.drawable.a8_on);
				a9.setImageResource(R.drawable.a9);
				
				album.setImageResource(R.drawable.album7);
			}
			});
		ImageButton a9 = (ImageButton) findViewById(R.id.a9);
		a9.setOnClickListener (new View.OnClickListener(){
			public void onClick(View arg0){
				ImageView album = (ImageView) findViewById(R.id.seta);
				ImageButton a1 = (ImageButton) findViewById(R.id.a1);
				ImageButton a2 = (ImageButton) findViewById(R.id.a2);
				ImageButton a3 = (ImageButton) findViewById(R.id.a3);
				ImageButton a4 = (ImageButton) findViewById(R.id.a4);
				ImageButton a5 = (ImageButton) findViewById(R.id.a5);
				ImageButton a6 = (ImageButton) findViewById(R.id.a6);
				ImageButton a7 = (ImageButton) findViewById(R.id.a7);
				ImageButton a8 = (ImageButton) findViewById(R.id.a8);
				ImageButton a9 = (ImageButton) findViewById(R.id.a9);
				
				a1.setImageResource(R.drawable.a1);
				a2.setImageResource(R.drawable.a2);
				a3.setImageResource(R.drawable.a3);
				a4.setImageResource(R.drawable.a4);
				a5.setImageResource(R.drawable.a5);
				a6.setImageResource(R.drawable.a6);
				a7.setImageResource(R.drawable.a7);
				a8.setImageResource(R.drawable.a8);
				a9.setImageResource(R.drawable.a9_on);
				
				album.setImageResource(R.drawable.album8);
			}
			});
		//end musics albums
		
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
	


