package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentCourtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentCourtType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentCourtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentCourtIterator theLegalCaseDocumentCourtIterator = (LegalCaseDocumentCourtIterator)findAncestorWithClass(this, LegalCaseDocumentCourtIterator.class);
			pageContext.getOut().print(theLegalCaseDocumentCourtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for court tag ");
		}
		return SKIP_BODY;
	}
}

