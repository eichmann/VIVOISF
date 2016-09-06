package edu.uiowa.slis.VIVOISF.Blog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BlogTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BlogTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(BlogTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BlogTranslatorIterator theBlogTranslatorIterator = (BlogTranslatorIterator)findAncestorWithClass(this, BlogTranslatorIterator.class);
			pageContext.getOut().print(theBlogTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Blog for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Blog for translator tag ");
		}
		return SKIP_BODY;
	}
}

