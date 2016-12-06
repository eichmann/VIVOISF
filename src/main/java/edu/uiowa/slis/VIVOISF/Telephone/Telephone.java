package edu.uiowa.slis.VIVOISF.Telephone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Telephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Telephone currentInstance = null;
	private static final Log log = LogFactory.getLog(Telephone.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			TelephoneIterator theTelephoneIterator = (TelephoneIterator) findAncestorWithClass(this, TelephoneIterator.class);

			if (theTelephoneIterator != null) {
				subjectURI = theTelephoneIterator.getSubjectURI();
				label = theTelephoneIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379HasTelephoneIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379HasTelephoneIterator)this.getParent()).getHasTelephone();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasTelephoneIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasTelephoneIterator)this.getParent()).getHasTelephone();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasTelephoneIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasTelephoneIterator)this.getParent()).getHasTelephone();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasTelephoneIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasTelephoneIterator)this.getParent()).getHasTelephone();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasTelephoneIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasTelephoneIterator)this.getParent()).getHasTelephone();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingHasTelephoneIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingHasTelephoneIterator)this.getParent()).getHasTelephone();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Individual.IndividualHasTelephoneIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Individual.IndividualHasTelephoneIterator)this.getParent()).getHasTelephone();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Kind.KindHasTelephoneIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Kind.KindHasTelephoneIterator)this.getParent()).getHasTelephone();
			}

			edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379HasTelephoneIterator theARG_2000379HasTelephoneIterator = (edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379HasTelephoneIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379HasTelephoneIterator.class);

			if (subjectURI == null && theARG_2000379HasTelephoneIterator != null) {
				subjectURI = theARG_2000379HasTelephoneIterator.getHasTelephone();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasTelephoneIterator theBFO_0000001HasTelephoneIterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasTelephoneIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasTelephoneIterator.class);

			if (subjectURI == null && theBFO_0000001HasTelephoneIterator != null) {
				subjectURI = theBFO_0000001HasTelephoneIterator.getHasTelephone();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasTelephoneIterator theBFO_0000002HasTelephoneIterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasTelephoneIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasTelephoneIterator.class);

			if (subjectURI == null && theBFO_0000002HasTelephoneIterator != null) {
				subjectURI = theBFO_0000002HasTelephoneIterator.getHasTelephone();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasTelephoneIterator theBFO_0000031HasTelephoneIterator = (edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasTelephoneIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasTelephoneIterator.class);

			if (subjectURI == null && theBFO_0000031HasTelephoneIterator != null) {
				subjectURI = theBFO_0000031HasTelephoneIterator.getHasTelephone();
			}

			edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasTelephoneIterator theIAO_0000030HasTelephoneIterator = (edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasTelephoneIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasTelephoneIterator.class);

			if (subjectURI == null && theIAO_0000030HasTelephoneIterator != null) {
				subjectURI = theIAO_0000030HasTelephoneIterator.getHasTelephone();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingHasTelephoneIterator theThingHasTelephoneIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingHasTelephoneIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingHasTelephoneIterator.class);

			if (subjectURI == null && theThingHasTelephoneIterator != null) {
				subjectURI = theThingHasTelephoneIterator.getHasTelephone();
			}

			edu.uiowa.slis.VIVOISF.Individual.IndividualHasTelephoneIterator theIndividualHasTelephoneIterator = (edu.uiowa.slis.VIVOISF.Individual.IndividualHasTelephoneIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Individual.IndividualHasTelephoneIterator.class);

			if (subjectURI == null && theIndividualHasTelephoneIterator != null) {
				subjectURI = theIndividualHasTelephoneIterator.getHasTelephone();
			}

			edu.uiowa.slis.VIVOISF.Kind.KindHasTelephoneIterator theKindHasTelephoneIterator = (edu.uiowa.slis.VIVOISF.Kind.KindHasTelephoneIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Kind.KindHasTelephoneIterator.class);

			if (subjectURI == null && theKindHasTelephoneIterator != null) {
				subjectURI = theKindHasTelephoneIterator.getHasTelephone();
			}

			if (theTelephoneIterator == null && subjectURI == null) {
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
			log.error("Exception raised in Telephone doStartTag", e);
			throw new JspTagException("Exception raised in Telephone doStartTag");
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
			log.error("Exception raised in Telephone doEndTag", e);
			throw new JspTagException("Exception raised in Telephone doEndTag");
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
