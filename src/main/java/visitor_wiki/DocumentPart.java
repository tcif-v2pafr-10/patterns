package visitor_wiki;

public abstract class DocumentPart {
	public String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}

