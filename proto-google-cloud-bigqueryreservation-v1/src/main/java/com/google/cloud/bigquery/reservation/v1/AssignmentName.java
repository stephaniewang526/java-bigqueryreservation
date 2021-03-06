/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.bigquery.reservation.v1;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** AUTO-GENERATED DOCUMENTATION AND CLASS */
@javax.annotation.Generated("by GAPIC protoc plugin")
public class AssignmentName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/reservations/{reservation}/assignments/{assignment}");

  private volatile Map<String, String> fieldValuesMap;

  private final String project;
  private final String location;
  private final String reservation;
  private final String assignment;

  public String getProject() {
    return project;
  }

  public String getLocation() {
    return location;
  }

  public String getReservation() {
    return reservation;
  }

  public String getAssignment() {
    return assignment;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private AssignmentName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    reservation = Preconditions.checkNotNull(builder.getReservation());
    assignment = Preconditions.checkNotNull(builder.getAssignment());
  }

  public static AssignmentName of(
      String project, String location, String reservation, String assignment) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setReservation(reservation)
        .setAssignment(assignment)
        .build();
  }

  public static String format(
      String project, String location, String reservation, String assignment) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setReservation(reservation)
        .setAssignment(assignment)
        .build()
        .toString();
  }

  public static AssignmentName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(
            formattedString, "AssignmentName.parse: formattedString not in valid format");
    return of(
        matchMap.get("project"),
        matchMap.get("location"),
        matchMap.get("reservation"),
        matchMap.get("assignment"));
  }

  public static List<AssignmentName> parseList(List<String> formattedStrings) {
    List<AssignmentName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<AssignmentName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (AssignmentName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("project", project);
          fieldMapBuilder.put("location", location);
          fieldMapBuilder.put("reservation", reservation);
          fieldMapBuilder.put("assignment", assignment);
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate(
        "project",
        project,
        "location",
        location,
        "reservation",
        reservation,
        "assignment",
        assignment);
  }

  /** Builder for AssignmentName. */
  public static class Builder {

    private String project;
    private String location;
    private String reservation;
    private String assignment;

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getReservation() {
      return reservation;
    }

    public String getAssignment() {
      return assignment;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    public Builder setReservation(String reservation) {
      this.reservation = reservation;
      return this;
    }

    public Builder setAssignment(String assignment) {
      this.assignment = assignment;
      return this;
    }

    private Builder() {}

    private Builder(AssignmentName assignmentName) {
      project = assignmentName.project;
      location = assignmentName.location;
      reservation = assignmentName.reservation;
      assignment = assignmentName.assignment;
    }

    public AssignmentName build() {
      return new AssignmentName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AssignmentName) {
      AssignmentName that = (AssignmentName) o;
      return (this.project.equals(that.project))
          && (this.location.equals(that.location))
          && (this.reservation.equals(that.reservation))
          && (this.assignment.equals(that.assignment));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= project.hashCode();
    h *= 1000003;
    h ^= location.hashCode();
    h *= 1000003;
    h ^= reservation.hashCode();
    h *= 1000003;
    h ^= assignment.hashCode();
    return h;
  }
}
