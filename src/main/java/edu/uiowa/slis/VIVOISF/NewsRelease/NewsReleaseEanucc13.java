package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseEanucc13Iterator theNewsRelease = (NewsReleaseEanucc13Iterator)findAncestorWithClass(this, NewsReleaseEanucc13Iterator.class);
			pageContext.getOut().print(theNewsRelease.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

