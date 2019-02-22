package com.thehecklers.brpproc;

import lombok.Value;

import java.time.Instant;

@Value
public class Subscriber {
    private String id, firstName, lastName;
    private Instant subscribeDate;
}
