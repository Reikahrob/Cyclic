package com.lothrazar.cyclic.registry;

import java.util.ArrayList;
import java.util.List;
import com.lothrazar.cyclic.ModCyclic;
import com.lothrazar.cyclic.block.battery.ItemBlockBattery;
import com.lothrazar.cyclic.block.cable.CableWrench;
import com.lothrazar.cyclic.block.expcollect.ExpItemGain;
import com.lothrazar.cyclic.block.scaffolding.ItemScaffolding;
import com.lothrazar.cyclic.block.tank.ItemBlockTank;
import com.lothrazar.cyclic.item.AntimatterEvaporatorWandItem;
import com.lothrazar.cyclic.item.CarbonPaperItem;
import com.lothrazar.cyclic.item.EdibleFlightItem;
import com.lothrazar.cyclic.item.EdibleSpecItem;
import com.lothrazar.cyclic.item.ElevationWandItem;
import com.lothrazar.cyclic.item.EnderBagItem;
import com.lothrazar.cyclic.item.EvokerFangItem;
import com.lothrazar.cyclic.item.GemstoneItem;
import com.lothrazar.cyclic.item.ItemBaseCyclic;
import com.lothrazar.cyclic.item.LeverRemote;
import com.lothrazar.cyclic.item.OreProspector;
import com.lothrazar.cyclic.item.SleepingMatItem;
import com.lothrazar.cyclic.item.SpawnInspectorTool;
import com.lothrazar.cyclic.item.SpelunkerCaveFinder;
import com.lothrazar.cyclic.item.StirrupsItem;
import com.lothrazar.cyclic.item.StirrupsReverseItem;
import com.lothrazar.cyclic.item.TeleporterWandItem;
import com.lothrazar.cyclic.item.apple.AppleBuffs;
import com.lothrazar.cyclic.item.apple.AppleChocolate;
import com.lothrazar.cyclic.item.apple.EnderApple;
import com.lothrazar.cyclic.item.apple.LoftyStatureApple;
import com.lothrazar.cyclic.item.bauble.AirAntiGravity;
import com.lothrazar.cyclic.item.bauble.AutoCaveTorchItem;
import com.lothrazar.cyclic.item.bauble.AutoTorchItem;
import com.lothrazar.cyclic.item.bauble.CharmAntidote;
import com.lothrazar.cyclic.item.bauble.CharmFire;
import com.lothrazar.cyclic.item.bauble.CharmInvisible;
import com.lothrazar.cyclic.item.bauble.CharmOverpowered;
import com.lothrazar.cyclic.item.bauble.CharmVoid;
import com.lothrazar.cyclic.item.bauble.CharmWing;
import com.lothrazar.cyclic.item.bauble.CharmWither;
import com.lothrazar.cyclic.item.bauble.FlippersItem;
import com.lothrazar.cyclic.item.bauble.GloveItem;
import com.lothrazar.cyclic.item.bauble.ItemBaseToggle;
import com.lothrazar.cyclic.item.bauble.SoulstoneCharm;
import com.lothrazar.cyclic.item.boomerang.BoomerangItem;
import com.lothrazar.cyclic.item.boomerang.BoomerangItem.Boomer;
import com.lothrazar.cyclic.item.builder.BuildStyle;
import com.lothrazar.cyclic.item.builder.BuilderItem;
import com.lothrazar.cyclic.item.carrot.ItemHorseEmeraldJump;
import com.lothrazar.cyclic.item.carrot.ItemHorseEnder;
import com.lothrazar.cyclic.item.carrot.ItemHorseHealthDiamondCarrot;
import com.lothrazar.cyclic.item.carrot.ItemHorseLapisVariant;
import com.lothrazar.cyclic.item.carrot.ItemHorseRedstoneSpeed;
import com.lothrazar.cyclic.item.carrot.ItemHorseToxic;
import com.lothrazar.cyclic.item.crafting.CraftingBagItem;
import com.lothrazar.cyclic.item.craftingsimple.CraftingStickItem;
import com.lothrazar.cyclic.item.datacard.BlockstateCard;
import com.lothrazar.cyclic.item.datacard.LocationGpsCard;
import com.lothrazar.cyclic.item.datacard.SettingsCard;
import com.lothrazar.cyclic.item.datacard.ShapeCard;
import com.lothrazar.cyclic.item.datacard.SoundCard;
import com.lothrazar.cyclic.item.datacard.filter.FilterCardItem;
import com.lothrazar.cyclic.item.elemental.FireScepter;
import com.lothrazar.cyclic.item.elemental.IceWand;
import com.lothrazar.cyclic.item.elemental.LightningScepter;
import com.lothrazar.cyclic.item.elemental.SnowScepter;
import com.lothrazar.cyclic.item.elemental.WaterSpreaderItem;
import com.lothrazar.cyclic.item.enderbook.EnderBookItem;
import com.lothrazar.cyclic.item.endereye.ItemEnderEyeReuse;
import com.lothrazar.cyclic.item.enderpearl.EnderPearlMount;
import com.lothrazar.cyclic.item.enderpearl.EnderPearlReuse;
import com.lothrazar.cyclic.item.equipment.AmethystAxeItem;
import com.lothrazar.cyclic.item.equipment.AmethystHoeItem;
import com.lothrazar.cyclic.item.equipment.AmethystPickaxeItem;
import com.lothrazar.cyclic.item.equipment.AmethystShovelItem;
import com.lothrazar.cyclic.item.equipment.GlowingHelmetItem;
import com.lothrazar.cyclic.item.equipment.MattockItem;
import com.lothrazar.cyclic.item.equipment.RotatorItem;
import com.lothrazar.cyclic.item.equipment.ShearsMaterial;
import com.lothrazar.cyclic.item.findspawner.ItemProjectileDungeon;
import com.lothrazar.cyclic.item.heart.HeartItem;
import com.lothrazar.cyclic.item.heart.HeartToxicItem;
import com.lothrazar.cyclic.item.inventorycake.ItemCakeInventory;
import com.lothrazar.cyclic.item.magicnet.ItemMagicNet;
import com.lothrazar.cyclic.item.magicnet.ItemMobContainer;
import com.lothrazar.cyclic.item.random.RandomizerItem;
import com.lothrazar.cyclic.item.scythe.ScytheBrush;
import com.lothrazar.cyclic.item.scythe.ScytheForage;
import com.lothrazar.cyclic.item.scythe.ScytheHarvest;
import com.lothrazar.cyclic.item.scythe.ScytheLeaves;
import com.lothrazar.cyclic.item.slingshot.SlingshotItem;
import com.lothrazar.cyclic.item.storagebag.ItemStorageBag;
import com.lothrazar.cyclic.item.torchthrow.ItemTorchThrower;
import com.lothrazar.cyclic.item.transporter.TileTransporterEmptyItem;
import com.lothrazar.cyclic.item.transporter.TileTransporterItem;
import com.lothrazar.cyclic.item.wing.EnderWingItem;
import com.lothrazar.cyclic.item.wing.EnderWingSp;
import com.lothrazar.cyclic.registry.MaterialRegistry.ToolMats;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemRegistry {

  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModCyclic.MODID);
  public static final RegistryObject<Item> GLOWING_HELMET = ITEMS.register("glowing_helmet", () -> new GlowingHelmetItem(MaterialRegistry.ArmorMats.GLOWING, EquipmentSlot.HEAD, (new Item.Properties()).tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> FLUIDHOPPER = ITEMS.register("hopper_fluid", () -> new BlockItem(BlockRegistry.FLUIDHOPPER.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> HOPPER = ITEMS.register("hopper", () -> new BlockItem(BlockRegistry.HOPPER.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> HOPPERGOLD = ITEMS.register("hopper_gold", () -> new BlockItem(BlockRegistry.HOPPERGOLD.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> ANVILVOID = ITEMS.register("anvil_void", () -> new BlockItem(BlockRegistry.ANVILVOID.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> FANSLAB = ITEMS.register("fan_slab", () -> new BlockItem(BlockRegistry.FANSLAB.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> ROTATOR = ITEMS.register("rotator", () -> new BlockItem(BlockRegistry.ROTATOR.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> DETECTORMOON = ITEMS.register("detector_moon", () -> new BlockItem(BlockRegistry.DETECTORMOON.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> DETECTORWEATHER = ITEMS.register("detector_weather", () -> new BlockItem(BlockRegistry.DETECTORWEATHER.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> TERRAGLASS = ITEMS.register("terra_glass", () -> new BlockItem(BlockRegistry.TERRAGLASS.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> STATECARD = ITEMS.register("blockstate_data", () -> new BlockstateCard(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> SPRINKLER = ITEMS.register("sprinkler", () -> new BlockItem(BlockRegistry.SPRINKLER.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> SHEARING = ITEMS.register("shearing", () -> new BlockItem(BlockRegistry.SHEARING.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> CHORUS_FLIGHT = ITEMS.register("chorus_flight", () -> new EdibleFlightItem(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> CHORUS_SPECTRAL = ITEMS.register("chorus_spectral", () -> new EdibleSpecItem(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> CHARM_LONGFALL = ITEMS.register("charm_longfall", () -> new ItemBaseToggle(new Item.Properties().durability(256 * 4).tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> CHARM_CREEPER = ITEMS.register("charm_creeper", () -> new ItemBaseToggle(new Item.Properties().durability(256).tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> CHARM_STONE = ITEMS.register("charm_stone", () -> new ItemBaseToggle(new Item.Properties().durability(256 * 4).tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> CHARM_ANTIPOTION = ITEMS.register("charm_antipotion", () -> new ItemBaseToggle(new Item.Properties().durability(256).tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> CHARM_STEALTHPOTION = ITEMS.register("charm_stealthpotion", () -> new ItemBaseToggle(new Item.Properties().stacksTo(1).tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> CHARM_BOOSTPOTION = ITEMS.register("charm_boostpotion", () -> new ItemBaseToggle(new Item.Properties().durability(256).tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> CHARM_CRIT = ITEMS.register("charm_crit", () -> new ItemBaseToggle(new Item.Properties().durability(256 * 4).tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> QUIVER_DMG = ITEMS.register("quiver_damage", () -> new ItemBaseToggle(new Item.Properties().durability(256 * 4).tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> QUIVER_LIT = ITEMS.register("quiver_lightning", () -> new ItemBaseToggle(new Item.Properties().durability(256 * 4).tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> CLOAK_INVISIBLE = ITEMS.register("charm_invisible", () -> new CharmInvisible(new Item.Properties().durability(256 * 4).tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> CHARM_MAGICDEF = ITEMS.register("charm_magicdefense", () -> new ItemBaseToggle(new Item.Properties().durability(256 * 4).tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> CHARM_STARVATION = ITEMS.register("charm_starvation", () -> new ItemBaseToggle(new Item.Properties().durability(256 * 256).tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> CHARM_VENOM = ITEMS.register("charm_venom", () -> new ItemBaseToggle(new Item.Properties().durability(256).tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> CHARM_WATER = ITEMS.register("charm_water", () -> new ItemBaseToggle(new Item.Properties().durability(256).tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> CHARM_SPEED = ITEMS.register("charm_speed", () -> new ItemBaseToggle(new Item.Properties().durability(256 * 4).tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> CHARM_KNOCKBACK_RESIST = ITEMS.register("charm_knockback_resistance", () -> new ItemBaseToggle(new Item.Properties().durability(256).tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> CHARM_LUCK = ITEMS.register("charm_luck", () -> new ItemBaseToggle(new Item.Properties().durability(256 * 4).tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> CHARM_ATTACKSPEED = ITEMS.register("charm_attack_speed", () -> new ItemBaseToggle(new Item.Properties().durability(256 * 4).tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> CHARM_XPSPEED = ITEMS.register("charm_xp_speed", () -> new ItemBaseToggle(new Item.Properties().stacksTo(1).tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> CHARM_XPSTOPPER = ITEMS.register("charm_xp_blocker", () -> new ItemBaseToggle(new Item.Properties().stacksTo(1).tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> PROSPECTOR = ITEMS.register("prospector", () -> new OreProspector(new Item.Properties().durability(256).tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> ENDER_BOOK = ITEMS.register("ender_book", () -> new EnderBookItem(new Item.Properties().durability(8).tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> DARK_GLASS_CONNECTED = ITEMS.register("dark_glass_connected", () -> new BlockItem(BlockRegistry.DARK_GLASS_CONNECTED.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> ENDER_ITEM_SHELF = ITEMS.register("ender_item_shelf", () -> new BlockItem(BlockRegistry.ENDER_ITEM_SHELF.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> SPIKES_DIAMOND = ITEMS.register("spikes_diamond", () -> new BlockItem(BlockRegistry.SPIKES_DIAMOND.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> SPIKES_IRON = ITEMS.register("spikes_iron", () -> new BlockItem(BlockRegistry.SPIKES_IRON.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> SPIKES_CURSE = ITEMS.register("spikes_curse", () -> new BlockItem(BlockRegistry.SPIKES_CURSE.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> SPIKES_FIRE = ITEMS.register("spikes_fire", () -> new BlockItem(BlockRegistry.SPIKES_FIRE.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> DOORBELL = ITEMS.register("doorbell", () -> new BlockItem(BlockRegistry.DOORBELL.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> WIRELESS_ENERGY = ITEMS.register("wireless_energy", () -> new BlockItem(BlockRegistry.WIRELESS_ENERGY.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> WIRELESS_ITEM = ITEMS.register("wireless_item", () -> new BlockItem(BlockRegistry.WIRELESS_ITEM.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> BUILD_SCEPTER = ITEMS.register("build_scepter", () -> new BuilderItem(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP), BuildStyle.NORMAL));
  public static final RegistryObject<Item> REPLACE_SCEPTER = ITEMS.register("replace_scepter", () -> new BuilderItem(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP), BuildStyle.REPLACE));
  public static final RegistryObject<Item> OFFSET_SCEPTER = ITEMS.register("offset_scepter", () -> new BuilderItem(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP), BuildStyle.REPLACE));
  public static final RegistryObject<Item> RANDOMIZE_SCEPTER = ITEMS.register("randomize_scepter", () -> new RandomizerItem(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> SPAWNINSPECTOR = ITEMS.register("spawn_inspector", () -> new SpawnInspectorTool(new Item.Properties().durability(256).tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> CHARM_WING = ITEMS.register("charm_wing", () -> new CharmWing(new Item.Properties().durability(64).tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> SLINGSHOT = ITEMS.register("slingshot", () -> new SlingshotItem(new Item.Properties().durability(64).tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> SOULSTONE = ITEMS.register("soulstone", () -> new SoulstoneCharm(new Item.Properties().durability(8).tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> WIRELESS_FLUID = ITEMS.register("wireless_fluid", () -> new BlockItem(BlockRegistry.WIRELESS_FLUID.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> INVENTORY_CAKE = ITEMS.register("inventory_cake", () -> new ItemCakeInventory(new Item.Properties().stacksTo(1).tab(MaterialRegistry.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(1).saturationMod(10).alwaysEat().build())));
  public static final RegistryObject<Item> SOUND_RECORDER = ITEMS.register("sound_recorder", () -> new BlockItem(BlockRegistry.SOUND_RECORDER.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> SOUND_PLAYER = ITEMS.register("sound_player", () -> new BlockItem(BlockRegistry.SOUND_PLAYER.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> GENERATOR_FUEL = ITEMS.register("generator_fuel", () -> new BlockItem(BlockRegistry.GENERATOR_FUEL.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> GENERATOR_FOOD = ITEMS.register("generator_food", () -> new BlockItem(BlockRegistry.GENERATOR_FOOD.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> GENERATOR_FLUID = ITEMS.register("generator_fluid", () -> new BlockItem(BlockRegistry.GENERATOR_FLUID.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> GENERATOR_ITEM = ITEMS.register("generator_item", () -> new BlockItem(BlockRegistry.GENERATOR_ITEM.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> PACKAGER = ITEMS.register("packager", () -> new BlockItem(BlockRegistry.PACKAGER.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> SOUND_DATA = ITEMS.register("sound_data", () -> new SoundCard(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> MEMBRANE = ITEMS.register("membrane", () -> new BlockItem(BlockRegistry.MEMBRANE.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> LAMP = ITEMS.register("lamp", () -> new BlockItem(BlockRegistry.LAMP.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> SOIL = ITEMS.register("soil", () -> new BlockItem(BlockRegistry.SOIL.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> CLOUD = ITEMS.register("cloud", () -> new BlockItem(BlockRegistry.CLOUD.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> CLOUD_MEMBRANE = ITEMS.register("cloud_membrane", () -> new BlockItem(BlockRegistry.CLOUD_MEMBRANE.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> GEM_OBSIDIAN = ITEMS.register("gem_obsidian", () -> new GemstoneItem(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> GEM_AMBER = ITEMS.register("gem_amber", () -> new GemstoneItem(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", () -> new GemstoneItem(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> NETHERITE_NUGGET = ITEMS.register("netherite_nugget", () -> new GemstoneItem(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> COMPRESSED_COBBLESTONE = ITEMS.register("compressed_cobblestone", () -> new BlockItem(BlockRegistry.COMPRESSED_COBBLESTONE.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> FLINT_BLOCK = ITEMS.register("flint_block", () -> new BlockItem(BlockRegistry.FLINT_BLOCK.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> OBSIDIAN_PRESSURE_PLATE = ITEMS.register("obsidian_pressure_plate", () -> new BlockItem(BlockRegistry.OBSIDIAN_PRESSURE_PLATE.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> GOLD_BARS = ITEMS.register("gold_bars", () -> new BlockItem(BlockRegistry.GOLD_BARS.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> GOLD_CHAIN = ITEMS.register("gold_chain", () -> new BlockItem(BlockRegistry.GOLD_CHAIN.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> GOLD_LANTERN = ITEMS.register("gold_lantern", () -> new BlockItem(BlockRegistry.GOLD_LANTERN.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> GOLD_SOUL_LANTERN = ITEMS.register("gold_soul_lantern", () -> new BlockItem(BlockRegistry.GOLD_SOUL_LANTERN.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> COPPER_BARS = ITEMS.register("copper_bars", () -> new BlockItem(BlockRegistry.COPPER_BARS.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> COPPER_CHAIN = ITEMS.register("copper_chain", () -> new BlockItem(BlockRegistry.COPPER_CHAIN.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> COPPER_LANTERN = ITEMS.register("copper_lantern", () -> new BlockItem(BlockRegistry.COPPER_LANTERN.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> COPPER_SOUL_LANTERN = ITEMS.register("copper_soul_lantern", () -> new BlockItem(BlockRegistry.COPPER_SOUL_LANTERN.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> COPPER_PRESSURE_PLATE = ITEMS.register("copper_pressure_plate", () -> new BlockItem(BlockRegistry.COPPER_PRESSURE_PLATE.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> NETHERITE_BARS = ITEMS.register("netherite_bars", () -> new BlockItem(BlockRegistry.NETHERITE_BARS.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> NETHERTIE_CHAIN = ITEMS.register("netherite_chain", () -> new BlockItem(BlockRegistry.NETHERTIE_CHAIN.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> NETHERITE_PRESSURE_PLATE = ITEMS.register("netherite_pressure_plate", () -> new BlockItem(BlockRegistry.NETHERITE_PRESSURE_PLATE.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> NETHERITE_LANTERN = ITEMS.register("netherite_lantern", () -> new BlockItem(BlockRegistry.NETHERITE_LANTERN.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> SPONGE_LAVA = ITEMS.register("sponge_lava", () -> new BlockItem(BlockRegistry.SPONGE_LAVA.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> CRUSHER = ITEMS.register("crusher", () -> new BlockItem(BlockRegistry.CRUSHER.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> GLASS_CONNECTED = ITEMS.register("glass_connected", () -> new BlockItem(BlockRegistry.GLASS_CONNECTED.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> LOCATION_DATA = ITEMS.register("location_data", () -> new LocationGpsCard(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> SETTINGS_DATA = ITEMS.register("settings_data", () -> new SettingsCard(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> SHAPE_DATA = ITEMS.register("shape_data", () -> new ShapeCard(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> FILTER_DATA = ITEMS.register("filter_data", () -> new FilterCardItem(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)));
  public static final RegistryObject<Item> FLOWER_CUAN = ITEMS.register("flower_cyan", () -> new BlockItem(BlockRegistry.FLOWER_CYAN.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> FLOWER_PURPLE = ITEMS.register("flower_purple_tulip", () -> new BlockItem(BlockRegistry.FLOWER_PURPLE_TULIP.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> FLOWER_BROWN = ITEMS.register("flower_absalon_tulip", () -> new BlockItem(BlockRegistry.FLOWER_ABSALON_TULIP.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> FLOWER_LIME = ITEMS.register("flower_lime_carnation", () -> new BlockItem(BlockRegistry.FLOWER_LIME_CARNATION.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> WATER_CANDLE = ITEMS.register("water_candle", () -> new BlockItem(BlockRegistry.WATER_CANDLE.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> PEACE_CANDLE = ITEMS.register("peace_candle", () -> new BlockItem(BlockRegistry.PEACE_CANDLE.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  public static final RegistryObject<Item> TELEPORT = ITEMS.register("teleport", () -> new BlockItem(BlockRegistry.TELEPORT.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)));
  //
  public static List<ItemBaseCyclic> items = new ArrayList<>(); // TODO: delet this. only used for legacy registerClient hax
  @ObjectHolder(ModCyclic.MODID + ":charm_fire")
  public static Item charm_fire;
  @ObjectHolder(ModCyclic.MODID + ":spawner_seeker")
  public static Item spawner_seeker;
  @ObjectHolder(ModCyclic.MODID + ":boomerang_damage")
  public static Item boomerang_damage;
  @ObjectHolder(ModCyclic.MODID + ":boomerang_carry")
  public static Item boomerang_carry;
  @ObjectHolder(ModCyclic.MODID + ":boomerang_stun")
  public static Item boomerang_stun;
  @ObjectHolder(ModCyclic.MODID + ":mob_container")
  public static ItemMobContainer mob_container;
  @ObjectHolder(ModCyclic.MODID + ":magic_net")
  public static Item magic_net;
  @ObjectHolder(ModCyclic.MODID + ":tile_transporter")
  public static Item tile_transporter;
  @ObjectHolder(ModCyclic.MODID + ":tile_transporter_empty")
  public static Item tile_transporterempty;
  @ObjectHolder(ModCyclic.MODID + ":storage_bag")
  public static Item storage_bag;
  @ObjectHolder(ModCyclic.MODID + ":crafting_bag")
  public static Item crafting_bag;
  @ObjectHolder(ModCyclic.MODID + ":crafting_stick")
  public static Item crafting_stick;

  @SuppressWarnings("deprecation")
  @SubscribeEvent
  public static void onItemsRegistry(RegistryEvent.Register<Item> event) {
    IForgeRegistry<Item> r = event.getRegistry();
    r.register(new BlockItem(BlockRegistry.GHOST_PHANTOM.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("ghost_phantom"));
    r.register(new BlockItem(BlockRegistry.GHOST.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("ghost"));
    r.register(new BlockItem(BlockRegistry.LASER.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("laser"));
    r.register(new BlockItem(BlockRegistry.APPLE_SPROUT, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("apple_sprout"));
    r.register(new BlockItem(BlockRegistry.apple_sprout_diamond, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("apple_sprout_diamond"));
    r.register(new BlockItem(BlockRegistry.APPLE_SPROUT_EMERALD, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("apple_sprout_emerald"));
    r.register(new BlockItem(BlockRegistry.COMPUTER_SHAPE, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("computer_shape"));
    r.register(new BlockItem(BlockRegistry.EYE_REDSTONE, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("eye_redstone"));
    r.register(new BlockItem(BlockRegistry.EYE_TELEPORT, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("eye_teleport"));
    r.register(new ItemBlockBattery(BlockRegistry.battery, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("battery"));
    r.register(new BlockItem(BlockRegistry.peat_unbaked, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("peat_unbaked"));
    r.register(new BlockItem(BlockRegistry.peat_baked, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("peat_baked"));
    r.register(new BlockItem(BlockRegistry.SOLIDIFIER, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("solidifier"));
    r.register(new BlockItem(BlockRegistry.peat_farm, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("peat_farm"));
    r.register(new BlockItem(BlockRegistry.MELTER, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("melter"));
    r.register(new BlockItem(BlockRegistry.placer, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("placer"));
    r.register(new BlockItem(BlockRegistry.breaker, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("breaker"));
    r.register(new BlockItem(BlockRegistry.user, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("user"));
    r.register(new BlockItem(BlockRegistry.DROPPER, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("dropper"));
    r.register(new BlockItem(BlockRegistry.forester, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("forester"));
    r.register(new BlockItem(BlockRegistry.MINER, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("miner"));
    r.register(new BlockItem(BlockRegistry.structure, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("structure"));
    r.register(new BlockItem(BlockRegistry.harvester, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("harvester"));
    r.register(new BlockItem(BlockRegistry.collector, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("collector"));
    r.register(new BlockItem(BlockRegistry.collector_fluid, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("collector_fluid"));
    r.register(new BlockItem(BlockRegistry.placer_fluid, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("placer_fluid"));
    //redstone
    r.register(new BlockItem(BlockRegistry.cask, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("cask"));
    r.register(new BlockItem(BlockRegistry.crate, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("crate"));
    r.register(new BlockItem(BlockRegistry.clock, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("clock"));
    r.register(new BlockItem(BlockRegistry.wireless_transmitter, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("wireless_transmitter"));
    r.register(new BlockItem(BlockRegistry.wireless_receiver, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("wireless_receiver"));
    //fun
    r.register(new BlockItem(BlockRegistry.plate_launch_redstone, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("plate_launch_redstone"));
    r.register(new BlockItem(BlockRegistry.plate_launch, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("plate_launch"));
    // machine blocks   
    r.register(new BlockItem(BlockRegistry.detector_item, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("detector_item"));
    r.register(new BlockItem(BlockRegistry.detector_entity, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("detector_entity"));
    r.register(new BlockItem(BlockRegistry.SCREEN, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("screen"));
    r.register(new BlockItem(BlockRegistry.UNCRAFTER, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("uncrafter"));
    r.register(new BlockItem(BlockRegistry.fisher, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("fisher"));
    r.register(new BlockItem(BlockRegistry.disenchanter, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("disenchanter"));
    r.register(new BlockItem(BlockRegistry.fan, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("fan"));
    r.register(new BlockItem(BlockRegistry.LIGHT_CAMO.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("light_camo"));
    r.register(new BlockItem(BlockRegistry.soundproofing_ghost, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("soundproofing_ghost"));
    r.register(new BlockItem(BlockRegistry.soundproofing, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("soundproofing"));
    r.register(new BlockItem(BlockRegistry.anvil, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("anvil"));
    r.register(new BlockItem(BlockRegistry.anvil_magma, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("anvil_magma"));
    r.register(new BlockItem(BlockRegistry.beacon, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("beacon"));
    r.register(new ItemBlockTank(BlockRegistry.tank, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("tank"));
    r.register(new BlockItem(BlockRegistry.dark_glass, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("dark_glass"));
    r.register(new BlockItem(BlockRegistry.trash, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("trash"));
    r.register(new BlockItem(BlockRegistry.battery_infinite, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("battery_infinite"));
    r.register(new BlockItem(BlockRegistry.item_infinite, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("item_infinite"));
    r.register(new BlockItem(BlockRegistry.dice, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("dice"));
    r.register(new BlockItem(BlockRegistry.TERRA_PRETA.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("terra_preta"));
    r.register(new BlockItem(BlockRegistry.FIREPLACE, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("fireplace"));
    r.register(new BlockItem(BlockRegistry.CRAFTER, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("crafter"));
    r.register(new BlockItem(BlockRegistry.unbreakable_block, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("unbreakable_block"));
    r.register(new BlockItem(BlockRegistry.unbreakable_reactive, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("unbreakable_reactive"));
    r.register(new BlockItem(BlockRegistry.CONVEYOR, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("conveyor"));
    r.register(new BlockItem(BlockRegistry.ENDER_SHELF, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("ender_shelf"));
    r.register(new BlockItem(BlockRegistry.ENDER_CONTROLLER, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("ender_controller"));
    r.register(new BlockItem(BlockRegistry.WORKBENCH.get(), new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("workbench"));
    // exp machines
    r.register(new BlockItem(BlockRegistry.experience_pylon, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("experience_pylon"));
    r.register(new ExpItemGain(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("experience_food"));
    // resources
    //energy 
    r.register(new ItemBaseCyclic(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("peat_fuel"));
    r.register(new ItemBaseCyclic(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("peat_fuel_enriched"));
    r.register(new ItemBaseCyclic(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("biomass"));
    // basic tools
    r.register(new MattockItem(Tiers.DIAMOND, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(9000), 1).setRegistryName("mattock"));
    r.register(new MattockItem(Tiers.NETHERITE, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(9001), 2).setRegistryName("mattock_nether"));
    r.register(new MattockItem(Tiers.STONE, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(1024), 1).setRegistryName("mattock_stone"));
    r.register(new SleepingMatItem(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("sleeping_mat"));
    r.register(new ShearsMaterial(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(1024 * 1024)).setRegistryName("shears_obsidian"));
    //weak flint n steel 
    r.register(new ShearsMaterial(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(64)).setRegistryName("shears_flint"));
    r.register(new RotatorItem(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(256)).setRegistryName("rotation_wand"));
    r.register(new ScytheBrush(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(256)).setRegistryName("scythe_brush"));
    r.register(new ScytheForage(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(256)).setRegistryName("scythe_forage"));
    r.register(new ScytheLeaves(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(256)).setRegistryName("scythe_leaves"));
    r.register(new StirrupsItem(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(256)).setRegistryName("stirrups"));
    r.register(new StirrupsReverseItem(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(256)).setRegistryName("stirrups_reverse"));
    r.register(new LeverRemote(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).stacksTo(1)).setRegistryName("lever_remote"));
    // magic tools
    r.register(new CarbonPaperItem(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("carbon_paper"));
    r.register(new SnowScepter(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(256)).setRegistryName("ice_scepter"));
    r.register(new FireScepter(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(256)).setRegistryName("fire_scepter"));
    r.register(new LightningScepter(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(256)).setRegistryName("lightning_scepter"));
    r.register(new EnderBagItem(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("ender_bag"));
    r.register(new WaterSpreaderItem(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(256)).setRegistryName("spell_water"));
    r.register(new IceWand(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(256)).setRegistryName("spell_ice"));
    r.register(new ItemTorchThrower(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("torch_launcher"));
    r.register(new AutoTorchItem(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(256 * 4)).setRegistryName("charm_torch"));
    r.register(new AutoCaveTorchItem(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(256 * 4)).setRegistryName("charm_torch_cave"));
    r.register(new EnderWingItem(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(256)).setRegistryName("charm_home"));
    r.register(new EnderWingSp(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(256)).setRegistryName("charm_world"));
    r.register(new EvokerFangItem(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("evoker_fang"));
    r.register(new ItemEnderEyeReuse(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("ender_eye_reuse"));
    r.register(new EnderPearlReuse(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("ender_pearl_reuse"));
    r.register(new EnderPearlMount(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("ender_pearl_mounted"));
    r.register(new ItemProjectileDungeon(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("spawner_seeker"));
    r.register(new SpelunkerCaveFinder(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(256)).setRegistryName("spelunker"));
    r.register(new ItemMagicNet(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("magic_net"));
    r.register(new ItemMobContainer(new Item.Properties().stacksTo(1)).setRegistryName("mob_container"));
    r.register(new TileTransporterEmptyItem(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("tile_transporter_empty"));
    r.register(new TileTransporterItem(new Item.Properties()).setRegistryName("tile_transporter"));
    r.register(new ElevationWandItem(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(256)).setRegistryName("elevation_wand"));
    r.register(new TeleporterWandItem(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(64)).setRegistryName("teleport_wand"));
    r.register(new ScytheHarvest(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(1024)).setRegistryName("scythe_harvest"));
    r.register(new ItemStorageBag(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).stacksTo(1).setNoRepair()).setRegistryName("storage_bag"));
    r.register(new CraftingBagItem(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).stacksTo(1).setNoRepair()).setRegistryName("crafting_bag"));
    r.register(new CraftingStickItem(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).stacksTo(1).setNoRepair()).setRegistryName("crafting_stick"));
    r.register(new AntimatterEvaporatorWandItem(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(1024)).setRegistryName("antimatter_wand"));
    ///////////////////////// apples
    final int smallPotionDur = 20 * 90; // 1:30
    final int largePotionDur = 3 * 20 * 60; // 3:00
    int h = Foods.APPLE.getNutrition();
    float s = Foods.APPLE.getSaturationModifier();
    //honey is basic. fast to eat, gives lots of food but no potion effects 
    r.register(new EnderApple(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(h).saturationMod(0).alwaysEat()
        .build())).setRegistryName("apple_ender"));
    //
    r.register(new LoftyStatureApple(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(h).saturationMod(0).alwaysEat()
        .build())).setRegistryName("apple_lofty_stature"));
    //
    r.register(new ItemBaseCyclic(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(h * 4).saturationMod(s * 4)
        .build())).setRegistryName("apple_honey"));
    //
    r.register(new AppleBuffs(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(h).saturationMod(s)
        .effect(new MobEffectInstance(MobEffects.LEVITATION, largePotionDur, 1), 1)
        .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, largePotionDur, 0), 1)
        .effect(new MobEffectInstance(MobEffects.UNLUCK, largePotionDur, 1), 1)
        .effect(new MobEffectInstance(MobEffects.SLOW_FALLING, smallPotionDur, 1), 1)
        .alwaysEat()
        .build())).setRegistryName("apple_chorus"));
    //
    r.register(new AppleBuffs(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(h).saturationMod(s)
        .effect(new MobEffectInstance(MobEffects.JUMP, largePotionDur, 4 + 5), 1)
        .effect(new MobEffectInstance(MobEffects.INVISIBILITY, largePotionDur, 0), 1)
        .effect(new MobEffectInstance(MobEffects.WEAKNESS, largePotionDur, 2), 1)
        .effect(new MobEffectInstance(MobEffects.UNLUCK, largePotionDur, 0), 1)
        .alwaysEat()
        .build())).setRegistryName("apple_bone"));
    //
    r.register(new AppleBuffs(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(h).saturationMod(s)
        .effect(new MobEffectInstance(MobEffects.DIG_SPEED, largePotionDur, 0), 1)
        .effect(new MobEffectInstance(MobEffects.GLOWING, largePotionDur, 0), 1)
        .effect(new MobEffectInstance(MobEffects.WATER_BREATHING, largePotionDur, 0), 1)
        .alwaysEat()
        .build())).setRegistryName("apple_prismarine"));
    //
    //iron and lapis are basic ones
    r.register(new AppleBuffs(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(h).saturationMod(s * 4)
        .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, largePotionDur, 0), 1)
        .effect(new MobEffectInstance(MobEffects.WATER_BREATHING, largePotionDur, 0), 1)
        .effect(new MobEffectInstance(MobEffects.CONDUIT_POWER, largePotionDur, 0), 1)
        .effect(new MobEffectInstance(MobEffects.SLOW_FALLING, largePotionDur, 0), 1)
        .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, largePotionDur, 0), 1)
        //        .effect(new EffectInstance(PotionRegistry.PotionEffects.swimspeed, FIVEMIN, 0), 1)
        .fast().alwaysEat()
        .build())).setRegistryName("apple_lapis"));
    r.register(new AppleBuffs(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(h).saturationMod(s)
        .effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, largePotionDur, 2), 1)
        .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, largePotionDur, 2), 1)
        .fast().alwaysEat()
        .build())).setRegistryName("apple_iron"));
    //stronger ones 
    r.register(new AppleBuffs(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(1).saturationMod(1)
        .effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, smallPotionDur, 4), 1)
        .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, smallPotionDur, 4), 1)
        .fast().alwaysEat()
        .build())).setRegistryName("apple_diamond"));
    r.register(new AppleBuffs(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(h * 3).saturationMod(s)
        .effect(new MobEffectInstance(MobEffects.DIG_SPEED, smallPotionDur, 2), 1)
        .effect(new MobEffectInstance(MobEffects.LUCK, smallPotionDur, 1), 1)
        .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, smallPotionDur, 1), 1)
        .effect(new MobEffectInstance(MobEffects.SLOW_FALLING, smallPotionDur, 1), 1)
        .alwaysEat().build())).setRegistryName("apple_emerald"));
    r.register(new AppleChocolate(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).food(new FoodProperties.Builder().nutrition(h).saturationMod(s * 4)
        .alwaysEat().build())).setRegistryName("apple_chocolate"));
    ////////////////////////////////////////
    r.register(new BoomerangItem(Boomer.STUN, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(256)).setRegistryName("boomerang_stun"));
    r.register(new BoomerangItem(Boomer.CARRY, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(256)).setRegistryName("boomerang_carry"));
    r.register(new BoomerangItem(Boomer.DAMAGE, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(256)).setRegistryName("boomerang_damage"));
    r.register(new ItemScaffolding(BlockRegistry.scaffold_replace, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("scaffold_replace"));
    r.register(new ItemScaffolding(BlockRegistry.scaffold_fragile, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("scaffold_fragile"));
    r.register(new ItemScaffolding(BlockRegistry.scaffold_responsive, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("scaffold_responsive"));
    r.register(new BlockItem(BlockRegistry.energy_pipe, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("energy_pipe"));
    r.register(new BlockItem(BlockRegistry.item_pipe, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("item_pipe"));
    r.register(new BlockItem(BlockRegistry.fluid_pipe, new Item.Properties().tab(MaterialRegistry.BLOCK_GROUP)).setRegistryName("fluid_pipe"));
    r.register(new CableWrench(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("cable_wrench"));
    r.register(new GloveItem(new Item.Properties().durability(256 * 8).tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("glove_climb"));
    r.register(new FlippersItem(new Item.Properties().durability(256 * 4).tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("flippers"));
    r.register(new AirAntiGravity(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(1024 * 4)).setRegistryName("antigravity"));
    r.register(new CharmVoid(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(64)).setRegistryName("charm_void"));
    r.register(new CharmAntidote(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(64)).setRegistryName("charm_antidote"));
    r.register(new CharmFire(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(64)).setRegistryName("charm_fire"));
    r.register(new CharmWither(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(64)).setRegistryName("charm_wither"));
    r.register(new CharmOverpowered(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).durability(256)).setRegistryName("charm_ultimate"));
    r.register(new ItemHorseEnder(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("carrot_ender"));
    r.register(new ItemHorseHealthDiamondCarrot(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("diamond_carrot_health"));
    r.register(new ItemHorseRedstoneSpeed(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("redstone_carrot_speed"));
    r.register(new ItemHorseEmeraldJump(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("emerald_carrot_jump"));
    r.register(new ItemHorseLapisVariant(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("lapis_carrot_variant"));
    r.register(new ItemHorseToxic(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("toxic_carrot"));
    r.register(new ArmorItem(MaterialRegistry.ArmorMats.GEMOBSIDIAN, EquipmentSlot.FEET, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("crystal_boots"));
    r.register(new ArmorItem(MaterialRegistry.ArmorMats.GEMOBSIDIAN, EquipmentSlot.HEAD, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("crystal_helmet"));
    r.register(new ArmorItem(MaterialRegistry.ArmorMats.GEMOBSIDIAN, EquipmentSlot.CHEST, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("crystal_chestplate"));
    r.register(new ArmorItem(MaterialRegistry.ArmorMats.GEMOBSIDIAN, EquipmentSlot.LEGS, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("crystal_leggings"));
    r.register(new ArmorItem(MaterialRegistry.ArmorMats.EMERALD, EquipmentSlot.FEET, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("emerald_boots"));
    r.register(new ArmorItem(MaterialRegistry.ArmorMats.EMERALD, EquipmentSlot.HEAD, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("emerald_helmet"));
    r.register(new ArmorItem(MaterialRegistry.ArmorMats.EMERALD, EquipmentSlot.CHEST, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("emerald_chestplate"));
    r.register(new ArmorItem(MaterialRegistry.ArmorMats.EMERALD, EquipmentSlot.LEGS, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("emerald_leggings"));
    r.register(new AmethystPickaxeItem(MaterialRegistry.ToolMats.AMETHYST, 1, -2.8F, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("amethyst_pickaxe"));
    r.register(new PickaxeItem(MaterialRegistry.ToolMats.COPPER, 1, -2.8F, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("copper_pickaxe"));
    r.register(new PickaxeItem(MaterialRegistry.ToolMats.EMERALD, 1, -2.8F, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("emerald_pickaxe"));
    r.register(new PickaxeItem(MaterialRegistry.ToolMats.GEMOBSIDIAN, 1, -2.8F, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("crystal_pickaxe"));
    r.register(new PickaxeItem(MaterialRegistry.ToolMats.SANDSTONE, 1, -2.8F, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("sandstone_pickaxe"));
    r.register(new PickaxeItem(MaterialRegistry.ToolMats.NETHERBRICK, 1, -2.8F, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("netherbrick_pickaxe"));
    r.register(new AmethystAxeItem(MaterialRegistry.ToolMats.AMETHYST, 6.0F, -3.1F, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("amethyst_axe"));
    r.register(new AxeItem(MaterialRegistry.ToolMats.COPPER, 6.0F, -3.1F, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("copper_axe"));
    r.register(new AxeItem(MaterialRegistry.ToolMats.EMERALD, 5.0F, -3.0F, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("emerald_axe"));
    r.register(new AxeItem(MaterialRegistry.ToolMats.GEMOBSIDIAN, 5.0F, -3.0F, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("crystal_axe"));
    r.register(new AxeItem(MaterialRegistry.ToolMats.SANDSTONE, 5.0F, -3.0F, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("sandstone_axe"));
    r.register(new AxeItem(MaterialRegistry.ToolMats.NETHERBRICK, 5.0F, -3.0F, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("netherbrick_axe"));
    r.register(new AmethystHoeItem(ToolMats.AMETHYST, -4, 0F, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("amethyst_hoe"));
    r.register(new HoeItem(ToolMats.COPPER, -4, 0F, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("copper_hoe"));
    r.register(new HoeItem(ToolMats.EMERALD, -4, 0F, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("emerald_hoe"));
    r.register(new HoeItem(ToolMats.GEMOBSIDIAN, -4, 0F, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("crystal_hoe"));
    r.register(new HoeItem(ToolMats.SANDSTONE, -4, 0F, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("sandstone_hoe"));
    r.register(new HoeItem(ToolMats.NETHERBRICK, -4, 0F, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("netherbrick_hoe"));
    r.register(new AmethystShovelItem(MaterialRegistry.ToolMats.AMETHYST, 1.5F, -3.0F, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("amethyst_shovel"));
    r.register(new ShovelItem(MaterialRegistry.ToolMats.COPPER, 1.5F, -3.0F, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("copper_shovel"));
    r.register(new ShovelItem(MaterialRegistry.ToolMats.EMERALD, 1.5F, -3.0F, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("emerald_shovel"));
    r.register(new ShovelItem(MaterialRegistry.ToolMats.GEMOBSIDIAN, 1.5F, -3.0F, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("crystal_shovel"));
    r.register(new ShovelItem(MaterialRegistry.ToolMats.SANDSTONE, 1.5F, -3.0F, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("sandstone_shovel"));
    r.register(new ShovelItem(MaterialRegistry.ToolMats.NETHERBRICK, 1.5F, -3.0F, new Item.Properties().tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("netherbrick_shovel"));
    r.register(new SwordItem(MaterialRegistry.ToolMats.AMETHYST, 3, -2.4F, (new Item.Properties()).tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("amethyst_sword"));
    //  r.register(new SwordCleaverItem(MaterialRegistry.ToolMats.AMETHYST, 3, -2.4F, (new Item.Properties()).tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("cleaver"));
    r.register(new SwordItem(MaterialRegistry.ToolMats.COPPER, 3, -2.4F, (new Item.Properties()).tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("copper_sword"));
    r.register(new SwordItem(MaterialRegistry.ToolMats.EMERALD, 3, -2.4F, (new Item.Properties()).tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("emerald_sword"));
    r.register(new SwordItem(MaterialRegistry.ToolMats.GEMOBSIDIAN, 3, -2.4F, (new Item.Properties()).tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("crystal_sword"));
    r.register(new SwordItem(MaterialRegistry.ToolMats.SANDSTONE, 3, -2.4F, (new Item.Properties()).tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("sandstone_sword"));
    r.register(new SwordItem(MaterialRegistry.ToolMats.NETHERBRICK, 3, -2.4F, (new Item.Properties()).tab(MaterialRegistry.ITEM_GROUP)).setRegistryName("netherbrick_sword"));
    r.register(new HeartItem(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).stacksTo(16)).setRegistryName("heart"));
    r.register(new HeartToxicItem(new Item.Properties().tab(MaterialRegistry.ITEM_GROUP).stacksTo(16)).setRegistryName("heart_empty"));
  }
}
