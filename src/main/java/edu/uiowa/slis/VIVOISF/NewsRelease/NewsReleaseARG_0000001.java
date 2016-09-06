package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseARG_0000001Iterator theNewsRelease = (NewsReleaseARG_0000001Iterator)findAncestorWithClass(this, NewsReleaseARG_0000001Iterator.class);
			pageContext.getOut().print(theNewsRelease.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

