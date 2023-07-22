package tech.luv2code99.web.errors;

public class ItemNotFoundException extends RuntimeException {
	private Long id;
	public ItemNotFoundException(Long id) {
		super("Could not find item "+id);
	}
}
