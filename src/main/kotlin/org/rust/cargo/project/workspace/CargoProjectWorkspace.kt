package org.rust.cargo.project.workspace

import org.rust.cargo.project.CargoProjectDescription
import org.rust.cargo.toolchain.RustToolchain

/**
 * Uses `cargo metadata` command to update IDEA libraries and Cargo project model.
 */
interface CargoProjectWorkspace {
    /**
     * Updates Rust libraries asynchronously. Consecutive updates are coalesced.
     */
    fun scheduleUpdate(toolchain: RustToolchain)

    /**
     * Immediately schedules an update. Shows balloon upon completion.
     *
     * Update is still asynchronous.
     */
    fun updateNow(toolchain: RustToolchain)

    val projectDescription: CargoProjectDescription?
}
