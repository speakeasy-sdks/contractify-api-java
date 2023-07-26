/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Contractify.ContractifyAPI.models.shared;

import Contractify.ContractifyAPI.utils.DateTimeDeserializer;
import Contractify.ContractifyAPI.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.LocalDate;
import java.time.OffsetDateTime;


public class ContractRead {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contract_types")
    public ContractTypeRead[] contractTypes;

    public ContractRead withContractTypes(ContractTypeRead[] contractTypes) {
        this.contractTypes = contractTypes;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;

    public ContractRead withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_field_values")
    public CustomFieldValueRead[] customFieldValues;

    public ContractRead withCustomFieldValues(CustomFieldValueRead[] customFieldValues) {
        this.customFieldValues = customFieldValues;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("departments")
    public DepartmentRead[] departments;

    public ContractRead withDepartments(DepartmentRead[] departments) {
        this.departments = departments;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("documents")
    public ContractDocumentRead[] documents;

    public ContractRead withDocuments(ContractDocumentRead[] documents) {
        this.documents = documents;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dossier")
    public DossierRead dossier;

    public ContractRead withDossier(DossierRead dossier) {
        this.dossier = dossier;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration")
    public String duration;

    public ContractRead withDuration(String duration) {
        this.duration = duration;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("end_date")
    public LocalDate endDate;

    public ContractRead withEndDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public Long id;

    public ContractRead withId(Long id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_open_ended")
    public Boolean isOpenEnded;

    public ContractRead withIsOpenEnded(Boolean isOpenEnded) {
        this.isOpenEnded = isOpenEnded;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("legal_entities")
    public LegalEntityRead[] legalEntities;

    public ContractRead withLegalEntities(LegalEntityRead[] legalEntities) {
        this.legalEntities = legalEntities;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;

    public ContractRead withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("offices")
    public OfficeRead[] offices;

    public ContractRead withOffices(OfficeRead[] offices) {
        this.offices = offices;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("owner_id")
    public Long ownerId;

    public ContractRead withOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("permalink")
    public String permalink;

    public ContractRead withPermalink(String permalink) {
        this.permalink = permalink;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phase")
    public ContractPhase phase;

    public ContractRead withPhase(ContractPhase phase) {
        this.phase = phase;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relations")
    public RelationRead[] relations;

    public ContractRead withRelations(RelationRead[] relations) {
        this.relations = relations;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("renewal")
    public ContractRenewal renewal;

    public ContractRead withRenewal(ContractRenewal renewal) {
        this.renewal = renewal;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("start_date")
    public LocalDate startDate;

    public ContractRead withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("termination")
    public ContractTermination termination;

    public ContractRead withTermination(ContractTermination termination) {
        this.termination = termination;
        return this;
    }
    
    public ContractRead(){}
}
