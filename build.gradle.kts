/*
 * This file is part of Rocket4J.
 *
 * Rocket4J is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Rocket4J is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Rocket4J.  If not, see <https://www.gnu.org/licenses/>.
 */
plugins {
    java

    id("com.github.ben-manes.versions") version "0.28.0"
}

group = "org.dreamexposure"
version = "0.1.0"

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = sourceCompatibility
}

tasks {
    dependencyUpdates {
        gradleReleaseChannel = "current"
    }

    wrapper {
        gradleVersion = "6.5"
        distributionType = Wrapper.DistributionType.ALL
    }
}
