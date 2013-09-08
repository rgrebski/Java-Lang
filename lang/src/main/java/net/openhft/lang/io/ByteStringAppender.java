/*
 * Copyright 2013 Peter Lawrey
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.openhft.lang.io;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * @author peter.lawrey
 */
public interface ByteStringAppender extends Appendable, BytesCommon {
    @NotNull
    ByteStringAppender append(@NotNull CharSequence s);

    @NotNull
    ByteStringAppender append(@NotNull CharSequence s, int start, int end);

    @NotNull
    ByteStringAppender append(@NotNull byte[] str);

    @NotNull
    ByteStringAppender append(@NotNull byte[] str, int offset, int len);

    @NotNull
    ByteStringAppender append(boolean b);

    @NotNull
    ByteStringAppender append(char c);

    @NotNull
    ByteStringAppender append(@NotNull Enum value);

    @NotNull
    ByteStringAppender append(int i);

    @NotNull
    ByteStringAppender append(long l);

    @NotNull
    ByteStringAppender appendTimeMillis(long timeInMS);

    @NotNull
    ByteStringAppender appendDateMillis(long timeInMS);

    @NotNull
    ByteStringAppender appendDateTimeMillis(long timeInMS);

//    ByteStringAppender append(float f);

//    ByteStringAppender append(float f, int precision);

    @NotNull
    ByteStringAppender append(double d);

    @NotNull
    ByteStringAppender append(double d, int precision);

    @NotNull
    ByteStringAppender append(@NotNull MutableDecimal md);

    @NotNull
    <E> ByteStringAppender append(@NotNull E object);

    @NotNull
    <E> ByteStringAppender append(@NotNull Iterable<E> list, @NotNull CharSequence separator);

    @NotNull
    <E> ByteStringAppender append(@NotNull List<E> list, @NotNull CharSequence separator);
}
