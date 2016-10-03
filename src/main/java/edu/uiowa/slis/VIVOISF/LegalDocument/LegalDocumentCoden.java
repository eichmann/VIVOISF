package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentCodenIterator theLegalDocument = (LegalDocumentCodenIterator)findAncestorWithClass(this, LegalDocumentCodenIterator.class);
			pageContext.getOut().print(theLegalDocument.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for coden tag ");
		}
		return SKIP_BODY;
	}
}

