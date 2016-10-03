package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StandardEditorListIterator theStandardEditorListIterator = (StandardEditorListIterator)findAncestorWithClass(this, StandardEditorListIterator.class);
			pageContext.getOut().print(theStandardEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for editorList tag ");
		}
		return SKIP_BODY;
	}
}
