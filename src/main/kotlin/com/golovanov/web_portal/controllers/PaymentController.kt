package com.golovanov.web_portal.controllers

import com.golovanov.web_portal.services.PaymentService
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/payments")
class PaymentController(
    private val paymentService: PaymentService
) {
    @PostMapping("/send")
    suspend fun sendPaymentLink(@AuthenticationPrincipal userDetails: UserDetails) {
        paymentService.createPaymentAndSendEmail(userDetails)
    }
}
