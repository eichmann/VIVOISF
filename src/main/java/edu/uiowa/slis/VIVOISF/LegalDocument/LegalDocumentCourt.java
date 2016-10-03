package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentCourt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentCourt currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentCourt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentCourtIterator theLegalDocumentCourtIterator = (LegalDocumentCourtIterator)findAncestorWithClass(this, LegalDocumentCourtIterator.class);
			pageContext.getOut().print(theLegalDocumentCourtIterator.getCourt());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for court tag ");
		}
		return SKIP_BODY;
	}
}

