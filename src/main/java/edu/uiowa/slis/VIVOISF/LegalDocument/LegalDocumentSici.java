package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentSici currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentSiciIterator theLegalDocument = (LegalDocumentSiciIterator)findAncestorWithClass(this, LegalDocumentSiciIterator.class);
			pageContext.getOut().print(theLegalDocument.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for sici tag ");
		}
		return SKIP_BODY;
	}
}

