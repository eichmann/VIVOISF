package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentCodenIterator theLegalCaseDocument = (LegalCaseDocumentCodenIterator)findAncestorWithClass(this, LegalCaseDocumentCodenIterator.class);
			pageContext.getOut().print(theLegalCaseDocument.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for coden tag ");
		}
		return SKIP_BODY;
	}
}

