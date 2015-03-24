package webapp.escape;

public enum Foreground { //�ٸ������ ����´�. { �ܴ̿� }
	
	BLACK(30),
	RED(31),
	GREEN(32),
	YELLOW(33),
	BLUE(34),
	MAGENTA(35),
	CYAN(36),
	WHITE(37);
	
	final int value;
	
	private Foreground(int value) {
		this.value = value;
	}
	/*public static final int BLACK = 30;
	public static final int RED=31;
	public static final int GREEN=32;
	public static final int YELLOW=33;
	public static final int BLUE=34;
	public static final int MAGENTA=35;
	public static final int CYAN=36;
	public static final int WHITE=37;*/
	
}
/*
	Foreground Colours
30	Black
31	Red
32	Green
33	Yellow
34	Blue
35	Magenta
36	Cyan
37	White

*/