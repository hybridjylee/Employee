package webapp.escape;

public class Screen {
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
	public static final int BLACK		=  40;
	public static final int RED			=  41;
	public static final int GREEN		=  42;
	public static final int YELLOW		=  43;
	public static final int BLUE		=  44;
	public static final int MAGENTA		=  45;
	public static final int CYAN		=  46;
	public static final int WRITE		=  47;
	
	
	
	public static void clear(){ // ȭ�� Ŭ����
		System.out.print("\033[2J");
		System.out.flush(); // ���ۿ� ���� �ʰ� ������ �͹̳ο� ���, �ٷν�� 
							
	}
	
	public static void cursorPosition(int line, int col){ // Ŀ������
		
		if(line < 1 || col < 1)
			throw new RuntimeException("postionError "+line + " " + col);
		
		System.out.print("\033[" + line + ";" + col + "H");
		System.out.flush();
		
	}
	
	
	public static void background(Background color){
		background(color.value);
	}
	
	/*public static void background(Background color){ // ��溯��
		System.out.print("\033[" + color.value + "m");
		System.out.flush();
	}*/
	
	public static void background(int color){
		if(color < 40 || color > 47)
			throw new RuntimeException("color value error "+color);
		
		System.out.print("\033[" + color + "m");
		System.out.flush();
	}
	public static void forground(Foreground color){ 
		forground(color.value);
	}
	
	public static void forground(int color){
		if(color < 30 || color > 37)
			throw new RuntimeException("foreground color value error");
		
		System.out.print("\033[" + color + "m");
		System.out.flush();
	}
	
/*	public static void forground(Foreground color){ 
		System.out.print("\033[" + color.value + "m");
		System.out.flush();
	}*/
	
	public static void reset(){ //�͹̳� �����ʱ�ȭ
		System.out.print("\033[0m");
		System.out.flush();
		
	}
	
	synchronized public static void print(int line, int col, char c){ // Screen ����ȭ ��ü, �Ӱ迵�� �޼ҵ�
		cursorPosition(line, col);
		System.out.print(c);
		System.out.flush();
	}
}