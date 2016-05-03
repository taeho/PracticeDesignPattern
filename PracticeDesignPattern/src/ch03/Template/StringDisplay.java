package ch03.Template;

/*
 * 3. ch03 : temple method 패턴: 하위 클래스에서 구체적으로 처리하기
 *    
 *    open : 문자열 "+-----+"을 표시한다.
 *    print : 생성자에서 주어진 문자열을 | 와 | 사이에 표시한다.
 *    close : 문자열 "+-----+"을 표시한다.
 * 
 * */

public class StringDisplay extends AbstractDisplay {
	// StringDisplay도 AbstractDisplay의 하위 클래스 
	
	private String string;		// 표시해야 할 문자열
	private int width;			// 바이트 단위로 계산한 문자열의 '길이'
	public StringDisplay(String string){	// 생성자에서 전달된 문자열 string 을
		this.string = string;				// 필드에 기억
		this.width = string.getBytes().length;	// 그리고 바이트 단위의 길이도 필드에 기억해두고
												// 기억해 두고 나중에 사용한다.
	}
	
	@Override
	public void open() {		// 오버라이드해서 정의한 open 메서드
		printLine();			// 이 클래스의 메소드 printLine에서 선을 그린다.
	}

	@Override
	public void print() {		// print 메소드는
		System.out.println("|" + string + "|");	// 필드에 기억해 둔 문자열의 전후에 | 을 붙여서 표시
	}						

	@Override
	public void close() {		// close 메소드는
		printLine();			// open처럼 printLine 메소드에서 선을 그린다.
	}
	
	private void printLine() {	// open과 close에서 호출된 printLine 메소드이다.
		System.out.print("+");	// private 이기 때문에 이 클래스 안에서만 사용된다.
		for(int i=0; i<width; i++) {	// 태두리의 모서리를 표현하는 "+" 마크를 표시
			System.out.print("-");		// width의 개수만큼 "-"을 표시하고 테두리선으로 이용한다.
		}
		System.out.println("+");	// 테두리의 모서리를 표현하는 "+" 마크를 표시
	}

}
