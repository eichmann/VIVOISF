package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionEditorListIterator theLegalDecisionEditorListIterator = (LegalDecisionEditorListIterator)findAncestorWithClass(this, LegalDecisionEditorListIterator.class);
			pageContext.getOut().print(theLegalDecisionEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for editorList tag ");
		}
		return SKIP_BODY;
	}
}

