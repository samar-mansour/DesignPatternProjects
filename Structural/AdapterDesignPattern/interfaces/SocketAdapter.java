package com.samar.interfaces;

import com.samar.models.Volt;

public interface SocketAdapter {
    Volt get120Volts();
    Volt get12Volts();
    Volt get3Volts();
    Volt get1Volts();

}
