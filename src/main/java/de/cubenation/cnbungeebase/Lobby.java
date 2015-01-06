package de.cubenation.cnbungeebase;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class Lobby extends Command {

    public Lobby() {
        super("lobby", null, "hub");
        
    }
 
    public void execute(CommandSender sender, String[] args) {
        if ((sender instanceof ProxiedPlayer)) {
            ((ProxiedPlayer)sender).connect(ProxyServer.getInstance().getServerInfo("hub"));
        }
    }

}
