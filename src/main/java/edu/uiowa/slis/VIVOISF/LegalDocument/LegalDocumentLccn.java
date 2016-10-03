package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentLccnIterator theLegalDocument = (LegalDocumentLccnIterator)findAncestorWithClass(this, LegalDocumentLccnIterator.class);
			pageContext.getOut().print(theLegalDocument.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for lccn tag ");
		}
		return SKIP_BODY;
	}
}

