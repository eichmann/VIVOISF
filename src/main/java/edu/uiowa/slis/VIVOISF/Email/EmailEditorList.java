package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailEditorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailEditorList currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailEditorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailEditorListIterator theEmailEditorListIterator = (EmailEditorListIterator)findAncestorWithClass(this, EmailEditorListIterator.class);
			pageContext.getOut().print(theEmailEditorListIterator.getEditorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for editorList tag ");
		}
		return SKIP_BODY;
	}
}

