public class Level {
	private int levelNum;
	private String levelText;
	private String buttonLabel;
	
	private static final String LEVEL_1_TEXT_A = "I've been waiting here for quite a while.";
	private static final String LEVEL_1_BUTTON = "Continue";
	
	private static final String LEVEL_2_TEXT_A = "I look up at the dark, slow-moving coulds and become";
	private static final String LEVEL_2_TEXT_B = "restless.";
	private static final String LEVEL_2_BUTTON = "Continue";
	
	private static final String LEVEL_3_TEXT_A = "It must be getting late. I wonder what time it is.";
	private static final String LEVEL_3_BUTTON = "Check my watch";
	
	private static final String LEVEL_4_TEXT_A = "3:01am. He was supposed to be here an hour ago. I";
	private static final String LEVEL_4_TEXT_B = "guess I could wait longer.";
	private static final String LEVEL_4_BUTTON = "Continue";
	
	private static final String LEVEL_5_TEXT_A = "It's not like I have anything better to do. ";
	private static final String LEVEL_5_BUTTON = "Continue";
	
	private static final String LEVEL_6_TEXT_A = "It begins to pour.";
	private static final String LEVEL_6_BUTTON = "Continue";
	
	private static final String LEVEL_7_TEXT_A = "The thunderstorm is getting worse. He was probably";
	private static final String LEVEL_7_TEXT_B = "apprehended by the Night Watch.";
	private static final String LEVEL_7_BUTTON = "Check my watch";

	private static final String LEVEL_8_TEXT_A = "3:32am. Well, that settles it. This was a foolish";
	private static final String LEVEL_8_TEXT_B = "ploy anyway. Who in their right mind would have gone";
	private static final String LEVEL_8_TEXT_C = "through with this?!";
	private static final String LEVEL_8_BUTTON = "Continue";

	private static final String LEVEL_9_TEXT_A = "I've risked enough. Time to get out of here.";
	private static final String LEVEL_9_BUTTON = "Get on my motorcycle";
	
	private static final String LEVEL_10_TEXT_A = "As I get on my motorcycle, a dark figure approaches.";
	private static final String LEVEL_10_BUTTON = "Continue";
	
	private static final String LEVEL_11_TEXT_A = "David: Going somewhere?";
	private static final String LEVEL_11_BUTTON = "Continue";
	
	private static final String LEVEL_12_TEXT_A = "Capa: I thought you didn't make it.";
	private static final String LEVEL_12_BUTTON = "Continue";
	
	private static final String LEVEL_13_TEXT_A = "David: Well, here's the data disk. You should concentrate on";
	private static final String LEVEL_13_TEXT_B = "GUI implementation instead of story development.";
	private static final String LEVEL_13_BUTTON = "Continue";

	private static final String LEVEL_14_TEXT_A = "Capa: Sounds good.";
	private static final String LEVEL_14_BUTTON = "Drive away";
	
	private static final String LEVEL_15_TEXT_A = "You find yourself on the side of a skyscraper looking at";
	private static final String LEVEL_15_TEXT_B = "the security keypad to a sealed door. You put on your";
	private static final String LEVEL_15_TEXT_C = "infrared goggles. The numbers 5, 6, 9, and 2 are";
	private static final String LEVEL_15_TEXT_D = "ordered from most hot to least hot. A security guard was";
	private static final String LEVEL_15_TEXT_E = "here just one minute ago. What is access code?";
	private static final String LEVEL_15_BUTTON = "Access code:";
	
	private static final String LEVEL_16_TEXT_A = "The giant sealed door silently slides open. After you";
	private static final String LEVEL_16_TEXT_B = "slip inside, it slowly seals shut behind you.";
	private static final String LEVEL_16_BUTTON = "Continue";
	
	private static final String LEVEL_17_TEXT_A = "A robot stops you. He wants to make sure you can do math.";
	private static final String LEVEL_17_TEXT_B = "Computer: What is 5 x 5?";
	private static final String LEVEL_17_BUTTON = "Continue";
	
	private static final String LEVEL_18_TEXT_A = "A robot stops you. He wants to make sure you can do math.";
	private static final String LEVEL_18_TEXT_B = "Computer: What is 10 x 10?";
	private static final String LEVEL_18_BUTTON = "Continue";
		
	public Level (int levelNum, String levelText, String buttonLabel) {
		this.levelNum = levelNum;
		this.levelText = levelText;
		this.buttonLabel = buttonLabel;
	}

	public void levelCheck() {
		int levelNum = getLevelNum() + 1;
		setLevelNum(levelNum);
		switch (getLevelNum()){
			case 1: setLevelText(LEVEL_1_TEXT_A + "\n\n");
					setButtonLabel(LEVEL_1_BUTTON);
					break;
			case 2: setLevelText(LEVEL_2_TEXT_A + "\n" +
					LEVEL_2_TEXT_B + "\n\n");
					setButtonLabel(LEVEL_2_BUTTON);
					break;
			case 3: setLevelText(LEVEL_3_TEXT_A + "\n\n");
					setButtonLabel(LEVEL_3_BUTTON);
					break;
			case 4: setLevelText(LEVEL_4_TEXT_A + "\n" +
					LEVEL_4_TEXT_B + "\n\n");
					setButtonLabel(LEVEL_4_BUTTON);
					break;
			case 5: setLevelText(LEVEL_5_TEXT_A);
					setButtonLabel(LEVEL_5_BUTTON);
					break;
			case 6: setLevelText(LEVEL_6_TEXT_A + "\n\n");
					setButtonLabel(LEVEL_6_BUTTON);
					break;
			case 7: setLevelText(LEVEL_7_TEXT_A + "\n" +
					LEVEL_7_TEXT_B + "\n\n");
					setButtonLabel(LEVEL_7_BUTTON);
					break;
			case 8: setLevelText(LEVEL_8_TEXT_A + "\n" +
					LEVEL_8_TEXT_B + "\n" +
					LEVEL_8_TEXT_C + "\n\n");
					setButtonLabel(LEVEL_8_BUTTON);
					break;
			case 9: setLevelText(LEVEL_9_TEXT_A + "\n\n");
					setButtonLabel(LEVEL_9_BUTTON);
					break;
			case 10: setLevelText(LEVEL_10_TEXT_A + "\n\n");
					setButtonLabel(LEVEL_10_BUTTON);
					break;
			case 11: setLevelText(LEVEL_11_TEXT_A + "\n\n");
					setButtonLabel(LEVEL_11_BUTTON);
					break;
			case 12: setLevelText(LEVEL_12_TEXT_A + "\n\n");
					setButtonLabel(LEVEL_12_BUTTON);
					break;
			case 13: setLevelText(LEVEL_13_TEXT_A + "\n" +
					LEVEL_13_TEXT_B + "\n\n");
					setButtonLabel(LEVEL_13_BUTTON);
					break;
			case 14: setLevelText(LEVEL_14_TEXT_A + "\n\n");
					setButtonLabel(LEVEL_14_BUTTON);
					break;
			case 15: setLevelText(LEVEL_15_TEXT_A + "\n" +
					LEVEL_15_TEXT_B + "\n" +
					LEVEL_15_TEXT_C + "\n" +
					LEVEL_15_TEXT_D + "\n" +
					LEVEL_15_TEXT_E + "\n\n");
					setButtonLabel(LEVEL_15_BUTTON);
					break;
			case 16: setLevelText(LEVEL_16_TEXT_A + "\n" +
					LEVEL_16_TEXT_B + "\n\n");
					setButtonLabel(LEVEL_16_BUTTON);
					break;
			case 17: setLevelText(LEVEL_17_TEXT_A + "\n" +
					LEVEL_17_TEXT_B + "\n\n");
					setButtonLabel(LEVEL_17_BUTTON);
					break;
			case 18: setLevelText(LEVEL_18_TEXT_A + "\n" +
					LEVEL_18_TEXT_B + "\n\n");
					setButtonLabel(LEVEL_18_BUTTON);
					break;
		}
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