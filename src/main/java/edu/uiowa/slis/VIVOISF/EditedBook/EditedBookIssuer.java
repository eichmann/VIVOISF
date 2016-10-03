package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditedBookIssuerIterator theEditedBookIssuerIterator = (EditedBookIssuerIterator)findAncestorWithClass(this, EditedBookIssuerIterator.class);
			pageContext.getOut().print(theEditedBookIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for issuer tag ");
		}
		return SKIP_BODY;
	}
}

