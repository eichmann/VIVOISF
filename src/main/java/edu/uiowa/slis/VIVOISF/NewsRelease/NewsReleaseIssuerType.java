package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseIssuerIterator theNewsReleaseIssuerIterator = (NewsReleaseIssuerIterator)findAncestorWithClass(this, NewsReleaseIssuerIterator.class);
			pageContext.getOut().print(theNewsReleaseIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for issuer tag ");
		}
		return SKIP_BODY;
	}
}

