package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentReproducedIn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentReproducedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentReproducedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentReproducedInIterator theLegalCaseDocumentReproducedInIterator = (LegalCaseDocumentReproducedInIterator)findAncestorWithClass(this, LegalCaseDocumentReproducedInIterator.class);
			pageContext.getOut().print(theLegalCaseDocumentReproducedInIterator.getReproducedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

