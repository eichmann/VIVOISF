package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentArgued extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentArgued currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentArgued.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentArguedIterator theLegalDocument = (LegalDocumentArguedIterator)findAncestorWithClass(this, LegalDocumentArguedIterator.class);
			pageContext.getOut().print(theLegalDocument.getArgued());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for argued tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for argued tag ");
		}
		return SKIP_BODY;
	}
}

