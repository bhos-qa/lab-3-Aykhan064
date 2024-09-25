import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PermissionManagerTest {

    @Test
    fun testGetRoleName() {
        val manager = PermissionManager()
        assertEquals("USER", manager.getRoleName())
    }

    @Test
    fun testSetCurrentLevel() {
        val manager = PermissionManager()
        manager.setRoleName(PermissionLevel.USER)
        assertEquals("USER", manager.getRoleName())
        manager.setRoleName(PermissionLevel.ADMIN)
        assertEquals("ADMIN", manager.getRoleName())
        manager.setRoleName(PermissionLevel.DEVELOPER)
        assertEquals("DEVELOPER", manager.getRoleName())
    }
}
