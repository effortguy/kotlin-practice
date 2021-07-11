import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class MyService {
    fun performAction(): String = "foo"
}

class MyTest {

    @Test
    fun testAction() {

        val s: String? = null;

        assertEquals(s?.isBlank(), true)
    }
}