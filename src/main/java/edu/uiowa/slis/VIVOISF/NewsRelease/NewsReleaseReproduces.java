package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseReproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseReproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseReproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseReproducesIterator theNewsReleaseReproducesIterator = (NewsReleaseReproducesIterator)findAncestorWithClass(this, NewsReleaseReproducesIterator.class);
			pageContext.getOut().print(theNewsReleaseReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

