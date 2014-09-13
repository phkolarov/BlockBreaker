package blockBreaker;

public class Player {
	private String name;
	private int score = 0;
	private int lives = 3;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public Integer getLives() {
		return lives;
	}

	public int getScore() {
		return score;
	}

	public void scorePlus() {
		this.score += 1;
	}

	public void addLive() {
		this.lives += 1;
	}

	public void removeLive() {
		this.lives -= 1;
	}
}
