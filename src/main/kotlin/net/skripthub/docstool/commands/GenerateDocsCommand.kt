package net.skripthub.docstool.commands

import net.minestom.server.command.builder.Command
import net.minestom.server.command.builder.condition.Conditions
import net.skripthub.docstool.Core
import net.skripthub.docstool.documentation.BuildDocs

class GenerateDocsCommand : Command("gendocs") {

    init {
        setCondition { sender, ctx -> Conditions.consoleOnly(sender, ctx) }
        setDefaultExecutor  { sender, _ ->
            run {
                sender.sendMessage("Generating docs...")
                BuildDocs(Core.plugin, sender).load()
            }
        }
    }

}