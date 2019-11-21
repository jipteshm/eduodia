package com.iodia.eduodia.util;

import java.util.UUID;

public class UUIDUtil
{
    public static String generateUUID()
    {
        UUID randomUUID = UUID.randomUUID();
        return randomUUID.toString();
    }

    public int getClockBasedNumber(String uuidInput)
    {
        UUID uuid = UUID.fromString(uuidInput);
        return uuid.clockSequence();
    }
}
