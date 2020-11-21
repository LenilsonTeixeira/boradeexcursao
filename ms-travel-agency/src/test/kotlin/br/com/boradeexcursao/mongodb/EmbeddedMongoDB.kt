package br.com.boradeexcursao.mongodb

import de.flapdoodle.embed.mongo.Command
import de.flapdoodle.embed.mongo.MongodProcess
import de.flapdoodle.embed.mongo.MongodStarter
import de.flapdoodle.embed.mongo.config.MongodConfigBuilder
import de.flapdoodle.embed.mongo.config.Net
import de.flapdoodle.embed.mongo.config.RuntimeConfigBuilder
import de.flapdoodle.embed.mongo.distribution.Version
import de.flapdoodle.embed.process.config.IRuntimeConfig
import de.flapdoodle.embed.process.config.io.ProcessOutput
import java.io.IOException
import java.util.*
import org.slf4j.LoggerFactory

object EmbeddedMongoDB {
    private var mongodProcess: MongodProcess? = null
    private var host = "localhost"
    private var version = Version.Main.PRODUCTION
    private var port = 29019
    private var active = false
    private val logger = LoggerFactory.getLogger(EmbeddedMongoDB::class.java)

    fun create(): EmbeddedMongoDB? {
        return this
    }

    fun withPort(port: Int): EmbeddedMongoDB? {
        EmbeddedMongoDB.port = port
        return this
    }

    fun withHost(host: String): EmbeddedMongoDB? {
        Objects.requireNonNull(host, "host can not be null")
        EmbeddedMongoDB.host = host
        return this
    }

    fun withVersion(version: Version.Main?): EmbeddedMongoDB? {
        Objects.requireNonNull(version, "version can not be null")
        EmbeddedMongoDB.version = version!!
        return this
    }

    fun start(): EmbeddedMongoDB? {
        if (!active) {
            try {
                val runtimeConfig: IRuntimeConfig = RuntimeConfigBuilder()
                        .defaultsWithLogger(Command.MongoD, logger)
                        .processOutput(ProcessOutput.getDefaultInstanceSilent())
                        .build()
                mongodProcess = MongodStarter.getInstance(runtimeConfig).prepare(MongodConfigBuilder()
                        .version(version)
                        .net(Net(host, port, false))
                        .build()).start()
                active = true
                logger.info("Successfully started EmbeddedMongoDB $host:$port")
            } catch (e: IOException) {
                logger.error("Failed to start EmbeddedMongoDB $host:$port", e)
            }
        }
        return this
    }

    fun stop() {
        if (active) {
            mongodProcess!!.stop()
            active = false
            logger.info("Successfully stopped EmbeddedMongoDB $host:$port")
        }
    }

    fun getHost(): String? {
        return host
    }

    fun getVersion(): Version.Main? {
        return version
    }

    fun getPort(): Int {
        return port
    }

    fun isActive(): Boolean {
        return active
    }
}