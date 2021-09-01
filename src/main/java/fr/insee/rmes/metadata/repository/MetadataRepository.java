package fr.insee.rmes.metadata.repository;

import java.util.List;
import java.util.Map;

import fr.insee.rmes.metadata.model.ColecticaItem;
import fr.insee.rmes.metadata.model.ColecticaItemPostRef;
import fr.insee.rmes.metadata.model.ColecticaItemPostRefList;
import fr.insee.rmes.metadata.model.ColecticaItemRefList;
import fr.insee.rmes.metadata.model.ColecticaSearchItemRequest;
import fr.insee.rmes.metadata.model.ColecticaSearchItemResponse;
import fr.insee.rmes.metadata.model.ColecticaSearchSetRequest;
import fr.insee.rmes.metadata.model.Relationship;
import fr.insee.rmes.metadata.model.ObjectColecticaPost;
import fr.insee.rmes.metadata.model.Unit;

public interface MetadataRepository {

	ColecticaItem findById(String id) throws Exception;

	ColecticaItemRefList getChildrenRef(String id) throws Exception;
	
	ColecticaSearchItemResponse searchItems(ColecticaSearchItemRequest req) throws Exception;

	List<ColecticaItem> getItems(ColecticaItemRefList refs) throws Exception;

	Map<ColecticaItemPostRef, String> postNewItems(ColecticaItemPostRefList refs) throws Exception;

	Map<ColecticaItemPostRef, String> postNewItem(ColecticaItemPostRef ref) throws Exception;

	Map<ColecticaItemPostRef, String> postUpdateItems(ColecticaItemPostRefList refs) throws Exception;

	Integer getLastestVersionItem(String id) throws Exception;

	Relationship[] getRelationship(ObjectColecticaPost relationshipPost) throws Exception;

	List<Unit> getUnits() throws Exception;

	Relationship[] getRelationshipChildren(ObjectColecticaPost relationshipPost) throws Exception;
	
	Relationship[] searchSets(ColecticaSearchSetRequest setBody) throws Exception;
}
