package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentIdentifierIterator theLegalDocument = (LegalDocumentIdentifierIterator)findAncestorWithClass(this, LegalDocumentIdentifierIterator.class);
			pageContext.getOut().print(theLegalDocument.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for identifier tag ");
		}
		return SKIP_BODY;
	}
}

