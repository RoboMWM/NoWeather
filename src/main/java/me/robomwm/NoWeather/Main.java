package me.robomwm.NoWeather;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Robo on 11/28/2015.
 */
public class Main extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        getServer().getPluginManager().registerEvents(new WeatherListener(), this);
    }
}
