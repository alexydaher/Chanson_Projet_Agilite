package stepDefinitions;

import song.Friend;
import song.Song;
import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Feature003Compare2FriendsScore {
	private Friend friend1 = new Friend("Nicolas");
	private Friend friend2 = new Friend("Alexy");
	private Song song1 = new Song("djadja", 1);
	private Song song2 = new Song("test", 3);
	private Song song3 = new Song("test2", 5);
	
	@Given("deux utilisateurs")
	public void createUtilisateurs() {
		Assert.assertTrue(this.friend1 != null);
		Assert.assertTrue(this.friend2 != null);
	}
	
	@Given("trois chansons")
	public void createChansons() {
		Assert.assertTrue(this.song1 != null);
		Assert.assertTrue(this.song2 != null);
		Assert.assertTrue(this.song3 != null);
	}
	
	@When("deux utilisateurs ajoutent les chansons qu'ils aiment")
	public void addSongsToPlaylists() {
		this.friend1.addSong(song1);
		this.friend2.addSong(song2);
		this.friend2.addSong(song3);
	}
	
	@Then("l'utilisateur avec le score le plus haut gagne")
	public void compareUsers() {
		Assert.assertEquals(false, this.friend1.compareToFriend(friend2));
		Assert.assertEquals(true, this.friend2.compareToFriend(friend1));
	}
	
}
