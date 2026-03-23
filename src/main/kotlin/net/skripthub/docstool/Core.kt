package net.skripthub.docstool

import net.minestom.server.MinecraftServer
import net.skripthub.docstool.commands.GenerateDocsCommand
import org.bukkit.plugin.java.JavaPlugin

class Core: JavaPlugin() {

    companion object {
        lateinit var plugin: JavaPlugin
            private set
    }

    override fun onEnable() {
        server.consoleSender.sendMessage("[Skript Hub Docs Tool] For development servers only! Do not run "
                + "this in production!")
        plugin = this
        MinecraftServer.getCommandManager().register(GenerateDocsCommand())
        server.consoleSender.sendMessage("[Skript Hub Docs Tool] Skript Hub Docs Tool Enabled")
    }
}
