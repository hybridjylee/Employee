package webapp.escape;


public enum Background { //ENUM ������ ��ü�� �����ҋ� 
	
	BLACK(40),
	RED(41),
	GREEN(42),
	YELLOW(43),
	BLUE(44),
	MAGENTA(45),
	CYAN(46),
	WHITE(47);
	
	final int value;
	
	private Background(int value) {
		this.value = value;
	}
	
  /*public static final int BLACK = 40;
	public static final int RED=41;
	public static final int GREEN=42;
	public static final int YELLOW=43;
	public static final int BLUE=44;
	public static final int MAGENTA=45;
	public static final int CYAN=46;
	public static final int WHITE=47;*/
	
}
/*
40	Black
41	Red
42	Green
43	Yellow
44	Blue
45	Magenta
46	Cyan
47	White
*/