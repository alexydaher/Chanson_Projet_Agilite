package stepDefinitions;

import song.Friend;
import song.Song;
import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Feature001AddSongToPlaylist {
	private Song song = new Song("djadja", 1);
	private Friend friend = new Friend("Nicolas");
	
	@Given("une chanson")
	public void createChanson() {
		Assert.assertTrue(this.song != null);
	}
	
	@Given("un utilisateur")
	public void createUtilisateur() {
		Assert.assertTrue(this.friend != null);
	}
	
	@When("un utilisateur ajoute une chanson dans sa playlist")
	public void addSongToPlaylist() {
		this.friend.addSong(song);
	}
	
	@Then("la playlist contient cette chanson")
	public void checkPlaylist() {
		Assert.assertEquals(this.song, this.friend.getPlaylist().getSongs().get(0));
	}
	
}
