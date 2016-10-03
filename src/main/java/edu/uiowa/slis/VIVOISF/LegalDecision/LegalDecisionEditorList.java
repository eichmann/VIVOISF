package edu.uiowa.slis.VIVOISF.LegalDecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDecisionEditorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDecisionEditorList currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDecisionEditorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDecisionEditorListIterator theLegalDecisionEditorListIterator = (LegalDecisionEditorListIterator)findAncestorWithClass(this, LegalDecisionEditorListIterator.class);
			pageContext.getOut().print(theLegalDecisionEditorListIterator.getEditorList());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDecision for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDecision for editorList tag ");
		}
		return SKIP_BODY;
	}
}
