package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditedBookIssuerIterator theEditedBookIssuerIterator = (EditedBookIssuerIterator)findAncestorWithClass(this, EditedBookIssuerIterator.class);
			pageContext.getOut().print(theEditedBookIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for issuer tag ");
		}
		return SKIP_BODY;
	}
}

