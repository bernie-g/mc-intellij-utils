package com.github.bernie-g.mcintellijutils.services

import com.intellij.openapi.project.Project
import com.github.bernie-g.mcintellijutils.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
