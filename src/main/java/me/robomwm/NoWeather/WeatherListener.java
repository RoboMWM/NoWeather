package me.robomwm.NoWeather;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

/**
 * Created by Robo on 11/28/2015.
 */
public class WeatherListener implements Listener
{
    @EventHandler(ignoreCancelled = true, priority = EventPriority.LOWEST)
    public void onWeatherChange(WeatherChangeEvent event)
    {
        if (event.toWeatherState())
            event.isCancelled();
    }
}
