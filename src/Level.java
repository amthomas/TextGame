public class Level extends Game {
	private int levelNum;
	private String levelText;

	public Level (int levelNum, String levelText){
		this.levelNum = levelNum;
		this.levelText = levelText;
		
		// stuff to edit variables
	}
	


	public int getLevelNum() {
		return levelNum;
	}



	public void setLevelNum(int levelNum) {
		this.levelNum = levelNum;
	}



	public String getLevelText() {
		return levelText;
	}



	public void setLevelText(String levelText) {
		this.levelText = levelText;
	}



	public void refresh() {
		System.out.println(levelText + levelNum);
	}

}