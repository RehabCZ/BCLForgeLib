package net.kaikk.mc.bcl.forgelib;

import java.util.List;

import net.minecraft.world.World;
import net.minecraftforge.common.ForgeChunkManager.LoadingCallback;
import net.minecraftforge.common.ForgeChunkManager.Ticket;

public class ChunkLoadingCallback implements LoadingCallback {
	@Override
	public void ticketsLoaded(List<Ticket> tickets, World world) {
		// discard all tickets
	}
}
