class PermissionManager {
    private var mCurrentLevel: PermissionLevel = PermissionLevel.USER

    fun getRoleName(level: PermissionLevel): String {
        return when (level) {
            PermissionLevel.ADMIN -> "Admin"
            PermissionLevel.DEVELOPER -> "Developer"
            PermissionLevel.USER -> "User"
        }
    }

    fun setPermissionLevel(level: PermissionLevel) {
        mCurrentLevel = level
    }
}
