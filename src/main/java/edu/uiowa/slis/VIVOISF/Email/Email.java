package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Email extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Email currentInstance = null;
	private static final Log log = LogFactory.getLog(Email.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			EmailIterator theEmailIterator = (EmailIterator) findAncestorWithClass(this, EmailIterator.class);

			if (theEmailIterator != null) {
				subjectURI = theEmailIterator.getSubjectURI();
				label = theEmailIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379HasEmailIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379HasEmailIterator)this.getParent()).getHasEmail();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasEmailIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasEmailIterator)this.getParent()).getHasEmail();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasEmailIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasEmailIterator)this.getParent()).getHasEmail();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasEmailIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasEmailIterator)this.getParent()).getHasEmail();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasEmailIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasEmailIterator)this.getParent()).getHasEmail();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingHasEmailIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingHasEmailIterator)this.getParent()).getHasEmail();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Kind.KindHasEmailIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Kind.KindHasEmailIterator)this.getParent()).getHasEmail();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Individual.IndividualHasEmailIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Individual.IndividualHasEmailIterator)this.getParent()).getHasEmail();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Addressing.AddressingHasEmailIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Addressing.AddressingHasEmailIterator)this.getParent()).getHasEmail();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Communication.CommunicationHasEmailIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Communication.CommunicationHasEmailIterator)this.getParent()).getHasEmail();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Explanatory.ExplanatoryHasEmailIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Explanatory.ExplanatoryHasEmailIterator)this.getParent()).getHasEmail();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Geographical.GeographicalHasEmailIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Geographical.GeographicalHasEmailIterator)this.getParent()).getHasEmail();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Identification.IdentificationHasEmailIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Identification.IdentificationHasEmailIterator)this.getParent()).getHasEmail();
			}

			edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379HasEmailIterator theARG_2000379HasEmailIterator = (edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379HasEmailIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379HasEmailIterator.class);

			if (subjectURI == null && theARG_2000379HasEmailIterator != null) {
				subjectURI = theARG_2000379HasEmailIterator.getHasEmail();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasEmailIterator theBFO_0000001HasEmailIterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasEmailIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasEmailIterator.class);

			if (subjectURI == null && theBFO_0000001HasEmailIterator != null) {
				subjectURI = theBFO_0000001HasEmailIterator.getHasEmail();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasEmailIterator theBFO_0000002HasEmailIterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasEmailIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasEmailIterator.class);

			if (subjectURI == null && theBFO_0000002HasEmailIterator != null) {
				subjectURI = theBFO_0000002HasEmailIterator.getHasEmail();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasEmailIterator theBFO_0000031HasEmailIterator = (edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasEmailIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasEmailIterator.class);

			if (subjectURI == null && theBFO_0000031HasEmailIterator != null) {
				subjectURI = theBFO_0000031HasEmailIterator.getHasEmail();
			}

			edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasEmailIterator theIAO_0000030HasEmailIterator = (edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasEmailIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasEmailIterator.class);

			if (subjectURI == null && theIAO_0000030HasEmailIterator != null) {
				subjectURI = theIAO_0000030HasEmailIterator.getHasEmail();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingHasEmailIterator theThingHasEmailIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingHasEmailIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingHasEmailIterator.class);

			if (subjectURI == null && theThingHasEmailIterator != null) {
				subjectURI = theThingHasEmailIterator.getHasEmail();
			}

			edu.uiowa.slis.VIVOISF.Kind.KindHasEmailIterator theKindHasEmailIterator = (edu.uiowa.slis.VIVOISF.Kind.KindHasEmailIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Kind.KindHasEmailIterator.class);

			if (subjectURI == null && theKindHasEmailIterator != null) {
				subjectURI = theKindHasEmailIterator.getHasEmail();
			}

			edu.uiowa.slis.VIVOISF.Individual.IndividualHasEmailIterator theIndividualHasEmailIterator = (edu.uiowa.slis.VIVOISF.Individual.IndividualHasEmailIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Individual.IndividualHasEmailIterator.class);

			if (subjectURI == null && theIndividualHasEmailIterator != null) {
				subjectURI = theIndividualHasEmailIterator.getHasEmail();
			}

			edu.uiowa.slis.VIVOISF.Addressing.AddressingHasEmailIterator theAddressingHasEmailIterator = (edu.uiowa.slis.VIVOISF.Addressing.AddressingHasEmailIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Addressing.AddressingHasEmailIterator.class);

			if (subjectURI == null && theAddressingHasEmailIterator != null) {
				subjectURI = theAddressingHasEmailIterator.getHasEmail();
			}

			edu.uiowa.slis.VIVOISF.Communication.CommunicationHasEmailIterator theCommunicationHasEmailIterator = (edu.uiowa.slis.VIVOISF.Communication.CommunicationHasEmailIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Communication.CommunicationHasEmailIterator.class);

			if (subjectURI == null && theCommunicationHasEmailIterator != null) {
				subjectURI = theCommunicationHasEmailIterator.getHasEmail();
			}

			edu.uiowa.slis.VIVOISF.Explanatory.ExplanatoryHasEmailIterator theExplanatoryHasEmailIterator = (edu.uiowa.slis.VIVOISF.Explanatory.ExplanatoryHasEmailIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Explanatory.ExplanatoryHasEmailIterator.class);

			if (subjectURI == null && theExplanatoryHasEmailIterator != null) {
				subjectURI = theExplanatoryHasEmailIterator.getHasEmail();
			}

			edu.uiowa.slis.VIVOISF.Geographical.GeographicalHasEmailIterator theGeographicalHasEmailIterator = (edu.uiowa.slis.VIVOISF.Geographical.GeographicalHasEmailIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Geographical.GeographicalHasEmailIterator.class);

			if (subjectURI == null && theGeographicalHasEmailIterator != null) {
				subjectURI = theGeographicalHasEmailIterator.getHasEmail();
			}

			edu.uiowa.slis.VIVOISF.Identification.IdentificationHasEmailIterator theIdentificationHasEmailIterator = (edu.uiowa.slis.VIVOISF.Identification.IdentificationHasEmailIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Identification.IdentificationHasEmailIterator.class);

			if (subjectURI == null && theIdentificationHasEmailIterator != null) {
				subjectURI = theIdentificationHasEmailIterator.getHasEmail();
			}

			if (theEmailIterator == null && subjectURI == null) {
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
			log.error("Exception raised in Email doStartTag", e);
			throw new JspTagException("Exception raised in Email doStartTag");
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
			log.error("Exception raised in Email doEndTag", e);
			throw new JspTagException("Exception raised in Email doEndTag");
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
