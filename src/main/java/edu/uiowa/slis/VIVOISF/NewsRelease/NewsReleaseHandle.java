package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseHandleIterator theNewsRelease = (NewsReleaseHandleIterator)findAncestorWithClass(this, NewsReleaseHandleIterator.class);
			pageContext.getOut().print(theNewsRelease.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for handle tag ");
		}
		return SKIP_BODY;
	}
}

