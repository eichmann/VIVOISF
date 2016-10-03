package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentIssuerIterator theLegalCaseDocumentIssuerIterator = (LegalCaseDocumentIssuerIterator)findAncestorWithClass(this, LegalCaseDocumentIssuerIterator.class);
			pageContext.getOut().print(theLegalCaseDocumentIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for issuer tag ");
		}
		return SKIP_BODY;
	}
}

