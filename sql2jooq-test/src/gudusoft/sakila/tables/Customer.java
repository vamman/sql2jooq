/**
 * This class is generated by jOOQ
 */
package gudusoft.sakila.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.1.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Customer extends org.jooq.impl.TableImpl<gudusoft.sakila.tables.records.CustomerRecord> {

	private static final long serialVersionUID = -42370998;

	/**
	 * The singleton instance of <code>sakila.customer</code>
	 */
	public static final gudusoft.sakila.tables.Customer CUSTOMER = new gudusoft.sakila.tables.Customer();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<gudusoft.sakila.tables.records.CustomerRecord> getRecordType() {
		return gudusoft.sakila.tables.records.CustomerRecord.class;
	}

	/**
	 * The column <code>sakila.customer.customer_id</code>. 
	 */
	public final org.jooq.TableField<gudusoft.sakila.tables.records.CustomerRecord, org.jooq.types.UShort> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED, this);

	/**
	 * The column <code>sakila.customer.store_id</code>. 
	 */
	public final org.jooq.TableField<gudusoft.sakila.tables.records.CustomerRecord, org.jooq.types.UByte> STORE_ID = createField("store_id", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this);

	/**
	 * The column <code>sakila.customer.first_name</code>. 
	 */
	public final org.jooq.TableField<gudusoft.sakila.tables.records.CustomerRecord, java.lang.String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR.length(45), this);

	/**
	 * The column <code>sakila.customer.last_name</code>. 
	 */
	public final org.jooq.TableField<gudusoft.sakila.tables.records.CustomerRecord, java.lang.String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR.length(45), this);

	/**
	 * The column <code>sakila.customer.email</code>. 
	 */
	public final org.jooq.TableField<gudusoft.sakila.tables.records.CustomerRecord, java.lang.String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(50), this);

	/**
	 * The column <code>sakila.customer.address_id</code>. 
	 */
	public final org.jooq.TableField<gudusoft.sakila.tables.records.CustomerRecord, org.jooq.types.UShort> ADDRESS_ID = createField("address_id", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED, this);

	/**
	 * The column <code>sakila.customer.active</code>. 
	 */
	public final org.jooq.TableField<gudusoft.sakila.tables.records.CustomerRecord, java.lang.Byte> ACTIVE = createField("active", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The column <code>sakila.customer.create_date</code>. 
	 */
	public final org.jooq.TableField<gudusoft.sakila.tables.records.CustomerRecord, java.sql.Timestamp> CREATE_DATE = createField("create_date", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>sakila.customer.last_update</code>. 
	 */
	public final org.jooq.TableField<gudusoft.sakila.tables.records.CustomerRecord, java.sql.Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>sakila.customer</code> table reference
	 */
	public Customer() {
		super("customer", gudusoft.sakila.Sakila.SAKILA);
	}

	/**
	 * Create an aliased <code>sakila.customer</code> table reference
	 */
	public Customer(java.lang.String alias) {
		super(alias, gudusoft.sakila.Sakila.SAKILA, gudusoft.sakila.tables.Customer.CUSTOMER);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<gudusoft.sakila.tables.records.CustomerRecord, org.jooq.types.UShort> getIdentity() {
		return gudusoft.sakila.Keys.IDENTITY_CUSTOMER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<gudusoft.sakila.tables.records.CustomerRecord> getPrimaryKey() {
		return gudusoft.sakila.Keys.KEY_CUSTOMER_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<gudusoft.sakila.tables.records.CustomerRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<gudusoft.sakila.tables.records.CustomerRecord>>asList(gudusoft.sakila.Keys.KEY_CUSTOMER_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<gudusoft.sakila.tables.records.CustomerRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<gudusoft.sakila.tables.records.CustomerRecord, ?>>asList(gudusoft.sakila.Keys.FK_CUSTOMER_STORE, gudusoft.sakila.Keys.FK_CUSTOMER_ADDRESS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public gudusoft.sakila.tables.Customer as(java.lang.String alias) {
		return new gudusoft.sakila.tables.Customer(alias);
	}
}
