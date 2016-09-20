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

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Individual.IndividualHasEmailIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Individual.IndividualHasEmailIterator)this.getParent()).getHasEmail();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Geographical.GeographicalHasEmailIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Geographical.GeographicalHasEmailIterator)this.getParent()).getHasEmail();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Kind.KindHasEmailIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Kind.KindHasEmailIterator)this.getParent()).getHasEmail();
			}

			edu.uiowa.slis.VIVOISF.Individual.IndividualHasEmailIterator theIndividualHasEmailIterator = (edu.uiowa.slis.VIVOISF.Individual.IndividualHasEmailIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Individual.IndividualHasEmailIterator.class);

			if (subjectURI == null && theIndividualHasEmailIterator != null) {
				subjectURI = theIndividualHasEmailIterator.getHasEmail();
			}

			edu.uiowa.slis.VIVOISF.Geographical.GeographicalHasEmailIterator theGeographicalHasEmailIterator = (edu.uiowa.slis.VIVOISF.Geographical.GeographicalHasEmailIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Geographical.GeographicalHasEmailIterator.class);

			if (subjectURI == null && theGeographicalHasEmailIterator != null) {
				subjectURI = theGeographicalHasEmailIterator.getHasEmail();
			}

			edu.uiowa.slis.VIVOISF.Kind.KindHasEmailIterator theKindHasEmailIterator = (edu.uiowa.slis.VIVOISF.Kind.KindHasEmailIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Kind.KindHasEmailIterator.class);

			if (subjectURI == null && theKindHasEmailIterator != null) {
				subjectURI = theKindHasEmailIterator.getHasEmail();
			}

			if (theEmailIterator == null && subjectURI == null) {
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
