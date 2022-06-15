package com.iteratec.gitworkshop.repository

import com.iteratec.gitworkshop.data.CommandDescription
import org.springframework.stereotype.Repository

@Repository
class GitInfoRepo {

    val endpointList: List<String> = listOf("gitCommitAmend", "gitRebase");

    fun getInfoAmend(): CommandDescription
    {
        return CommandDescription(
                "Git Commit Amend",
                "git commit --amend",
                "Allows the user to modify the last committed commit."
        );
    }

    fun getInfoRebase(): CommandDescription
    {
        return CommandDescription(
            "Git Rebase",
            "git rebase <onto-branch>",
            "Allows the user to cherry-pick all commits of the current branch to the commits of the onto-branch."
        );
    }
}