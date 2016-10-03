package edu.uiowa.slis.VIVOISF.Website;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WebsiteIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WebsiteIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(WebsiteIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WebsiteIssuerIterator theWebsiteIssuerIterator = (WebsiteIssuerIterator)findAncestorWithClass(this, WebsiteIssuerIterator.class);
			pageContext.getOut().print(theWebsiteIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Website for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Website for issuer tag ");
		}
		return SKIP_BODY;
	}
}

