package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogFeaturesIterator theBlogFeaturesIterator = (BlogFeaturesIterator)findAncestorWithClass(this, BlogFeaturesIterator.class);
			pageContext.getOut().print(theBlogFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for features tag ");
		}
		return SKIP_BODY;
	}
}

