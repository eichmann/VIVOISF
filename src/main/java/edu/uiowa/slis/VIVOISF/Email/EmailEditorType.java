package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailEditorIterator theEmailEditorIterator = (EmailEditorIterator)findAncestorWithClass(this, EmailEditorIterator.class);
			pageContext.getOut().print(theEmailEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for editor tag ");
		}
		return SKIP_BODY;
	}
}

