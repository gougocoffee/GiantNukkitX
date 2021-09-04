package cn.size.sizeplayer;

import cn.nukkit.plugin.*;
import cn.nukkit.event.player.*;
import cn.nukkit.*;
import cn.nukkit.event.*;
import cn.nukkit.potion.Effect;

public class Main extends PluginBase implements Listener {
        public void onEnable() {
            super.onEnable();
            this.getLogger().info(String.valueOf(this.getName()) + "§d\u542f\u52a8\u4e2d\u2026\u2026\u2026\u2026§c|§e拉普达Rapda");
            this.getServer().getPluginManager().registerEvents((Listener)this, (Plugin)this);
        }

        public void onLoad() {
            super.onLoad();
            this.getLogger().info(String.valueOf(this.getName()) + "§d\u52a0\u8f7d\u4e2d\u2026\u2026\u2026\u2026§c|§e拉普达Rapda");
        }

        public void onDisable() {
            super.onDisable();
            this.getLogger().info(String.valueOf(this.getName()) + "§d\u5173\u95ed\u4e2d\u2026\u2026\u2026\u2026§c|§e拉普达Rapda");
        }

    @EventHandler
    public void PlayerJoin(final PlayerJoinEvent event) {
        final Player player = event.getPlayer();
        player.setScale(5);
        player.setMaxHealth(80);
    }

    @EventHandler
    public void Player(final PlayerMoveEvent event) {
        final Player player = event.getPlayer();
        player.addEffect(Effect.getEffect(8).setAmplifier(10).setDuration(5).setVisible(false));
        player.addEffect(Effect.getEffect(1).setAmplifier(10).setDuration(5).setVisible(false));
    }

}
