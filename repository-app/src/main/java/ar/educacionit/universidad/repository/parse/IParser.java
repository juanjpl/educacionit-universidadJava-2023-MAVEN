package ar.educacionit.universidad.repository.parse;

public interface IParser<T> {

	public T parse() throws Exception;
}
