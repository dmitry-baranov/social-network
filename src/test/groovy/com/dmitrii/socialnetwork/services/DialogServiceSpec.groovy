package com.dmitrii.socialnetwork.services

import com.dmitrii.socialnetwork.services.DialogService
import spock.lang.Specification

class DialogServiceSpec extends Specification {

    def service = new DialogService()

    def "get dialog message"(){
        given:
        def user1 = "user1"

        when:
        def result = service.getDialogMessages(user1)

        then:
        result.isEmpty()
    }
}
