package OpenChallenge2_Mod;

public class SongLyrics extends Song {

	String lyrics;
	


	public SongLyrics(String title, String artist, String album, String composer, String year, int track, String lyrics) {
		super(title, artist, album, composer, year, track);
		this.lyrics = lyrics;
	}



	@Override
	public void show() {
		super.show();
		System.out.println("Lyrics : "+ lyrics);
	}
	
	

}
