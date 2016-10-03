package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterEditorListIterator theConferencePosterEditorListIterator = (ConferencePosterEditorListIterator)findAncestorWithClass(this, ConferencePosterEditorListIterator.class);
			pageContext.getOut().print(theConferencePosterEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for editorList tag ");
		}
		return SKIP_BODY;
	}
}

