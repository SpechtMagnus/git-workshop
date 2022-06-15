package com.iteratec.gitworkshop.repository

import com.iteratec.gitworkshop.data.CommandDescription
import org.springframework.stereotype.Repository

@Repository
class GitInfoRepo {

    val endpointList: List<String> = listOf("gitCommitAmend", "gitCherry-Pick");

    fun getInfoAmend(): CommandDescription {
        return CommandDescription(
                "Git Commit Amend",
                "git commit --amend",
                "Allows the user to modify the last committed commit."
        );
    }

    fun getInfoCherryPick(): CommandDescription {
        return CommandDescription(
                "Git Cherry-Pick",
                "git cherry-pick [hash]",
                "Given one or more existing commits, apply the change each one introduces, recording a new commit for each."
        )
    }
}