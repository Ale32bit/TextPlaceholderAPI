package net.minecraft.text;

public record KeybindTextContent(String key) implements TextContent {
    public String getKey() {
        return key;
    }

    @Override
    public String getString() {
        return "<key>";
    }
}