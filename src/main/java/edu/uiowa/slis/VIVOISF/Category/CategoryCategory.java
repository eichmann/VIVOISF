package edu.uiowa.slis.VIVOISF.Category;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CategoryCategory extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CategoryCategory currentInstance = null;
	private static final Log log = LogFactory.getLog(CategoryCategory.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CategoryCategoryIterator theCategory = (CategoryCategoryIterator)findAncestorWithClass(this, CategoryCategoryIterator.class);
			pageContext.getOut().print(theCategory.getCategory());
		} catch (Exception e) {
			log.error("Can't find enclosing Category for category tag ", e);
			throw new JspTagException("Error: Can't find enclosing Category for category tag ");
		}
		return SKIP_BODY;
	}
}

