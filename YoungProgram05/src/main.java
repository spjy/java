package com.ednermanslaya12.TCNGuardSupport;
 
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
 
public class main extends JavaPlugin implements Listener{
       
        @Override
        public void onEnable(){
                getLogger().info("Welcome to Guard Support Plugin! Made by Edner for The Constellation Network.");
                Bukkit.getServer().getPluginManager().registerEvents(this, this);
               
        }
       
        @Override
        public boolean onCommand(CommandSender sender, Command cmnd, String cmd, String[] args) {
            if(cmnd.getName().equalsIgnoreCase("gs")) {
                if(sender instanceof Player) {
                    if(sender.hasPermission("tcnguard.call")) {
                        if(args.length == 2) {
                            Player target = Bukkit.getServer().getPlayer(args[1]);
                            if(target != null) {
                                if(!target.hasPermission("tcnguard.call.nocall")) {
                                    if(args[0].equalsIgnoreCase("s")) {
                                        callItem(((Player) sender).getPlayer(), target, "sword");
                                        return true;
                                    }
                                    else if(args[0].equalsIgnoreCase("d")) {
                                        callItem(((Player) sender).getPlayer(), target, "drugs");
                                        return true;
                                    }
                                    else if(args[0].equalsIgnoreCase("b")) {
                                        callItem(((Player) sender).getPlayer(), target, "bow");
                                        return true;
                                    }
                                    else if(args[0].equalsIgnoreCase("p")) {
                                        callItem(((Player) sender).getPlayer(), target, "potion");
                                        return true;
                                    }
                                    else if(args[0].equalsIgnoreCase("a")) {
                                        callItem(((Player) sender).getPlayer(), target, "arrow");
                                        return true;
                                    }
                                    else if(args[0].equalsIgnoreCase("o")) {
                                        callOut(((Player) sender).getPlayer(), target);
                                        return true;
                                    }
                                }
                                else {
                                    sender.sendMessage(ChatColor.RED + "This player can't be asked for contraband.");
                                    return true;
                                }
                            }
                            else {
                                sender.sendMessage(ChatColor.RED + "Cannot find the specified player.");
                                return true;
                            }
                        }
                        else {0
                            sender.sendMessage(ChatColor.RED + "Invalid arguments! Usage: /gs <s:d:b:p:a:o> <prisoner>");
                            sender.sendMessage(ChatColor.AQUA + "More information on Guard Support commands at " + ChatColor.DARK_AQUA + "www.mc-constellation.net/guards");
                            return true;
                        }
                    }
                    else {
                        sender.sendMessage(ChatColor.DARK_RED + "You do not have access to that command.");
                        return true;
                    }
                }
                else {
                    sender.sendMessage(ChatColor.RED + "Sender must be a player!");
                    return true;
                }
            }
            return false;
        }

		private void callItem(final Player sender, final Player target, final String item) {
            int task1 = this.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
                public void run() {
                    sender.sendMessage(ChatColor.DARK_AQUA + target.getName() + ChatColor.AQUA + " has" + ChatColor.DARK_AQUA + " 4 seconds" + ChatColor.AQUA + " left to comply.");
                    target.playSound(target.getLocation(), Sound.ORB_PICKUP, 1.0F, 1.0F);
                    Title t1 = new Title(ChatColor.GOLD + "4", ChatColor.DARK_BLUE + "Guard " + ChatColor.DARK_AQUA + sender.getName() + ChatColor.AQUA + " is requesting your " + ChatColor.DARK_AQUA + item + ChatColor.AQUA + ".");
                    t1.send(target);
 
                }
            }, 20L);
 
            int task2 = this.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
                public void run() {
                    target.playSound(target.getLocation(), Sound.ORB_PICKUP, 1.0F, 1.0F);
                    sender.sendMessage(ChatColor.DARK_AQUA + target.getName() + ChatColor.AQUA + " has" + ChatColor.DARK_AQUA + " 3 seconds" + ChatColor.AQUA + " left to comply.");
                    Title t2 = new Title(ChatColor.GOLD + "3", ChatColor.DARK_BLUE + "Guard " + ChatColor.DARK_AQUA + sender.getName() + ChatColor.AQUA + " is requesting your " + ChatColor.DARK_AQUA + item + ChatColor.AQUA + ".");
                    t2.send(target);
 
                }
            }, 40L);
 
            int task3 = this.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
                public void run() {
                    target.playSound(target.getLocation(), Sound.ORB_PICKUP, 1.0F, 1.0F);
                    sender.sendMessage(ChatColor.DARK_AQUA + target.getName() + ChatColor.AQUA + " has" + ChatColor.DARK_AQUA + " 2 seconds" + ChatColor.AQUA + " left to comply.");
                    Title t3 = new Title(ChatColor.GOLD + "2", ChatColor.DARK_BLUE + "Guard " + ChatColor.DARK_AQUA + sender.getName() + ChatColor.AQUA + " is requesting your " + ChatColor.DARK_AQUA + item + ChatColor.AQUA + ".");
                    t3.send(target);
                }
            }, 60L);
            int task4 = this.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
                public void run() {
                    target.playSound(target.getLocation(), Sound.ORB_PICKUP, 1.0F, 1.0F);
                    sender.sendMessage(ChatColor.DARK_AQUA + target.getName() + ChatColor.AQUA + " has" + ChatColor.DARK_AQUA + " 1 second" + ChatColor.AQUA + " left to comply.");
                    Title t4 = new Title(ChatColor.GOLD + "1", ChatColor.DARK_BLUE + "Guard " + ChatColor.DARK_AQUA + sender.getName() + ChatColor.AQUA + " is requesting your " + ChatColor.DARK_AQUA + item + ChatColor.AQUA + ".");
                    t4.send(target);
                }
            }, 80L);
            int task5 = this.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
                public void run() {
                    target.playSound(target.getLocation(), Sound.ORB_PICKUP, 1.0F, 1.5F);
                    sender.sendMessage(ChatColor.DARK_AQUA + target.getName() + ChatColor.AQUA + " has no more time left to comply.");
                    Title t5 = new Title(ChatColor.GOLD + "0", ChatColor.DARK_BLUE + "Guard " + ChatColor.DARK_AQUA + sender.getName() + ChatColor.AQUA + " is requesting your " + ChatColor.DARK_AQUA + item + ChatColor.AQUA + ".");
                    t5.send(target);
                }
            }, 100L);
            target.playSound(target.getLocation(), Sound.ORB_PICKUP, 1.0F, 1.0F);
            sender.sendMessage(ChatColor.DARK_AQUA + target.getName() + ChatColor.AQUA + " has" + ChatColor.DARK_AQUA + " 5 seconds" + ChatColor.AQUA + " left to comply.");
            Title t6 = new Title(ChatColor.GOLD + "5", ChatColor.DARK_BLUE + "Guard " + ChatColor.DARK_AQUA + sender.getName() + ChatColor.AQUA + " is requesting your " + ChatColor.DARK_AQUA + item + ChatColor.AQUA + ".");
            t6.send(target);
        }
		
        private void callOut(final Player sender, final Player target) {
            int task1 = this.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
                public void run() {
                    sender.sendMessage(ChatColor.DARK_AQUA + target.getName() + ChatColor.AQUA + " has" + ChatColor.DARK_AQUA + " 4 seconds" + ChatColor.AQUA + " left to comply.");
                    target.playSound(target.getLocation(), Sound.ORB_PICKUP, 1.0F, 1.0F);
                    Title t5 = new Title(ChatColor.GOLD + "4", ChatColor.DARK_BLUE + "Guard " + ChatColor.DARK_AQUA + sender.getName() + ChatColor.AQUA + " is requesting that you" + ChatColor.DARK_AQUA + " leave the safezone" + ChatColor.AQUA + ".");
                    t5.send(target);
                }
            }, 20L);
 
            int task2 = this.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
                public void run() {
                    target.playSound(target.getLocation(), Sound.ORB_PICKUP, 1.0F, 1.0F);
                    sender.sendMessage(ChatColor.DARK_AQUA + target.getName() + ChatColor.AQUA + " has" + ChatColor.DARK_AQUA + " 3 seconds" + ChatColor.AQUA + " left to comply.");
                    Title t5 = new Title(ChatColor.GOLD + "3", ChatColor.DARK_BLUE + "Guard " + ChatColor.DARK_AQUA + sender.getName() + ChatColor.AQUA + " is requesting that you" + ChatColor.DARK_AQUA + " leave the safezone" + ChatColor.AQUA + ".");
                    t5.send(target);
                }
            }, 40L);
 
            int task3 = this.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
                public void run() {
                    target.playSound(target.getLocation(), Sound.ORB_PICKUP, 1.0F, 1.0F);
                    sender.sendMessage(ChatColor.DARK_AQUA + target.getName() + ChatColor.AQUA + " has" + ChatColor.DARK_AQUA + " 2 seconds" + ChatColor.AQUA + " left to comply.");
                    Title t5 = new Title(ChatColor.GOLD + "2", ChatColor.DARK_BLUE + "Guard " + ChatColor.DARK_AQUA + sender.getName() + ChatColor.AQUA + " is requesting that you" + ChatColor.DARK_AQUA + " leave the safezone" + ChatColor.AQUA + ".");
                    t5.send(target);
                }
            }, 60L);
            int task4 = this.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
                public void run() {
                    target.playSound(target.getLocation(), Sound.ORB_PICKUP, 1.0F, 1.0F);
                    sender.sendMessage(ChatColor.DARK_AQUA + target.getName() + ChatColor.AQUA + " has" + ChatColor.DARK_AQUA + " 1 second" + ChatColor.AQUA + " left to comply.");
                    Title t5 = new Title(ChatColor.GOLD + "1", ChatColor.DARK_BLUE + "Guard " + ChatColor.DARK_AQUA + sender.getName() + ChatColor.AQUA + " is requesting that you" + ChatColor.DARK_AQUA + " leave the safezone" + ChatColor.AQUA + ".");
                    t5.send(target);
                }
            }, 80L);
            int task5 = this.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
                public void run() {
                    target.playSound(target.getLocation(), Sound.ORB_PICKUP, 1.0F, 1.5F);
                    sender.sendMessage(ChatColor.DARK_AQUA + target.getName() + ChatColor.AQUA + " has no more time left to comply.");
                    Title t5 = new Title(ChatColor.GOLD + "0", ChatColor.DARK_BLUE + "Guard " + ChatColor.DARK_AQUA + sender.getName() + ChatColor.AQUA + " is requesting that you" + ChatColor.DARK_AQUA + " leave the safezone" + ChatColor.AQUA + ".");
                    t5.send(target);
                }
            }, 100L);
            target.playSound(target.getLocation(), Sound.ORB_PICKUP, 1.0F, 1.0F);
            sender.sendMessage(ChatColor.DARK_AQUA + target.getName() + ChatColor.AQUA + " has" + ChatColor.DARK_AQUA + " 5 seconds" + ChatColor.AQUA + " left to comply.");
            Title t5 = new Title(ChatColor.GOLD + "5", ChatColor.DARK_BLUE + "Guard " + ChatColor.DARK_AQUA + sender.getName() + ChatColor.AQUA + " is requesting that you" + ChatColor.DARK_AQUA + " leave the safezone" + ChatColor.AQUA + ".");
            t5.send(target);
        }
 
}