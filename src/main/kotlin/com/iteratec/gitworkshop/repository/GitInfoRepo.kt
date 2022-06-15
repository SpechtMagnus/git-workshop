package com.iteratec.gitworkshop.repository

import com.iteratec.gitworkshop.data.CommandDescription
import org.springframework.stereotype.Repository

@Repository
class GitInfoRepo {

    val endpointList: List<String> = listOf("gitCommitAmend");

    fun getInfoAmend(): CommandDescription
    {
        return CommandDescription(
                "Git Commit Amend",
                "git commit --amend",
                "Allows the user to modify the last committed commit."
        );
    }
}