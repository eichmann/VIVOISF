package edu.uiowa.slis.VIVOISF.NewsRelease;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsReleaseFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsReleaseFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsReleaseFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsReleaseFeaturesIterator theNewsReleaseFeaturesIterator = (NewsReleaseFeaturesIterator)findAncestorWithClass(this, NewsReleaseFeaturesIterator.class);
			pageContext.getOut().print(theNewsReleaseFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NewsRelease for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing NewsRelease for features tag ");
		}
		return SKIP_BODY;
	}
}

