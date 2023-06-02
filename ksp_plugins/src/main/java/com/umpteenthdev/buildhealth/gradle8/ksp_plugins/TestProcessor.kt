package com.umpteenthdev.buildhealth.gradle8.ksp_plugins

import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.processing.SymbolProcessorEnvironment
import com.google.devtools.ksp.symbol.KSAnnotated

internal class TestProcessor(private val environment: SymbolProcessorEnvironment) : SymbolProcessor {

    override fun process(resolver: Resolver): List<KSAnnotated> {
        environment.logger.warn("TestProcessor started")
        Thread.sleep(1)
        return emptyList()
    }
}