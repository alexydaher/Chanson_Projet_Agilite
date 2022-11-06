package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import song.Friend;
import song.Song;

public class Feature002GetSongAndPlaylistScore {
	private Song song = new Song("djadja", 1);
	private Friend friend = new Friend("Nicolas");
	
	@Given("un utilisateur")
	public void createUtilisateur() {
		Assert.assertTrue(this.friend != null);	
	}
	
	@Given("une chanson")
	public void createChanson() {
		Assert.assertTrue(this.song != null);
		this.friend.addSong(song);
	}
	
	@When("un utilisateur cherche le score de la chanson qui est dans sa playlist")
	@When("un utilisateur cherche le score de sa playlist")
	public void addSongToPlaylist() {
		this.friend.addSong(song);
	}
	
	@Then("le score de la chanson est renvoyé")
	public void returnScoreOfTheSong() {
		Assert.assertEquals(this.song.getScore(), this.friend.getScoreOfASong(this.song.getName()));
	}
	
	@Then("le score de la playlist est renvoyé")
	public void returnScoreOfThePlaylist() {
		Assert.assertEquals(this.song.getScore(), this.friend.getScore());
	}
	
}
