package org.oasis_open.wemi.context.server.api.conditions;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Represents a condition parameter, that will be used in the segment building UI to either select parameters from a
 * choicelist or to enter a specific value.
 */
@XmlRootElement
public class Parameter {

    String id;
    String name;
    String description;
    String type;
    boolean multivalued = false;
    String choiceListInitializerClass;

    public Parameter() {
    }

    public Parameter(String id, String name, String description, String type, boolean multivalued, String choiceListInitializerClass) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.multivalued = multivalued;
        this.choiceListInitializerClass = choiceListInitializerClass;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public boolean isMultivalued() {
        return multivalued;
    }

    public String getChoiceListInitializerClass() {
        return choiceListInitializerClass;
    }
}
