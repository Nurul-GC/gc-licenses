package com.github.nurulgc.gclicenses.services

import com.intellij.openapi.project.Project
import com.github.nurulgc.gclicenses.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
