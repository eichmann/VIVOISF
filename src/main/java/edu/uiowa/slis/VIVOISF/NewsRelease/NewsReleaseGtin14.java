package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseGtin14Iterator theNewsRelease = (NewsReleaseGtin14Iterator)findAncestorWithClass(this, NewsReleaseGtin14Iterator.class);
			pageContext.getOut().print(theNewsRelease.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

