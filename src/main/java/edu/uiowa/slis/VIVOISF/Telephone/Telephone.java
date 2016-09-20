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

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Individual.IndividualHasTelephoneIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Individual.IndividualHasTelephoneIterator)this.getParent()).getHasTelephone();
			}

			edu.uiowa.slis.VIVOISF.Individual.IndividualHasTelephoneIterator theIndividualHasTelephoneIterator = (edu.uiowa.slis.VIVOISF.Individual.IndividualHasTelephoneIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Individual.IndividualHasTelephoneIterator.class);

			if (subjectURI == null && theIndividualHasTelephoneIterator != null) {
				subjectURI = theIndividualHasTelephoneIterator.getHasTelephone();
			}

			if (theTelephoneIterator == null && subjectURI == null) {
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
