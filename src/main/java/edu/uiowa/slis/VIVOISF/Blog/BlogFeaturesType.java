package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogFeaturesIterator theBlogFeaturesIterator = (BlogFeaturesIterator)findAncestorWithClass(this, BlogFeaturesIterator.class);
			pageContext.getOut().print(theBlogFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for features tag ");
		}
		return SKIP_BODY;
	}
}

