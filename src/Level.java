public class Level {
	private int levelNum;
	private String levelText;
	private String buttonLabel;

	public Level (int levelNum, String levelText, String buttonLabel) {
		this.levelNum = levelNum;
		this.levelText = levelText;
		this.buttonLabel = buttonLabel;
	}

	public void levelCheck() {
		if (getLevelNum() == 1) {
			setLevelText("I've been waiting here for quite a while." + "\n");
			setButtonLabel("Continue");
		}
		if (getLevelNum() == 2) {
			setLevelText("I look up at the dark, slow-moving coulds and become" + "\n" +
					"restless." + "\n");
			setButtonLabel("Continue");
		}
		if (getLevelNum() == 3) {
			setLevelText("It must be getting late. I wonder what time it is." + "\n");
			setButtonLabel("Check my watch");
		}
		if (getLevelNum() == 4) {
			setLevelText("3:01am. He was supposed to be here an hour ago. I" + "\n" +
					"guess I could wait longer." + "\n");
			setButtonLabel("Continue");
		}
		if (getLevelNum() == 4) {
			setLevelText("It's not like I have anything better to do. ");
			setButtonLabel("Continue");
		}
		if (getLevelNum() == 5) {
			setLevelText("It begins to pour." + "\n");
			setButtonLabel("Continue");
		}
		if (getLevelNum() == 6) {
			setLevelText("The thunderstorm is getting worse. He was probably" + "\n" +
					"apprehended by the Night Watch." + "\n");
			setButtonLabel("Check my watch");
		}
		if (getLevelNum() == 7) {
			setLevelText("3:32am. Well, that settles it. This was a foolish" + "\n" +
					"ploy anyway. Who in their right mind would have gone" + "\n" +
					"through with this?!" + "\n");
			setButtonLabel("Continue");
		}
		if (getLevelNum() == 8) {
			setLevelText("I've risked enough. Time to get out of here." + "\n");
			setButtonLabel("Get on my motorcycle" + "\n");
		}
		
		int levelNum = getLevelNum() + 1;
		setLevelNum(levelNum);
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
	
	public String getButtonLabel() {
		return buttonLabel;
	}

	public void setButtonLabel(String buttonLabel) {
		this.buttonLabel = buttonLabel;
	}

}