package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceIssuerIterator theReferenceSourceIssuerIterator = (ReferenceSourceIssuerIterator)findAncestorWithClass(this, ReferenceSourceIssuerIterator.class);
			pageContext.getOut().print(theReferenceSourceIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for issuer tag ");
		}
		return SKIP_BODY;
	}
}

