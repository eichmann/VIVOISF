package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentReproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentReproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentReproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentReproducesIterator theLegalCaseDocumentReproducesIterator = (LegalCaseDocumentReproducesIterator)findAncestorWithClass(this, LegalCaseDocumentReproducesIterator.class);
			pageContext.getOut().print(theLegalCaseDocumentReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

