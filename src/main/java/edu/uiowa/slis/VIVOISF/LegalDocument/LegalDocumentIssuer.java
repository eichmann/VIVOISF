package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentIssuerIterator theLegalDocumentIssuerIterator = (LegalDocumentIssuerIterator)findAncestorWithClass(this, LegalDocumentIssuerIterator.class);
			pageContext.getOut().print(theLegalDocumentIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for issuer tag ");
		}
		return SKIP_BODY;
	}
}

