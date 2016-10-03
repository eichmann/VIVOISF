package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseOwnerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseOwnerType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseOwnerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseOwnerIterator theNewsReleaseOwnerIterator = (NewsReleaseOwnerIterator)findAncestorWithClass(this, NewsReleaseOwnerIterator.class);
			pageContext.getOut().print(theNewsReleaseOwnerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for owner tag ");
		}
		return SKIP_BODY;
	}
}

