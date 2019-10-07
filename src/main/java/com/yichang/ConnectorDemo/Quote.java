package com.yichang.ConnectorDemo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Quote {
  private String type;
  private Value  value;

}
