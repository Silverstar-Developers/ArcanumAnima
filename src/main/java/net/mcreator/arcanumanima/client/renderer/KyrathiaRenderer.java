
package net.mcreator.arcanumanima.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.arcanumanima.entity.KyrathiaEntity;
import net.mcreator.arcanumanima.client.model.Modelgod;

public class KyrathiaRenderer extends MobRenderer<KyrathiaEntity, Modelgod<KyrathiaEntity>> {
	public KyrathiaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgod(context.bakeLayer(Modelgod.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(KyrathiaEntity entity) {
		return new ResourceLocation("arcanum_anima:textures/entities/marianne-on-planetminecraft-com.png");
	}
}
