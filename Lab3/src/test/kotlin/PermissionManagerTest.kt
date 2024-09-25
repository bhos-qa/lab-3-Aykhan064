import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PermissionManagerTest {

    @Test
    fun testGetRoleName() {
        val manager = PermissionManager()
        assertEquals("User", manager.getRoleName(PermissionLevel.USER))
        assertEquals("Admin", manager.getRoleName(PermissionLevel.ADMIN))
    }

    @Test
    fun testSetPermissionLevel() {
        val manager = PermissionManager()
        manager.setPermissionLevel(PermissionLevel.ADMIN)
        assertEquals("Admin", manager.getRoleName(PermissionLevel.ADMIN))
    }
}
