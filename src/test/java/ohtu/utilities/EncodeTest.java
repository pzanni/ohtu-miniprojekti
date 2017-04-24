package ohtu.utilities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class EncodeTest {
	@Test
	public void toBibTexConversionsSeemFine() {
		assertEquals("Veljeni Leijonamieli\\\"{a}", Encode.toBibTex("Veljeni Leijonamieliä"));
		assertEquals("\\\"{a}\\\"{A}\\\"{o}\\\"{O}", Encode.toBibTex("äÄöÖ"));
	}
}