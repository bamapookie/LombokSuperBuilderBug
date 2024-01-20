package org.example.superbuilderbug;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class ChildWithAnnotation extends Parent<@ValidDouble Double>{
}
