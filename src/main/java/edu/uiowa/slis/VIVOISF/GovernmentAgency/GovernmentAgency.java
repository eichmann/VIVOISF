package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class GovernmentAgency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgency currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgency.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

	String abbreviation = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			GovernmentAgencyIterator theGovernmentAgencyIterator = (GovernmentAgencyIterator) findAncestorWithClass(this, GovernmentAgencyIterator.class);

			if (theGovernmentAgencyIterator != null) {
				subjectURI = theGovernmentAgencyIterator.getSubjectURI();
				label = theGovernmentAgencyIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator)this.getParent()).getARG_2000029();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Position.PositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Position.PositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionRelatesIterator)this.getParent()).getRelates();
			}

			edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator theARG_2000379ARG_2000029Iterator = (edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator.class);

			if (subjectURI == null && theARG_2000379ARG_2000029Iterator != null) {
				subjectURI = theARG_2000379ARG_2000029Iterator.getARG_2000029();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatesIterator theBFO_0000001RelatesIterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatesIterator.class);

			if (subjectURI == null && theBFO_0000001RelatesIterator != null) {
				subjectURI = theBFO_0000001RelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatesIterator theBFO_0000002RelatesIterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatesIterator.class);

			if (subjectURI == null && theBFO_0000002RelatesIterator != null) {
				subjectURI = theBFO_0000002RelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingRelatesIterator theThingRelatesIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingRelatesIterator.class);

			if (subjectURI == null && theThingRelatesIterator != null) {
				subjectURI = theThingRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatesIterator theBFO_0000020RelatesIterator = (edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatesIterator.class);

			if (subjectURI == null && theBFO_0000020RelatesIterator != null) {
				subjectURI = theBFO_0000020RelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatesIterator theRelationshipRelatesIterator = (edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatesIterator.class);

			if (subjectURI == null && theRelationshipRelatesIterator != null) {
				subjectURI = theRelationshipRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Position.PositionRelatesIterator thePositionRelatesIterator = (edu.uiowa.slis.VIVOISF.Position.PositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Position.PositionRelatesIterator.class);

			if (subjectURI == null && thePositionRelatesIterator != null) {
				subjectURI = thePositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionRelatesIterator theLibrarianPositionRelatesIterator = (edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionRelatesIterator.class);

			if (subjectURI == null && theLibrarianPositionRelatesIterator != null) {
				subjectURI = theLibrarianPositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionRelatesIterator theFacultyPositionRelatesIterator = (edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionRelatesIterator.class);

			if (subjectURI == null && theFacultyPositionRelatesIterator != null) {
				subjectURI = theFacultyPositionRelatesIterator.getRelates();
			}

			if (theGovernmentAgencyIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?labelUS ?labelENG ?label ?labelANY ?foafName ?schemaName ?rdfValue  ?Abbreviation where {"
				+ "  OPTIONAL { SELECT ?labelUS  WHERE { <" + subjectURI + "> rdfs:label ?labelUS  FILTER (lang(?labelUS) = \"en-US\")}    LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelENG WHERE { <" + subjectURI + "> rdfs:label ?labelENG FILTER (langMatches(?labelENG,\"en\"))} LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?label    WHERE { <" + subjectURI + "> rdfs:label ?label    FILTER (lang(?label) = \"\")}           LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelANY WHERE { <" + subjectURI + "> rdfs:label ?labelANY FILTER (lang(?labelANY) != \"\")}       LIMIT 1 } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#abbreviation> ?Abbreviation } "
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
					abbreviation = sol.get("?Abbreviation") == null ? null : sol.get("?Abbreviation").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in GovernmentAgency doStartTag", e);
			throw new JspTagException("Exception raised in GovernmentAgency doStartTag");
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
			log.error("Exception raised in GovernmentAgency doEndTag", e);
			throw new JspTagException("Exception raised in GovernmentAgency doEndTag");
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

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

}
