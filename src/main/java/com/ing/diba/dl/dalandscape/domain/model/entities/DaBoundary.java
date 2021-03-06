package com.ing.diba.dl.dalandscape.domain.model.entities;

import com.ing.diba.dl.dalandscape.domain.model.DaEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "daboundaries")
public class DaBoundary extends DaEntity {

  DaBoundary() {
    // empty constructor needed because this is unfortunately a JPA requirement
  }

  public DaBoundary(String key, String displayName) {
    super(key, displayName);
  }

  @Override
  public String toString() {
    return "DaBoundary{} " + super.toString();
  }
}
