package SeleniumTest;

public class CustomXpathAxes {

	public static void main(String[] args) {
		
		//parent to child:
		// /parent/child::htmltag
		//direct --> parent/child
		//indirect --> parent//indirect 
		
		
		
		//child to parent : backward traversing is possible in xpath
		// child/parent::htmltag
		// child/.. ---->Immediate Parent
		
		//grand parent
		// child/ancestor::htmltag ----> all direct+indirect parents
		
		//sibling
		//1: preceding-sibling
		//2: following-sibling
		

	}

}
