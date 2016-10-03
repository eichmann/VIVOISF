package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogDistributorIterator theBlogDistributorIterator = (BlogDistributorIterator)findAncestorWithClass(this, BlogDistributorIterator.class);
			pageContext.getOut().print(theBlogDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for distributor tag ");
		}
		return SKIP_BODY;
	}
}

