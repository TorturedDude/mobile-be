package com.golovanov.web_portal.services

import org.springframework.mail.javamail.JavaMailSender
import org.springframework.mail.javamail.MimeMessageHelper
import org.springframework.stereotype.Service

@Service
class EmailService(
    private val mailSender: JavaMailSender
) {
    fun sendPaymentLink(to: String, paymentLink: String) {
        val message = mailSender.createMimeMessage()
        val helper = MimeMessageHelper(message, true, "UTF-8")
        helper.setTo(to)
        helper.setSubject("Ссылка на оплату")
        helper.setText(
            """
            <p>Здравствуйте!</p>
            <p>Перейдите по ссылке для оплаты:</p>
            <p><a href="$paymentLink">$paymentLink</a></p>
            """.trimIndent(),
            true
        )

        mailSender.send(message)
    }
}
