package net.kaikk.mc.bcl.forgelib;

import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldServer;

public class Util {
	public static World getWorld(String worldName) {
		for (WorldServer ws : FMLCommonHandler.instance().getMinecraftServerInstance().worldServers) {
			if (ws.getWorldInfo().getWorldName().equals(worldName)) {
				return ws;
			}
		}
		return null;
	}
	
	public static World getWorld(int id) {
		return WorldProvider.getProviderForDimension(id).worldObj;
	}
}
