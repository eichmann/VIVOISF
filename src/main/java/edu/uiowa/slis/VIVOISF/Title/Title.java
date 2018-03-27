package edu.uiowa.slis.VIVOISF.Title;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Title extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Title currentInstance = null;
	private static final Log log = LogFactory.getLog(Title.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			TitleIterator theTitleIterator = (TitleIterator) findAncestorWithClass(this, TitleIterator.class);

			if (theTitleIterator != null) {
				subjectURI = theTitleIterator.getSubjectURI();
				label = theTitleIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379HasTitleIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379HasTitleIterator)this.getParent()).getHasTitle();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasTitleIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasTitleIterator)this.getParent()).getHasTitle();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasTitleIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasTitleIterator)this.getParent()).getHasTitle();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasTitleIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasTitleIterator)this.getParent()).getHasTitle();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasTitleIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasTitleIterator)this.getParent()).getHasTitle();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingHasTitleIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingHasTitleIterator)this.getParent()).getHasTitle();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Individual.IndividualHasTitleIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Individual.IndividualHasTitleIterator)this.getParent()).getHasTitle();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Kind.KindHasTitleIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Kind.KindHasTitleIterator)this.getParent()).getHasTitle();
			}

			edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379HasTitleIterator theARG_2000379HasTitleIterator = (edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379HasTitleIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379HasTitleIterator.class);

			if (subjectURI == null && theARG_2000379HasTitleIterator != null) {
				subjectURI = theARG_2000379HasTitleIterator.getHasTitle();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasTitleIterator theBFO_0000001HasTitleIterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasTitleIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasTitleIterator.class);

			if (subjectURI == null && theBFO_0000001HasTitleIterator != null) {
				subjectURI = theBFO_0000001HasTitleIterator.getHasTitle();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasTitleIterator theBFO_0000002HasTitleIterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasTitleIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasTitleIterator.class);

			if (subjectURI == null && theBFO_0000002HasTitleIterator != null) {
				subjectURI = theBFO_0000002HasTitleIterator.getHasTitle();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasTitleIterator theBFO_0000031HasTitleIterator = (edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasTitleIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasTitleIterator.class);

			if (subjectURI == null && theBFO_0000031HasTitleIterator != null) {
				subjectURI = theBFO_0000031HasTitleIterator.getHasTitle();
			}

			edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasTitleIterator theIAO_0000030HasTitleIterator = (edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasTitleIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasTitleIterator.class);

			if (subjectURI == null && theIAO_0000030HasTitleIterator != null) {
				subjectURI = theIAO_0000030HasTitleIterator.getHasTitle();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingHasTitleIterator theThingHasTitleIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingHasTitleIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingHasTitleIterator.class);

			if (subjectURI == null && theThingHasTitleIterator != null) {
				subjectURI = theThingHasTitleIterator.getHasTitle();
			}

			edu.uiowa.slis.VIVOISF.Individual.IndividualHasTitleIterator theIndividualHasTitleIterator = (edu.uiowa.slis.VIVOISF.Individual.IndividualHasTitleIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Individual.IndividualHasTitleIterator.class);

			if (subjectURI == null && theIndividualHasTitleIterator != null) {
				subjectURI = theIndividualHasTitleIterator.getHasTitle();
			}

			edu.uiowa.slis.VIVOISF.Kind.KindHasTitleIterator theKindHasTitleIterator = (edu.uiowa.slis.VIVOISF.Kind.KindHasTitleIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Kind.KindHasTitleIterator.class);

			if (subjectURI == null && theKindHasTitleIterator != null) {
				subjectURI = theKindHasTitleIterator.getHasTitle();
			}

			if (theTitleIterator == null && subjectURI == null) {
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
			log.error("Exception raised in Title doStartTag", e);
			throw new JspTagException("Exception raised in Title doStartTag");
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
			log.error("Exception raised in Title doEndTag", e);
			throw new JspTagException("Exception raised in Title doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSubjectURI(String theSubjectURI) {
		subjectURI = theSubjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String theLabel) {
		label = theLabel;
	}

	public String getLabel() {
		return label;
	}

}
