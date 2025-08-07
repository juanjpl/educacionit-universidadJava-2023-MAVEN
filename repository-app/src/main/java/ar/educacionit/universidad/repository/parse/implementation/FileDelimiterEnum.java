package ar.educacionit.universidad.repository.parse.implementation;

public enum FileDelimiterEnum {

	COMA(","),
	PUNTOYCOMA(";");
	
	private String delimiter;
	
	private FileDelimiterEnum (String delimiter) {
		this.delimiter = delimiter;
	}
	
	public String getDelimiter() {
		return delimiter;
	}
}
