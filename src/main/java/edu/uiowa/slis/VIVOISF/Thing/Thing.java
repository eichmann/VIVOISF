package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Thing extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Thing currentInstance = null;
	private static final Log log = LogFactory.getLog(Thing.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ThingIterator theThingIterator = (ThingIterator) findAncestorWithClass(this, ThingIterator.class);

			if (theThingIterator != null) {
				subjectURI = theThingIterator.getSubjectURI();
				label = theThingIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.NegativePropertyAssertion.NegativePropertyAssertionSourceIndividualIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.NegativePropertyAssertion.NegativePropertyAssertionSourceIndividualIterator)this.getParent()).getSourceIndividual();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Person.PersonSameAsIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Person.PersonSameAsIterator)this.getParent()).getSameAs();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingDifferentFromIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingDifferentFromIterator)this.getParent()).getDifferentFrom();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.NegativePropertyAssertion.NegativePropertyAssertionTargetIndividualIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.NegativePropertyAssertion.NegativePropertyAssertionTargetIndividualIterator)this.getParent()).getTargetIndividual();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Person.PersonOrcidIdIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Person.PersonOrcidIdIterator)this.getParent()).getOrcidId();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingBottomObjectPropertyIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingBottomObjectPropertyIterator)this.getParent()).getBottomObjectProperty();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingTopObjectPropertyIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingTopObjectPropertyIterator)this.getParent()).getTopObjectProperty();
			}

			edu.uiowa.slis.VIVOISF.NegativePropertyAssertion.NegativePropertyAssertionSourceIndividualIterator theNegativePropertyAssertionSourceIndividualIterator = (edu.uiowa.slis.VIVOISF.NegativePropertyAssertion.NegativePropertyAssertionSourceIndividualIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.NegativePropertyAssertion.NegativePropertyAssertionSourceIndividualIterator.class);

			if (subjectURI == null && theNegativePropertyAssertionSourceIndividualIterator != null) {
				subjectURI = theNegativePropertyAssertionSourceIndividualIterator.getSourceIndividual();
			}

			edu.uiowa.slis.VIVOISF.Person.PersonSameAsIterator thePersonSameAsIterator = (edu.uiowa.slis.VIVOISF.Person.PersonSameAsIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Person.PersonSameAsIterator.class);

			if (subjectURI == null && thePersonSameAsIterator != null) {
				subjectURI = thePersonSameAsIterator.getSameAs();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingDifferentFromIterator theThingDifferentFromIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingDifferentFromIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingDifferentFromIterator.class);

			if (subjectURI == null && theThingDifferentFromIterator != null) {
				subjectURI = theThingDifferentFromIterator.getDifferentFrom();
			}

			edu.uiowa.slis.VIVOISF.NegativePropertyAssertion.NegativePropertyAssertionTargetIndividualIterator theNegativePropertyAssertionTargetIndividualIterator = (edu.uiowa.slis.VIVOISF.NegativePropertyAssertion.NegativePropertyAssertionTargetIndividualIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.NegativePropertyAssertion.NegativePropertyAssertionTargetIndividualIterator.class);

			if (subjectURI == null && theNegativePropertyAssertionTargetIndividualIterator != null) {
				subjectURI = theNegativePropertyAssertionTargetIndividualIterator.getTargetIndividual();
			}

			edu.uiowa.slis.VIVOISF.Person.PersonOrcidIdIterator thePersonOrcidIdIterator = (edu.uiowa.slis.VIVOISF.Person.PersonOrcidIdIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Person.PersonOrcidIdIterator.class);

			if (subjectURI == null && thePersonOrcidIdIterator != null) {
				subjectURI = thePersonOrcidIdIterator.getOrcidId();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingBottomObjectPropertyIterator theThingBottomObjectPropertyIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingBottomObjectPropertyIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingBottomObjectPropertyIterator.class);

			if (subjectURI == null && theThingBottomObjectPropertyIterator != null) {
				subjectURI = theThingBottomObjectPropertyIterator.getBottomObjectProperty();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingTopObjectPropertyIterator theThingTopObjectPropertyIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingTopObjectPropertyIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingTopObjectPropertyIterator.class);

			if (subjectURI == null && theThingTopObjectPropertyIterator != null) {
				subjectURI = theThingTopObjectPropertyIterator.getTopObjectProperty();
			}

			if (theThingIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label ?foafName ?schemaName ?rdfValue  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?schemaName") == null ? null : sol.get("?schemaName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Thing doStartTag", e);
			throw new JspTagException("Exception raised in Thing doStartTag");
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
			log.error("Exception raised in Thing doEndTag", e);
			throw new JspTagException("Exception raised in Thing doEndTag");
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
