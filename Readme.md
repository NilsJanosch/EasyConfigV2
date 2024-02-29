# EasyConfigV2
[![GitHub stars](https://img.shields.io/github/stars/NilsJanosch/EasyConfigV2?style=for-the-badge&logo=github)](https://github.com/NilsJanosch/EasyConfigV2/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/NilsJanosch/EasyConfigV2?style=for-the-badge&logo=github)](https://github.com/NilsJanosch/EasyConfigV2/network/members)
[![GitHub issues](https://img.shields.io/github/issues/NilsJanosch/EasyConfigV2?style=for-the-badge&logo=github)](https://github.com/NilsJanosch/EasyConfigV2/issues)
## Made with

![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)

### Dependencies

_You will find all the dependencies in the `pom.xml` file._

| Dependency        | Version  |                                                                           Source |
|:------------------|:--------:|---------------------------------------------------------------------------------:|
| com.google.code.gson          | 2.10.1 | [mvn](https://mvnrepository.com/artifact/com.google.code.gson/gson) |

## Usage

To use this configuration library, follow these steps:

1. Initialize the configuration using `@ConfigProperty(file = "")`.
2. Create configuration items using `@Config(name = "")`. You can also set minimum and maximum values for integers and floats.

The configuration will be stored in a JSON file and will contain multiple JSON objects structured as follows:

```json
{
  "ClassName": {
    "exampleValue": 10
  }
}
```

The loading and saving of the configuration work as follows:

1. It loads the values from the configuration file (if it exists) into the fields that are annotated.
2. It starts a cycle that saves the values from the annotated fields into the configuration.

This approach has the advantage that you don't have to load anything explicitly. You can use normal variables in your code, and it will automatically update the configuration.

## Example Code

```java
@ConfigProperty(file = "config.json")
public class ExampleConfig {
    
    @Config(name = "exampleValue", min = 0, max = 100)
    private int exampleValue;
    
    // Other configuration fields and methods
}
```

## Contributing
Contributions are welcome! Feel free to raise issues or submit pull requests to help improve EasyConfig.

## License

This project is licensed under the [MIT License](https://github.com/NilsJanosch/EasyConfigV2/LICENSE).
