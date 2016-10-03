package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentEditionIterator theLegalDocument = (LegalDocumentEditionIterator)findAncestorWithClass(this, LegalDocumentEditionIterator.class);
			pageContext.getOut().print(theLegalDocument.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for edition tag ");
		}
		return SKIP_BODY;
	}
}

