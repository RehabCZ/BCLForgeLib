package net.kaikk.mc.bcl.forgelib;

import net.minecraft.world.World;
import net.minecraftforge.common.ForgeChunkManager.LoadingCallback;
import net.minecraftforge.common.ForgeChunkManager.Ticket;

import java.util.List;

public class ChunkLoadingCallback implements LoadingCallback {
	@Override
	public void ticketsLoaded(List<Ticket> tickets, World world) {
		// discard all tickets
	}
}
