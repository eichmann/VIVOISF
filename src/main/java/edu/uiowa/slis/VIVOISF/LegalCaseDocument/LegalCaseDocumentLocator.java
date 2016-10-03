package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentLocatorIterator theLegalCaseDocument = (LegalCaseDocumentLocatorIterator)findAncestorWithClass(this, LegalCaseDocumentLocatorIterator.class);
			pageContext.getOut().print(theLegalCaseDocument.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for locator tag ");
		}
		return SKIP_BODY;
	}
}

