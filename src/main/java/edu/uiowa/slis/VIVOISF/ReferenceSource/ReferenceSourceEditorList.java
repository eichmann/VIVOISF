package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceEditorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceEditorList currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceEditorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceEditorListIterator theReferenceSourceEditorListIterator = (ReferenceSourceEditorListIterator)findAncestorWithClass(this, ReferenceSourceEditorListIterator.class);
			pageContext.getOut().print(theReferenceSourceEditorListIterator.getEditorList());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for editorList tag ");
		}
		return SKIP_BODY;
	}
}

