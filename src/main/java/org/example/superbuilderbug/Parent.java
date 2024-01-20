package org.example.superbuilderbug;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class Parent<T extends Comparable<T>> {
  private T value;
}
