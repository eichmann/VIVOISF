package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailEditorIterator theEmailEditorIterator = (EmailEditorIterator)findAncestorWithClass(this, EmailEditorIterator.class);
			pageContext.getOut().print(theEmailEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for editor tag ");
		}
		return SKIP_BODY;
	}
}

