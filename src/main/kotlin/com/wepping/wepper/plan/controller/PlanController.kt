package com.wepping.wepper.plan.controller

import com.wepping.wepper.plan.dto.PlanDto
import mu.KotlinLogging
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/plan")
class PlanController {
    val log = KotlinLogging.logger{} // kotlin 은 lombok 사용이 불가...

    // TODO : method 이름 정하기
    @GetMapping("/get")
    fun getPlan():String{
        log.info { "get done..." }
        return "get done"
    }

    @PostMapping("/post")
    fun postPlan(@RequestBody plan: PlanDto):String{
        log.info { "post done..." }
        return "post done"
    }
    @DeleteMapping("/delete")
    fun deletePlan(@RequestBody plan: PlanDto):String{
        log.info { "delete dto..." }
        return "delete done"
    }
}