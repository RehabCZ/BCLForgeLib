package net.kaikk.mc.bcl.forgelib;

import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.DimensionManager;

public class Util {
	public static World getWorld(String worldName) {
		for (WorldServer ws : DimensionManager.getWorlds()) {
			if (ws.getWorldInfo().getWorldName().equals(worldName)) {
				return ws;
			}
		}
		return null;
	}
	
	public static World getWorld(int id) {
		return DimensionManager.getWorld(id);
	}
}
