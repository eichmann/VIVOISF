package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseIssuerIterator theNewsReleaseIssuerIterator = (NewsReleaseIssuerIterator)findAncestorWithClass(this, NewsReleaseIssuerIterator.class);
			pageContext.getOut().print(theNewsReleaseIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for issuer tag ");
		}
		return SKIP_BODY;
	}
}

