package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			LegalDecision theLegalDecision = (LegalDecision)findAncestorWithClass(this, LegalDecision.class);
			if (!theLegalDecision.commitNeeded) {
				pageContext.getOut().print(theLegalDecision.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			LegalDecision theLegalDecision = (LegalDecision)findAncestorWithClass(this, LegalDecision.class);
			return theLegalDecision.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing LegalDecision for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			LegalDecision theLegalDecision = (LegalDecision)findAncestorWithClass(this, LegalDecision.class);
			theLegalDecision.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for label tag ");
		}
	}
}

