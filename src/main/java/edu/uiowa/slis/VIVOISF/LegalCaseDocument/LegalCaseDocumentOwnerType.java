package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentOwnerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentOwnerType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentOwnerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentOwnerIterator theLegalCaseDocumentOwnerIterator = (LegalCaseDocumentOwnerIterator)findAncestorWithClass(this, LegalCaseDocumentOwnerIterator.class);
			pageContext.getOut().print(theLegalCaseDocumentOwnerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for owner tag ");
		}
		return SKIP_BODY;
	}
}

