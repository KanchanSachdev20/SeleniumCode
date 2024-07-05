package SeleniumTest;

public class CustomXpath {

	public static void main(String[] args) {
		
		
		//xpath: address of element in html dom
		//2 types of xpath: 
		//1:Absolute xpath: absolute address of the element in the HTML dom
		//html/body/div/div[2]/div/ul/li[2]/input
		
		//2:Relative or custom xpath
		//xpath properties
		//xpath axes
		
		//double // -> direct + indirect child elements
		//single / -> only direct element
		
		//htmltag[@attr='value']
		//htmltag[@attr1='value' and @attr2='value']
		//htmltag[@attr1='value' and @attr2='value' and @atrr3='value']
		
		
		//text(); :label, header,link,span
		//htmlTag[text()='value']
		//a[text()='Login']
		
		//contains() with attributes:
		//htmlTag[contains(@attr,'value')]
		
		//htmlTag[contains(@attr,'value1') and contains(attr2,'value')]
		
		//contains with first attribute but no contains with second attribute
		//htmltag[contains(@attr1,'value1') and @attr2='value']
		
		//contains() with text():
		//htmltag[contains(text(),'value')]
		
		//contains() with text() and contains with  @attr
		//htmltag[contains(text(),'value') and contains(@attr,'value')]
		
		//contains() with text() and no contains with  @attr
		//htmltag[contains(text(),'value') and c@attr='value']
		
		//starts-with();
		//htmltag[starts-with(@attr,'value')]
		
		//ends-with in xpath?-----> No
		
		//index:
		 // (//htmltag[@attr='value])[1]
		// (//htmltag[@attr='value])[position()=1]
		// (//htmltag[@attr='value])[last()] ----> Go to last element
		// (//htmltag[@attr='value])[last()-(last()-1)] --- for 1st element 
	}

}
