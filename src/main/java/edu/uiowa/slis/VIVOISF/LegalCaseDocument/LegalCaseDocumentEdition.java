package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentEditionIterator theLegalCaseDocument = (LegalCaseDocumentEditionIterator)findAncestorWithClass(this, LegalCaseDocumentEditionIterator.class);
			pageContext.getOut().print(theLegalCaseDocument.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for edition tag ");
		}
		return SKIP_BODY;
	}
}

