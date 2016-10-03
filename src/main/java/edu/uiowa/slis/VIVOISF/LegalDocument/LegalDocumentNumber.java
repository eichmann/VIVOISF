package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentNumberIterator theLegalDocument = (LegalDocumentNumberIterator)findAncestorWithClass(this, LegalDocumentNumberIterator.class);
			pageContext.getOut().print(theLegalDocument.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for number tag ");
		}
		return SKIP_BODY;
	}
}

