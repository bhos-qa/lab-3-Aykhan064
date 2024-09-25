import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PermissionManagerTest {

    @Test
    fun testGetRoleName() {
        val manager = PermissionManager()
        assertEquals("Admin", manager.getRoleName(PermissionLevel.ADMIN))
        assertEquals("Developer", manager.getRoleName(PermissionLevel.DEVELOPER))
        assertEquals("User", manager.getRoleName(PermissionLevel.USER))
    }

    @Test
    fun testSetCurrentLevel() {
        val manager = PermissionManager()

        manager.setPermissionLevel(PermissionLevel.ADMIN)
        assertEquals(PermissionLevel.ADMIN, manager.getPermissionLevel())

        manager.setPermissionLevel(PermissionLevel.DEVELOPER)
        assertEquals(PermissionLevel.DEVELOPER, manager.getPermissionLevel())

        manager.setPermissionLevel(PermissionLevel.USER)
        assertEquals(PermissionLevel.USER, manager.getPermissionLevel())
    }
}
