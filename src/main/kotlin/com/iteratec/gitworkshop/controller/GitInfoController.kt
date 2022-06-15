package com.iteratec.gitworkshop.controller

import com.iteratec.gitworkshop.data.CommandDescription
import com.iteratec.gitworkshop.repository.GitInfoRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * A rest interface that provides short descriptions for some git commands.
 * Btw,, Magnus ist der Coolste
 */
@RestController
class GitInfoController {

    @Autowired
    val gitInfoRepo = GitInfoRepo();

    @GetMapping("")
    fun getEndpointList(): List<String> {
        return gitInfoRepo.endpointList;
    }

    @GetMapping("gitCommitAmend")
    fun getInfoAmend() : CommandDescription {
        return gitInfoRepo.getInfoAmend()
    }

    @GetMapping("gitRebase")
    fun getInfoRebase() : CommandDescription {
        return gitInfoRepo.getInfoRebase()
    }
}