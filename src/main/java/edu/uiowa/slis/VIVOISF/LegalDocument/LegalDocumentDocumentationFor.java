package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentDocumentationFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentDocumentationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentDocumentationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentDocumentationForIterator theLegalDocumentDocumentationForIterator = (LegalDocumentDocumentationForIterator)findAncestorWithClass(this, LegalDocumentDocumentationForIterator.class);
			pageContext.getOut().print(theLegalDocumentDocumentationForIterator.getDocumentationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

