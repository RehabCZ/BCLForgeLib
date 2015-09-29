package net.kaikk.mc.bcl.forgelib;

import net.minecraftforge.event.world.WorldEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventListener {
	@SubscribeEvent
	public void onWorldUnload(WorldEvent.Unload event) {
		if (!event.isCanceled() && event.world!=null) {
			BCLForgeLib.instance().getTickets().remove(event.world.getWorldInfo().getWorldName());
		}
	}
}
