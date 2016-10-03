package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentLocatorIterator theLegalDocument = (LegalDocumentLocatorIterator)findAncestorWithClass(this, LegalDocumentLocatorIterator.class);
			pageContext.getOut().print(theLegalDocument.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for locator tag ");
		}
		return SKIP_BODY;
	}
}

