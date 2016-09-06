package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogDateTimeValueIterator theBlogDateTimeValueIterator = (BlogDateTimeValueIterator)findAncestorWithClass(this, BlogDateTimeValueIterator.class);
			pageContext.getOut().print(theBlogDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

