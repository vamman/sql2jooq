/**
 * This class is generated by jOOQ
 */
package gudusoft.sakila.enums;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.1.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum FilmRating implements org.jooq.EnumType {

	G("G"),

	PG("PG"),

	PG_13("PG-13"),

	R("R"),

	NC_17("NC-17"),

	;

	private final java.lang.String literal;

	private FilmRating(java.lang.String literal) {
		this.literal = literal;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Schema getSchema() {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String getName() {
		return "film_rating";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String getLiteral() {
		return literal;
	}
}
