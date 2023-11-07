# ExampleTaterLibPlugin

[![License](https://img.shields.io/github/license/p0t4t0sandwich/ExampleTaterLibPlugin?color=blue)](https://img.shields.io/github/downloads/p0t4t0sandwich/ExampleTaterLibPlugin/LICENSE)
[![Github](https://img.shields.io/github/stars/p0t4t0sandwich/ExampleTaterLibPlugin)](https://github.com/p0t4t0sandwich/ExampleTaterLibPlugin)
[![Github Issues](https://img.shields.io/github/issues/p0t4t0sandwich/ExampleTaterLibPlugin?label=Issues)](https://github.com/p0t4t0sandwich/ExampleTaterLibPlugin/issues)
[![Discord](https://img.shields.io/discord/1067482396246683708?color=7289da&logo=discord&logoColor=white)](https://discord.example.com)
[![wakatime](https://wakatime.com/badge/user/exampleuser/project/exampleproject.svg)](https://wakatime.com/badge/user/exampleuser/project/exampleproject)

Template repo for cross-API Minecraft coding projects

## How to use

1. Refactor each `com.exmaple.pluginname.platform` package to your desired package name
2. Refactor each `com.exmaple.pluginname.common.*Example*.java` class to your desired plugin name
3. Edit the `com.exmaple.pluginname.common.Example$Constants` file and fill in all the variables
4. Edit the main `gradle.properties` file and fill in all the variables
5. Edit the variables in `./build.sh` to match

Link to our support: [Discord](https://discord.example.com)

## Download

[![Github Releases](https://img.shields.io/github/downloads/p0t4t0sandwich/ExampleTaterLibPlugin/total?label=Github&logo=github&color=181717)](https://github.com/p0t4t0sandwich/ExampleTaterLibPlugin/releases)
[![Maven Repo](https://img.shields.io/maven-metadata/v?label=Release&metadataUrl=https%3A%2F%2Fmaven.neuralnexus.dev%2Freleases%2Fdev%2Fneuralnexus%2FExampleTaterLibPlugin%2Fmaven-metadata.xml)](https://maven.neuralnexus.dev/#/releases/dev/neuralnexus/ExampleTaterLibPlugin)
[![Maven Repo](https://img.shields.io/maven-metadata/v?label=Snapshot&metadataUrl=https%3A%2F%2Fmaven.neuralnexus.dev%2Fsnapshots%2Fdev%2Fneuralnexus%2FExampleTaterLibPlugin%2Fmaven-metadata.xml)](https://maven.neuralnexus.dev/#/snapshots/dev/neuralnexus/ExampleTaterLibPlugin)

[![Spigot](https://img.shields.io/spiget/downloads/xxxxxx?label=Spigot&logo=spigotmc&color=ED8106)](https://www.spigotmc.org/resources/exampletaterlibplugin.xxxxxx/)
[![Hangar](https://img.shields.io/badge/Hangar-download-blue)](https://hangar.papermc.io/p0t4t0sandwich/ExampleTaterLibPlugin)
[![Modrinth](https://img.shields.io/modrinth/dt/exampletaterlibplugin?label=Modrinth&logo=modrinth&color=00AF5C)](https://modrinth.com/mod/exampletaterlibplugin)
[![CurseForge](https://img.shields.io/curseforge/dt/xxxxxx?label=CurseForge&logo=curseforge&color=F16436)](https://www.curseforge.com/minecraft/mc-mods/exampletaterlibplugin)
[![Sponge](https://img.shields.io/ore/dt/exampletaterlibplugin?label=Sponge&logo=https%3A%2F%2Fspongepowered.org%2Ffavicon.ico&color=F7CF0D)](https://ore.spongepowered.org/p0t4t0sandwich/ExampleTaterLibPlugin)

## Dependencies

- [TaterLib](https://github.com/p0t4t0sandwich/TaterLib) - Required on all platforms
- [FabricAPI](https://modrinth.com/mod/fabric-api) - Required on Fabric

### Optional Dependencies

- [LuckPerms](https://luckperms.net/) - For permissions/prefix/suffix support

### Compatibility Cheatsheet

ExampleTaterLibPlugin supports: Bukkit, BungeeCord, Fabric, Forge, Sponge, and Velocity

| Server type          | Versions | Jar Name                                     |
|----------------------|----------|----------------------------------------------|
| All 1.13 and up      | 1.13+    | `ExampleTaterLibPlugin-<version>.jar`        |
| All 1.12.2 and below | 1.12.2-  | `ExampleTaterLibPlugin-legacy-<version>.jar` |

## Commands and Permissions

| Command                                   | Permission                      | Description             |
|-------------------------------------------|---------------------------------|-------------------------|
| `/exampletaterlibplugin <version/reload>` | `exampletaterlibplugin.command` | Root TaterUtils Command |

## Release Notes
