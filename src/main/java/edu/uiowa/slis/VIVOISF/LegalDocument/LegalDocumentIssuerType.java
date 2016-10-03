package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentIssuerIterator theLegalDocumentIssuerIterator = (LegalDocumentIssuerIterator)findAncestorWithClass(this, LegalDocumentIssuerIterator.class);
			pageContext.getOut().print(theLegalDocumentIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for issuer tag ");
		}
		return SKIP_BODY;
	}
}

