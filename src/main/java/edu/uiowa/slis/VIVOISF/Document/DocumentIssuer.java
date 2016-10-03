package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentIssuerIterator theDocumentIssuerIterator = (DocumentIssuerIterator)findAncestorWithClass(this, DocumentIssuerIterator.class);
			pageContext.getOut().print(theDocumentIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for issuer tag ");
		}
		return SKIP_BODY;
	}
}
