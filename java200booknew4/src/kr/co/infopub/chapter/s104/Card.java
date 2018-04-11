package kr.co.infopub.chapter.s104;
public class Card {
	private String cardVal; // H8, H6, ...
	public String getCardVal() {
		return cardVal;
	}
    // 기본(디볼트) 생성자
	public Card() {
		//0~3
		int suit=(int)(Math.random()*CardUtil.SUIT.length);
		//0~12
		int valu=(int)(Math.random()*CardUtil.VALU.length);
		//임의의 카드 값을 갖는다. H8, H6, ...
		cardVal=CardUtil.SUIT[suit]+CardUtil.VALU[valu];
	}
	// 테스트용
	public Card(String s) {
		this.cardVal=s;  // 문자열은 값복사
	}
	// 복사 생성자
	public Card(Card c) {      // 다른 카드의 카드값만 가져온다.
		this(c.getCardVal());  // 문자열은 값복사
		// this.cardVal=c.getCardVal(); //동일
	}
	// cardVal 내용 
	@Override
	public String toString() {
		return "[" + cardVal + "]";
	}
}//
