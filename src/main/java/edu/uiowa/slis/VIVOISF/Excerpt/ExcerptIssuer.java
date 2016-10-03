package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExcerptIssuerIterator theExcerptIssuerIterator = (ExcerptIssuerIterator)findAncestorWithClass(this, ExcerptIssuerIterator.class);
			pageContext.getOut().print(theExcerptIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for issuer tag ");
		}
		return SKIP_BODY;
	}
}

