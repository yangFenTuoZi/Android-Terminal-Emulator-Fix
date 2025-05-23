/*
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jackpal.androidterm

import java.io.IOException

/**
 * Utility methods for managing a pty file descriptor.
 */
object Exec {
    // Warning: bump the library revision, when an incompatible change happens
    init {
        System.loadLibrary("term")
    }

    @Throws(IOException::class)
    external fun setPtyWindowSizeInternal(fd: Int, row: Int, col: Int, xpixel: Int, ypixel: Int)

    @Throws(IOException::class)
    external fun setPtyUTF8ModeInternal(fd: Int, utf8Mode: Boolean)
}

