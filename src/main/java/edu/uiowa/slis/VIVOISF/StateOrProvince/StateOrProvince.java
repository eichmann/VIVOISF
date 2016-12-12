package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class StateOrProvince extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvince currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvince.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			StateOrProvinceIterator theStateOrProvinceIterator = (StateOrProvinceIterator) findAncestorWithClass(this, StateOrProvinceIterator.class);

			if (theStateOrProvinceIterator != null) {
				subjectURI = theStateOrProvinceIterator.getSubjectURI();
				label = theStateOrProvinceIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Area.AreaBFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Area.AreaBFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Self_governing.Self_governingBFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Self_governing.Self_governingBFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Territory.TerritoryBFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Territory.TerritoryBFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001BFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001BFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002BFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002BFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004BFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004BFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006BFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006BFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141BFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141BFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Country.CountryBFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Country.CountryBFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationBFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationBFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionBFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionBFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityBFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityBFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Location.LocationBFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Location.LocationBFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingBFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingBFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.Area.AreaBFO_0000051Iterator theAreaBFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.Area.AreaBFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Area.AreaBFO_0000051Iterator.class);

			if (subjectURI == null && theAreaBFO_0000051Iterator != null) {
				subjectURI = theAreaBFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.Self_governing.Self_governingBFO_0000051Iterator theSelf_governingBFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.Self_governing.Self_governingBFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Self_governing.Self_governingBFO_0000051Iterator.class);

			if (subjectURI == null && theSelf_governingBFO_0000051Iterator != null) {
				subjectURI = theSelf_governingBFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.Territory.TerritoryBFO_0000051Iterator theTerritoryBFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.Territory.TerritoryBFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Territory.TerritoryBFO_0000051Iterator.class);

			if (subjectURI == null && theTerritoryBFO_0000051Iterator != null) {
				subjectURI = theTerritoryBFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001BFO_0000051Iterator theBFO_0000001BFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001BFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001BFO_0000051Iterator.class);

			if (subjectURI == null && theBFO_0000001BFO_0000051Iterator != null) {
				subjectURI = theBFO_0000001BFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002BFO_0000051Iterator theBFO_0000002BFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002BFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002BFO_0000051Iterator.class);

			if (subjectURI == null && theBFO_0000002BFO_0000051Iterator != null) {
				subjectURI = theBFO_0000002BFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004BFO_0000051Iterator theBFO_0000004BFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004BFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004BFO_0000051Iterator.class);

			if (subjectURI == null && theBFO_0000004BFO_0000051Iterator != null) {
				subjectURI = theBFO_0000004BFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006BFO_0000051Iterator theBFO_0000006BFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006BFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006BFO_0000051Iterator.class);

			if (subjectURI == null && theBFO_0000006BFO_0000051Iterator != null) {
				subjectURI = theBFO_0000006BFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141BFO_0000051Iterator theBFO_0000141BFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141BFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141BFO_0000051Iterator.class);

			if (subjectURI == null && theBFO_0000141BFO_0000051Iterator != null) {
				subjectURI = theBFO_0000141BFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.Country.CountryBFO_0000051Iterator theCountryBFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.Country.CountryBFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Country.CountryBFO_0000051Iterator.class);

			if (subjectURI == null && theCountryBFO_0000051Iterator != null) {
				subjectURI = theCountryBFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationBFO_0000051Iterator theGeographicLocationBFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationBFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationBFO_0000051Iterator.class);

			if (subjectURI == null && theGeographicLocationBFO_0000051Iterator != null) {
				subjectURI = theGeographicLocationBFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionBFO_0000051Iterator theGeographicRegionBFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionBFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionBFO_0000051Iterator.class);

			if (subjectURI == null && theGeographicRegionBFO_0000051Iterator != null) {
				subjectURI = theGeographicRegionBFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityBFO_0000051Iterator theGeopoliticalEntityBFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityBFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityBFO_0000051Iterator.class);

			if (subjectURI == null && theGeopoliticalEntityBFO_0000051Iterator != null) {
				subjectURI = theGeopoliticalEntityBFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.Location.LocationBFO_0000051Iterator theLocationBFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.Location.LocationBFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Location.LocationBFO_0000051Iterator.class);

			if (subjectURI == null && theLocationBFO_0000051Iterator != null) {
				subjectURI = theLocationBFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingBFO_0000051Iterator theThingBFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.Thing.ThingBFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingBFO_0000051Iterator.class);

			if (subjectURI == null && theThingBFO_0000051Iterator != null) {
				subjectURI = theThingBFO_0000051Iterator.getBFO_0000051();
			}

			if (theStateOrProvinceIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?labelUS ?labelENG ?label ?labelANY ?foafName ?schemaName ?rdfValue  where {"
				+ "  OPTIONAL { SELECT ?labelUS  WHERE { <" + subjectURI + "> rdfs:label ?labelUS  FILTER (lang(?labelUS) = \"en-US\")}    LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelENG WHERE { <" + subjectURI + "> rdfs:label ?labelENG FILTER (langMatches(?labelENG,\"en\"))} LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?label    WHERE { <" + subjectURI + "> rdfs:label ?label    FILTER (lang(?label) = \"\")}           LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelANY WHERE { <" + subjectURI + "> rdfs:label ?labelANY FILTER (lang(?labelANY) != \"\")}       LIMIT 1 } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?labelUS") == null ? null : sol.get("?labelUS").asLiteral().getString();
					if (label == null)
						label = sol.get("?labelENG") == null ? null : sol.get("?labelENG").asLiteral().getString();
					if (label == null)
						label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?labelANY") == null ? null : sol.get("?labelANY").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?schemaName") == null ? null : sol.get("?schemaName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in StateOrProvince doStartTag", e);
			throw new JspTagException("Exception raised in StateOrProvince doStartTag");
		} finally {
			freeConnection();
		}

		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in StateOrProvince doEndTag", e);
			throw new JspTagException("Exception raised in StateOrProvince doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSubjectURI(String subjectURI) {
		this.subjectURI = subjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
