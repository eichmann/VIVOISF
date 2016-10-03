package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentIssuerIterator theCollectedDocumentIssuerIterator = (CollectedDocumentIssuerIterator)findAncestorWithClass(this, CollectedDocumentIssuerIterator.class);
			pageContext.getOut().print(theCollectedDocumentIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for issuer tag ");
		}
		return SKIP_BODY;
	}
}

