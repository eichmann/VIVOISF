package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LetterEditorIterator theLetterEditorIterator = (LetterEditorIterator)findAncestorWithClass(this, LetterEditorIterator.class);
			pageContext.getOut().print(theLetterEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for editor tag ");
		}
		return SKIP_BODY;
	}
}

