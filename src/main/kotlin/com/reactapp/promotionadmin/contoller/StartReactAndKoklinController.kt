package com.reactapp.promotionadmin.contoller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.Date

@RestController
class StartReactController {

    @GetMapping("/api/hello")
    fun hello(): String {

        return "안녕하세요. 현재 서버시간은 "+Date()+" 입니다!!"
    }

}