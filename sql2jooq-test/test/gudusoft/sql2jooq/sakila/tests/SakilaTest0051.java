package gudusoft.sql2jooq.sakila.tests;

import static org.jooq.impl.DSL.*;
import static org.junit.Assert.*;
import static gudusoft.sakila.Tables.*;

import java.sql.*;

import org.jooq.*;
import org.jooq.impl.*;
import org.junit.*;
import org.jooq.types.*;

import gudusoft.sakila.tables.*;
import gudusoft.sql2jooq.sakila.MySQLTest;

/**
 * @author Lukas Eder
 */
@SuppressWarnings({ "unchecked", "rawtypes", "unused", "all" })
public class SakilaTest0051 extends MySQLTest
{

	@Test
	public void test() throws Exception 
	{
		String sql = "select case actor_id when 1 then 1 end from actor where actor_id < 10";
		
		if (sql.toLowerCase().startsWith("select")) 
		{
			assertSame(ctx.fetch(sql), generatedSQL(conn));
		}
		else 
		{
			throw new UnsupportedOperationException("DML is not yet supported");
		}
	}
	
	private static Result generatedSQL( Connection conn )
	{
		DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

Result result = create.select( DSL.decode( ).value( ((Field)Actor.ACTOR.ACTOR_ID) ).when( DSL.inline( 1 ), DSL.inline( 1 ) ) )
	.from( Actor.ACTOR )
	.where( ((Field)Actor.ACTOR.ACTOR_ID).lessThan( DSL.inline( 10 ) ) ).fetch( );

		return result;
	}
}
