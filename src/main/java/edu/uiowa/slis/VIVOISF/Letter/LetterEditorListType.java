package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LetterEditorListIterator theLetterEditorListIterator = (LetterEditorListIterator)findAncestorWithClass(this, LetterEditorListIterator.class);
			pageContext.getOut().print(theLetterEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for editorList tag ");
		}
		return SKIP_BODY;
	}
}

