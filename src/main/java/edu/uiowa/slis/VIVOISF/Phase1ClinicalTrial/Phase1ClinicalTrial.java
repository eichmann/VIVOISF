package edu.uiowa.slis.VIVOISF.Phase1ClinicalTrial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Phase1ClinicalTrial extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase1ClinicalTrial currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase1ClinicalTrial.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Phase1ClinicalTrialIterator thePhase1ClinicalTrialIterator = (Phase1ClinicalTrialIterator) findAncestorWithClass(this, Phase1ClinicalTrialIterator.class);

			if (thePhase1ClinicalTrialIterator != null) {
				subjectURI = thePhase1ClinicalTrialIterator.getSubjectURI();
				label = thePhase1ClinicalTrialIterator.getLabel();
			}

			if (thePhase1ClinicalTrialIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(Prefix_1_4
				+ " SELECT ?label  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Phase1ClinicalTrial doStartTag", e);
			throw new JspTagException("Exception raised in Phase1ClinicalTrial doStartTag");
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
			log.error("Exception raised in Phase1ClinicalTrial doEndTag", e);
			throw new JspTagException("Exception raised in Phase1ClinicalTrial doEndTag");
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
