package xyz.dev.truthy.config;

import xyz.dev.truthy.config.processor.ConfigProcessor;

import java.io.File;

public class EasyConfig {
    private final File configFile;
    private final ConfigProcessor processor;

    public EasyConfig(File configFile, ConfigProcessor processor) {
        this.configFile = configFile;
        this.processor = processor;
    }

    public void start() {
        processor.start();
    }
}
