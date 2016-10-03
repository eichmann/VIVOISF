package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentLccnIterator theLegalCaseDocument = (LegalCaseDocumentLccnIterator)findAncestorWithClass(this, LegalCaseDocumentLccnIterator.class);
			pageContext.getOut().print(theLegalCaseDocument.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for lccn tag ");
		}
		return SKIP_BODY;
	}
}

