package edu.uiowa.slis.VIVOISF.AwardReceipt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class AwardReceipt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AwardReceipt currentInstance = null;
	private static final Log log = LogFactory.getLog(AwardReceipt.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			AwardReceiptIterator theAwardReceiptIterator = (AwardReceiptIterator) findAncestorWithClass(this, AwardReceiptIterator.class);

			if (theAwardReceiptIterator != null) {
				subjectURI = theAwardReceiptIterator.getSubjectURI();
				label = theAwardReceiptIterator.getLabel();
			}

			if (theAwardReceiptIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(Prefix_1_4
				+ " SELECT ?label  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in AwardReceipt doStartTag", e);
			throw new JspTagException("Exception raised in AwardReceipt doStartTag");
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
			log.error("Exception raised in AwardReceipt doEndTag", e);
			throw new JspTagException("Exception raised in AwardReceipt doEndTag");
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
