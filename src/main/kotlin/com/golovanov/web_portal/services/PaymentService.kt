package com.golovanov.web_portal.services

import com.golovanov.web_portal.services.auth.AuthService
import kotlinx.coroutines.reactor.awaitSingle
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.stereotype.Service

@Service
class PaymentService(
    private val emailService: EmailService,
    private val authService: AuthService,
) {
    suspend fun createPaymentAndSendEmail(userDetails: UserDetails) {
        val email = authService.getCurrentUser(userDetails).awaitSingle().email
        val paymentLink = generatePaymentLink(email)
        emailService.sendPaymentLink(email, paymentLink)
    }

    private fun generatePaymentLink(userEmail: String): String {
        // Пример: интеграция с платежной системой
        return "https://payment.example.com/pay?user=$userEmail&token=abc123"
    }
}
