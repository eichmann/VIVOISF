package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionEditorIterator theLegalDecisionEditorIterator = (LegalDecisionEditorIterator)findAncestorWithClass(this, LegalDecisionEditorIterator.class);
			pageContext.getOut().print(theLegalDecisionEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for editor tag ");
		}
		return SKIP_BODY;
	}
}

