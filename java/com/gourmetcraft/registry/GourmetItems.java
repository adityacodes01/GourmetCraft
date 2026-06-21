package com.gourmetcraft.registry;

import java.util.LinkedHashMap;
import java.util.Map;

import com.gourmetcraft.GourmetCraft;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * Registers every food item + the creative tab from one data-driven list.
 * Forge 26.2 needs each Item.Properties to carry its id via .setId(...);
 * food() attaches the FOOD component (nutrition + saturation).
 *
 * (RISK) lines use the FoodProperties builder, whose exact 26.2 method names
 * I could not verify — if the build errors, those are the only spots.
 */
public final class GourmetItems {
    private GourmetItems() {}

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GourmetCraft.MOD_ID);

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GourmetCraft.MOD_ID);

    public static final Map<String, RegistryObject<Item>> FOODS = new LinkedHashMap<>();

    private static RegistryObject<Item> food(String name, int nutrition, float saturation) {
        RegistryObject<Item> ro = ITEMS.register(name, () -> new Item(
                new Item.Properties()
                        .setId(ITEMS.key(name))
                        .food(new FoodProperties.Builder()        // (RISK) .food() on Properties
                                .nutrition(nutrition)             // (RISK) builder method names
                                .saturationModifier(saturation)
                                .build())));
        FOODS.put(name, ro);
        return ro;
    }

    public static final RegistryObject<Item> POTATO_CHIPS = food("potato_chips", 4, 0.3F);
    public static final RegistryObject<Item> PRETZEL = food("pretzel", 4, 0.4F);
    public static final RegistryObject<Item> RASPBERRY = food("raspberry", 2, 0.2F);
    public static final RegistryObject<Item> SCRAMBLED_EGGS = food("scrambled_eggs", 6, 0.6F);
    public static final RegistryObject<Item> SMOOTHIE = food("smoothie", 5, 0.5F);
    public static final RegistryObject<Item> SPAGHETTI = food("spaghetti", 8, 0.8F);
    public static final RegistryObject<Item> STRAWBERRY = food("strawberry", 3, 0.3F);
    public static final RegistryObject<Item> TACO = food("taco", 6, 0.6F);
    public static final RegistryObject<Item> TIRAMISU = food("tiramisu", 6, 0.6F);
    public static final RegistryObject<Item> TOAST = food("toast", 4, 0.4F);
    public static final RegistryObject<Item> TOMATO_SOUP = food("tomato_soup", 6, 0.6F);
    public static final RegistryObject<Item> VANILLA_ICE_CREAM = food("vanilla_ice_cream", 4, 0.4F);
    public static final RegistryObject<Item> WAFFLE = food("waffle", 5, 0.5F);
    public static final RegistryObject<Item> WHITE_CHOCOLATE_BAR = food("white_chocolate_bar", 4, 0.4F);
    public static final RegistryObject<Item> PINEAPPLE = food("pineapple", 4, 0.4F);
    public static final RegistryObject<Item> PIZZA = food("pizza", 10, 1.0F);
    public static final RegistryObject<Item> PIZZA_SLICE = food("pizza_slice", 4, 0.5F);
    public static final RegistryObject<Item> POPCORN = food("popcorn", 3, 0.3F);
    public static final RegistryObject<Item> OREO_CAKE = food("oreo_cake", 8, 0.8F);
    public static final RegistryObject<Item> PANCAKE = food("pancake", 6, 0.6F);
    public static final RegistryObject<Item> HOT_DOG = food("hot_dog", 6, 0.6F);
    public static final RegistryObject<Item> LEMON = food("lemon", 2, 0.2F);
    public static final RegistryObject<Item> LEMONADE = food("lemonade", 4, 0.4F);
    public static final RegistryObject<Item> MANGO = food("mango", 4, 0.4F);
    public static final RegistryObject<Item> MILKSHAKE = food("milkshake", 5, 0.5F);
    public static final RegistryObject<Item> MUFFIN = food("muffin", 5, 0.5F);
    public static final RegistryObject<Item> OMELETTE = food("omelette", 6, 0.6F);
    public static final RegistryObject<Item> ORANGE = food("orange", 4, 0.4F);
    public static final RegistryObject<Item> COFFEE = food("coffee", 3, 0.3F);
    public static final RegistryObject<Item> COLA = food("cola", 4, 0.3F);
    public static final RegistryObject<Item> BROWNIE = food("brownie", 6, 0.6F);
    public static final RegistryObject<Item> CUPCAKE = food("cupcake", 5, 0.5F);
    public static final RegistryObject<Item> ORANGE_JUICE = food("orange_juice", 4, 0.4F);
    public static final RegistryObject<Item> DONUT = food("donut", 4, 0.5F);
    public static final RegistryObject<Item> DOUBLE_CHEESEBURGER = food("double_cheeseburger", 10, 1.0F);
    public static final RegistryObject<Item> FRENCH_FRIES = food("french_fries", 4, 0.4F);
    public static final RegistryObject<Item> FRIED_RICE = food("fried_rice", 7, 0.7F);
    public static final RegistryObject<Item> GRAPE = food("grape", 3, 0.3F);
    public static final RegistryObject<Item> HOT_CHOCOLATE = food("hot_chocolate", 4, 0.4F);

    // ---- new items ----
    public static final RegistryObject<Item> BAGEL = food("bagel", 5, 0.5F);
    public static final RegistryObject<Item> BANANA = food("banana", 4, 0.4F);
    public static final RegistryObject<Item> BLACKBERRY = food("blackberry", 2, 0.2F);
    public static final RegistryObject<Item> BLUEBERRY = food("blueberry", 2, 0.2F);
    public static final RegistryObject<Item> BURRITO = food("burrito", 8, 0.8F);
    public static final RegistryObject<Item> CEREAL = food("cereal", 5, 0.5F);
    public static final RegistryObject<Item> CHEESEBURGER = food("cheeseburger", 8, 0.8F);
    public static final RegistryObject<Item> CHEESECAKE = food("cheesecake", 6, 0.6F);
    public static final RegistryObject<Item> CHERRIES = food("cherries", 2, 0.2F);
    public static final RegistryObject<Item> CHOCOLATE_BAR = food("chocolate_bar", 4, 0.4F);
    public static final RegistryObject<Item> CHOCOLATE_CAKE = food("chocolate_cake", 8, 0.8F);
    public static final RegistryObject<Item> CHOCOLATE_ICE_CREAM = food("chocolate_ice_cream", 4, 0.4F);
    public static final RegistryObject<Item> FRIED_CHICKEN = food("fried_chicken", 8, 0.8F);

    public static final RegistryObject<CreativeModeTab> TAB = CREATIVE_MODE_TABS.register("gourmetcraft",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.gourmetcraft"))
                    .icon(() -> PIZZA.get().getDefaultInstance())
                    .displayItems((params, output) ->
                            FOODS.values().forEach(ro -> output.accept(ro.get())))
                    .build());
}
