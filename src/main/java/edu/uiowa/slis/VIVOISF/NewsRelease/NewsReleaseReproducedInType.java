package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseReproducedInIterator theNewsReleaseReproducedInIterator = (NewsReleaseReproducedInIterator)findAncestorWithClass(this, NewsReleaseReproducedInIterator.class);
			pageContext.getOut().print(theNewsReleaseReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

