/*
 * Copyright 2019-2020 Mamoe Technologies and contributors.
 *
 * 此源代码的使用受 GNU AFFERO GENERAL PUBLIC LICENSE version 3 许可证的约束, 可以在以下链接找到该许可证.
 * Use of this source code is governed by the GNU AFFERO GENERAL PUBLIC LICENSE version 3 license that can be found through the following link.
 *
 * https://github.com/mamoe/mirai/blob/master/LICENSE
 */

package net.mamoe.mirai.console.intellij

import net.mamoe.mirai.console.intellij.diagnostics.ContextualParametersChecker
import net.mamoe.mirai.console.intellij.diagnostics.PluginDataValuesChecker
import org.jetbrains.kotlin.container.StorageComponentContainer
import org.jetbrains.kotlin.container.useInstance
import org.jetbrains.kotlin.descriptors.ModuleDescriptor
import org.jetbrains.kotlin.extensions.StorageComponentContainerContributor

class IDEContainerContributor : StorageComponentContainerContributor {
    override fun registerModuleComponents(
        container: StorageComponentContainer,
        platform: org.jetbrains.kotlin.platform.TargetPlatform,
        moduleDescriptor: ModuleDescriptor,
    ) {
        container.useInstance(ContextualParametersChecker())
        container.useInstance(PluginDataValuesChecker())
    }
}