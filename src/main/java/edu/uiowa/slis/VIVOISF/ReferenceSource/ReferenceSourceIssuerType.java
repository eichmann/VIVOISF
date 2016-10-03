package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceIssuerIterator theReferenceSourceIssuerIterator = (ReferenceSourceIssuerIterator)findAncestorWithClass(this, ReferenceSourceIssuerIterator.class);
			pageContext.getOut().print(theReferenceSourceIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for issuer tag ");
		}
		return SKIP_BODY;
	}
}

