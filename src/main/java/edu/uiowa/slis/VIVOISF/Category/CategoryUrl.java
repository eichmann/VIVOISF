package edu.uiowa.slis.VIVOISF.Category;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CategoryUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CategoryUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(CategoryUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CategoryUrlIterator theCategory = (CategoryUrlIterator)findAncestorWithClass(this, CategoryUrlIterator.class);
			pageContext.getOut().print(theCategory.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Category for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Category for url tag ");
		}
		return SKIP_BODY;
	}
}

