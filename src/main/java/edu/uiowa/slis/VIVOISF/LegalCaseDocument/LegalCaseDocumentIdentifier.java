package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentIdentifierIterator theLegalCaseDocument = (LegalCaseDocumentIdentifierIterator)findAncestorWithClass(this, LegalCaseDocumentIdentifierIterator.class);
			pageContext.getOut().print(theLegalCaseDocument.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for identifier tag ");
		}
		return SKIP_BODY;
	}
}

