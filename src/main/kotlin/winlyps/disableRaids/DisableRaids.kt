package winlyps.disableRaids

import org.bukkit.plugin.java.JavaPlugin

class DisableRaids : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("disableRaids", "true")
        }
        logger.info("DisableRaids plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("disableRaids", "false")
            logger.info("DisableRaids plugin has been disabled.")
        }
    }
}