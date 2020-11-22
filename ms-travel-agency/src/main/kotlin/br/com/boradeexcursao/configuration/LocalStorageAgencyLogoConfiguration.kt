package br.com.boradeexcursao.configuration

import java.io.IOException
import java.nio.file.FileSystems
import java.nio.file.Files
import java.nio.file.Path
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class LocalStorageAgencyLogoConfiguration {

    @Bean
    @Throws(IOException::class)
    fun createDirectoryFromStorageLocalAgencyLogo(@Value("\${storage.agency.logo.path}") path: String): Path {

        return Files.createDirectories(FileSystems.getDefault().getPath(path))

    }
}