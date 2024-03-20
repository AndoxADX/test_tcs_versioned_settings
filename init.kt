import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.*

project {
    id("MyProject")
    name = "My Project"

    vcsRoot(GitVcsRoot({
        id = "MyVcsRoot"
        name = "My VCS Root"
        url = "https://github.com/myusername/myrepository.git"
    }))

    buildType {
        id("MyBuild")
        name = "My Build"

        vcs {
            root("MyVcsRoot")
        }

        steps {
            script {
                scriptContent = "echo 'Hello, World!'"
            }
        }
    }
}