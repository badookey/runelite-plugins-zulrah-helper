package com.zulrahhelper;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Keybind;

@ConfigGroup("zulrahhelper")
public interface ZulrahHelperConfig extends Config {
    @ConfigItem(
            keyName = "nextPhaseHotkey",
            name = "Next Phase",
            description = "Increment the phase number by 1",
            position = 2
    )
    default Keybind nextPhaseHotkey() {
        return Keybind.NOT_SET;
    }

    @ConfigItem(
            keyName = "resetPhasesHotkey",
            name = "Reset Phases",
            description = "Set phases back to start",
            position = 1
    )
    default Keybind resetPhasesHotkey() {
        return Keybind.NOT_SET;
    }

    @ConfigItem(
            keyName = "phaseSelection1Hotkey",
            name = "Phase Selection 1",
            description = "Choose the first option in phase selection",
            position = 3
    )
    default Keybind phaseSelection1Hotkey() {
        return Keybind.NOT_SET;
    }

    @ConfigItem(
            keyName = "phaseSelection2Hotkey",
            name = "Phase Selection 2",
            description = "Choose the second option in phase selection",
            position = 4
    )
    default Keybind phaseSelection2Hotkey() {
        return Keybind.NOT_SET;
    }

    @ConfigItem(
            keyName = "phaseSelection3Hotkey",
            name = "Phase Selection 3",
            description = "Choose the third option in phase selection",
            position = 5
    )
    default Keybind phaseSelection3Hotkey() {
        return Keybind.NOT_SET;
    }
}