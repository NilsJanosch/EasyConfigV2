package xyz.dev.truthy.example;

import xyz.dev.truthy.config.processor.ConfigProcessor;
import xyz.dev.truthy.config.EasyConfig;
import xyz.dev.truthy.config.processor.EasyConfigProcessor;

import java.io.File;

public class Main {
    /*
     * This is just an example usage of the config system.
     * You can delete the whole package "example" if you want :D
     */
    public static void main(String[] args) {
        // Chosen Config File
        File configFile = new File("example/config.json");

        // Creating Config Processor
        ConfigProcessor processor = new EasyConfigProcessor();

        // Initialize EasyConfig Object
        EasyConfig easyConfig = new EasyConfig(configFile, processor);

        easyConfig.start();
    }
}