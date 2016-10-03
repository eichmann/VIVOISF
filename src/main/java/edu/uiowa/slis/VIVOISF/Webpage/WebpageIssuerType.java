package edu.uiowa.slis.VIVOISF.Webpage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebpageIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebpageIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(WebpageIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebpageIssuerIterator theWebpageIssuerIterator = (WebpageIssuerIterator)findAncestorWithClass(this, WebpageIssuerIterator.class);
			pageContext.getOut().print(theWebpageIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Webpage for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Webpage for issuer tag ");
		}
		return SKIP_BODY;
	}
}

