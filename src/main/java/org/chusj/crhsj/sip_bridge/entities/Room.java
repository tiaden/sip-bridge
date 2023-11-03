package org.chusj.crhsj.sip_bridge.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Room {
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  @JsonIgnore
  private long id;
  private int displayNumber;
  private String label;

  private int extension;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getDisplayNumber() {
    return displayNumber;
  }

  public void setDisplayNumber(int displayNumber) {
    this.displayNumber = displayNumber;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public int getExtension() {
    return extension;
  }

  public void setExtension(int extension) {
    this.extension = extension;
  }
}
