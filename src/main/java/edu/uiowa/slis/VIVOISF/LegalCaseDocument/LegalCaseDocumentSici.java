package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentSici currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentSiciIterator theLegalCaseDocument = (LegalCaseDocumentSiciIterator)findAncestorWithClass(this, LegalCaseDocumentSiciIterator.class);
			pageContext.getOut().print(theLegalCaseDocument.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for sici tag ");
		}
		return SKIP_BODY;
	}
}

