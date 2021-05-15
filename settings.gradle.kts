rootProject.name = "otuskotlin-202012-finrecords-ka"
pluginManagement{
    val kotlinVersion: String by settings
    plugins{
        kotlin("jvm") version kotlinVersion
        kotlin("multiplatform") version kotlinVersion
    }
}
include("backend-common")
include("multiplatform-common")
