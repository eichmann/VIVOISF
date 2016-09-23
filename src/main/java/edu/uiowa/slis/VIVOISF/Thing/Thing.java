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

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ThingIterator theThingIterator = (ThingIterator) findAncestorWithClass(this, ThingIterator.class);

			if (theThingIterator != null) {
				subjectURI = theThingIterator.getSubjectURI();
				label = theThingIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Person.PersonOrcidIdIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Person.PersonOrcidIdIterator)this.getParent()).getOrcidId();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Concept.ConceptIsDefinedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Concept.ConceptIsDefinedByIterator)this.getParent()).getIsDefinedBy();
			}

			edu.uiowa.slis.VIVOISF.Person.PersonOrcidIdIterator thePersonOrcidIdIterator = (edu.uiowa.slis.VIVOISF.Person.PersonOrcidIdIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Person.PersonOrcidIdIterator.class);

			if (subjectURI == null && thePersonOrcidIdIterator != null) {
				subjectURI = thePersonOrcidIdIterator.getOrcidId();
			}

			edu.uiowa.slis.VIVOISF.Concept.ConceptIsDefinedByIterator theConceptIsDefinedByIterator = (edu.uiowa.slis.VIVOISF.Concept.ConceptIsDefinedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Concept.ConceptIsDefinedByIterator.class);

			if (subjectURI == null && theConceptIsDefinedByIterator != null) {
				subjectURI = theConceptIsDefinedByIterator.getIsDefinedBy();
			}

			if (theThingIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
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
