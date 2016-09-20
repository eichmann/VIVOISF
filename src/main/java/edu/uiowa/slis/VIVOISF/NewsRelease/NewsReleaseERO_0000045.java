package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseERO_0000045Iterator theNewsRelease = (NewsReleaseERO_0000045Iterator)findAncestorWithClass(this, NewsReleaseERO_0000045Iterator.class);
			pageContext.getOut().print(theNewsRelease.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

