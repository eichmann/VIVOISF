package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherIssuerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherIssuerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherIssuerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherIssuerInverseIterator thePublisherIssuerInverseIterator = (PublisherIssuerInverseIterator)findAncestorWithClass(this, PublisherIssuerInverseIterator.class);
			pageContext.getOut().print(thePublisherIssuerInverseIterator.getIssuerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for issuer tag ");
		}
		return SKIP_BODY;
	}
}

