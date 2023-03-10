package ren.nearby.auto.publish

import org.gradle.api.Project

class Logger {
    Project project

    Logger(Project project) {
        this.project = project
    }

    /**
     * for Jenkins log capture
     */
    static def j(String log) {
        println("[JLog] "+ log)
    }

    static def i(String log) {
        println(log)
    }
}