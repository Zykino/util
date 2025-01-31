/*
Stream-Pi - Free & Open-Source Modular Cross-Platform Programmable Macro Pad
Copyright (C) 2019-2021  Debayan Sutradhar (rnayabed),  Samuel Quiñones (SamuelQuinones)

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

Originally Written by : Debayan Sutradhar (rnayabed)
*/

package com.stream_pi.util.combobox;

/**
 * Combo Box Listener. Triggered when an option in Combo Box is clicked.
 */
public abstract class StreamPiComboBoxListener<T>
{
    /**
     * @param oldSelectedItem Choice which was clicked before
     * @param selectedItem Choice which is clicked
     */
    public abstract void onNewItemSelected(T oldSelectedItem, T selectedItem);
}
