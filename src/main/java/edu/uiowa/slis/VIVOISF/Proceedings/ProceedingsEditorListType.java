package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsEditorListIterator theProceedingsEditorListIterator = (ProceedingsEditorListIterator)findAncestorWithClass(this, ProceedingsEditorListIterator.class);
			pageContext.getOut().print(theProceedingsEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for editorList tag ");
		}
		return SKIP_BODY;
	}
}

