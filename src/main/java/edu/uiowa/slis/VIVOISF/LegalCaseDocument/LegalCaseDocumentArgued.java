package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentArgued extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentArgued currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentArgued.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentArguedIterator theLegalCaseDocument = (LegalCaseDocumentArguedIterator)findAncestorWithClass(this, LegalCaseDocumentArguedIterator.class);
			pageContext.getOut().print(theLegalCaseDocument.getArgued());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for argued tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for argued tag ");
		}
		return SKIP_BODY;
	}
}

