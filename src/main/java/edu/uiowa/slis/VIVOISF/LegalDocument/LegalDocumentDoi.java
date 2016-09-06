package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentDoiIterator theLegalDocument = (LegalDocumentDoiIterator)findAncestorWithClass(this, LegalDocumentDoiIterator.class);
			pageContext.getOut().print(theLegalDocument.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for doi tag ");
		}
		return SKIP_BODY;
	}
}

