package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			LegalDecision theLegalDecision = (LegalDecision)findAncestorWithClass(this, LegalDecision.class);
			if (!theLegalDecision.commitNeeded) {
				pageContext.getOut().print(theLegalDecision.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			LegalDecision theLegalDecision = (LegalDecision)findAncestorWithClass(this, LegalDecision.class);
			return theLegalDecision.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing LegalDecision for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			LegalDecision theLegalDecision = (LegalDecision)findAncestorWithClass(this, LegalDecision.class);
			theLegalDecision.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for subjectURI tag ");
		}
	}
}

