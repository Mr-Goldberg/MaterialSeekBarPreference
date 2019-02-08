package com.pavelsikun.seekbarpreference;

/**
 * Created by Oleksandr Dovgusha on 08.02.19.
 *
 * Default implementation of formatter.
 */

class DefaultValueFormatter implements ValueFormatter
{
    public String format(int value)
    {
        return String.valueOf(value);
    }
}
