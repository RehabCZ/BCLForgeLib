package net.kaikk.mc.bcl.forgelib;

import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventListener {
	@SubscribeEvent
	public void onWorldUnload(WorldEvent.Unload event) {
		if (!event.isCanceled() && event.getWorld()!=null) {
			BCLForgeLib.instance().getTickets().remove(event.getWorld().getWorldInfo().getWorldName());
		}
	}
}
