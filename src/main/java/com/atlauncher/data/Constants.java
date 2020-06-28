/*
 * ATLauncher - https://github.com/ATLauncher/ATLauncher
 * Copyright (C) 2013-2020 ATLauncher
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.atlauncher.data;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

import com.atlauncher.App;

public class Constants {
    static {
        String versionFromFile = new BufferedReader(
                new InputStreamReader(App.class.getResourceAsStream("/version"), StandardCharsets.UTF_8)).lines()
                        .collect(Collectors.joining("")).trim();
        String[] versionParts = versionFromFile.split("\\.", 4);

        String stream = "Release";

        if (versionParts[3].endsWith(".Beta")) {
            versionParts[3] = versionParts[3].replace(".Beta", "");
            stream = "Beta";
        }

        VERSION = new LauncherVersion(Integer.parseInt(versionParts[0]), Integer.parseInt(versionParts[1]),
                Integer.parseInt(versionParts[2]), Integer.parseInt(versionParts[3]), stream);
    }

    public static final LauncherVersion VERSION;
    public static final String LAUNCHER_NAME = "ATLauncher";
    public static final String DISCORD_CLIENT_ID = "589393213723246592";
    public static final String GA_TRACKING_ID = "UA-88820616-7";
    public static final String CROWDIN_URL = "https://crowdin.com/project/atlauncher";
    public static final String SENTRY_DSN = "https://499c3bbc55cb434dad42a3ac670e2c91@sentry.io/1498519";
    public static final String API_BASE_URL = "https://api.atlauncher.com/v1/launcher/";
    public static final String PASTE_CHECK_URL = "https://paste.atlauncher.com";
    public static final String SERVERS_LIST_PACK = "https://servers.atlauncher.com/list/pack";
    public static final String PASTE_API_URL = "https://paste.atlauncher.com/api/create";
    public static final String CURSE_API_URL = "https://addons-ecs.forgesvc.net/api/v2";
    public static final int CURSE_FABRIC_CATEGORY_ID = 4780;
    public static final int CURSE_PAGINATION_SIZE = 40;
    public static final int CURSE_FABRIC_MOD_ID = 306612;
    public static final int CURSE_MODS_SECTION_ID = 6;
    public static final int CURSE_RESOURCE_PACKS_SECTION_ID = 12;
    public static final int CURSE_WORLDS_SECTION_ID = 17;
    public static final String FORGE_MAVEN = "https://files.minecraftforge.net/maven/net/minecraftforge/forge";
    public static final String FABRIC_MAVEN = "https://maven.fabricmc.net/";
    public static final String DOWNLOAD_SERVER = "https://download.nodecdn.net/containers/atl";
    public static final String DOWNLOAD_HOST = "download.nodecdn.net";
    public static final String LAUNCHER_META_MINECRAFT = "https://launchermeta.mojang.com";
    public static final String MINECRAFT_LIBRARIES = "https://libraries.minecraft.net/";
    public static final String MINECRAFT_RESOURCES = "https://resources.download.minecraft.net";
    public static final String LEGACY_JAVA_FIXER_URL = "https://enderman.atlcdn.net/legacyjavafixer-1.0.jar";
    public static final String LEGACY_JAVA_FIXER_MD5 = "12c337cb2445b56b097e7c25a5642710";
}
