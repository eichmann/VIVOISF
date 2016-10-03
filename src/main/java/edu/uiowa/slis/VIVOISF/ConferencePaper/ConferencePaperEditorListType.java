package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperEditorListIterator theConferencePaperEditorListIterator = (ConferencePaperEditorListIterator)findAncestorWithClass(this, ConferencePaperEditorListIterator.class);
			pageContext.getOut().print(theConferencePaperEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for editorList tag ");
		}
		return SKIP_BODY;
	}
}

