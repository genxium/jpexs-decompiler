/*
 *  Copyright (C) 2010-2014 JPEXS, All rights reserved.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.
package com.jpexs.helpers.sound;

import java.io.InputStream;

/**
 *
 * @author JPEXS
 */
public abstract class SoundPlayer {

    protected InputStream is;

    protected SoundPlayer(InputStream is) {
        this.is = is;
    }

    public abstract long samplesCount();

    public abstract long getSamplePosition();

    public abstract void play();

    public abstract void stop();

    public abstract void skip(long samples);

    public abstract boolean isPlaying();

    public abstract long getFrameRate();

}