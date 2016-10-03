package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentContent currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentContentIterator theLegalCaseDocument = (LegalCaseDocumentContentIterator)findAncestorWithClass(this, LegalCaseDocumentContentIterator.class);
			pageContext.getOut().print(theLegalCaseDocument.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for content tag ");
		}
		return SKIP_BODY;
	}
}

