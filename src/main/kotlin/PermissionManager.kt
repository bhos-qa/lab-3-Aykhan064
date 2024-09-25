class PermissionManager {
    private var mCurrentLevel: PermissionLevel = PermissionLevel.USER

    fun getRoleName(): String {
        return mCurrentLevel.name
    }

    fun setRoleName(level: PermissionLevel) {
        mCurrentLevel = level
    }
}
