package ch06;

class Document {
	static int count = 0;
	String name;	// document name
	
	Document(){		// 문서 생성시 문서명을 지정하지 않았을때,
		this("untitled." + ++count);
	}
	
	Document(String name){
		this.name = name;
		System.out.println("Document " + this.name + " has created.");
	}
}

class DocumentTest {
	public static void main(String[] args) {
		Document d1 = new Document();
		Document d2 = new Document("Phython.txt");
		Document d3 = new Document();
		Document d4 = new Document();
	}

}
