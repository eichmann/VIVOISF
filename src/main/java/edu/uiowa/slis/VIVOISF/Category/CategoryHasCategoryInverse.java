package edu.uiowa.slis.VIVOISF.Category;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CategoryHasCategoryInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CategoryHasCategoryInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CategoryHasCategoryInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CategoryHasCategoryInverseIterator theCategoryHasCategoryInverseIterator = (CategoryHasCategoryInverseIterator)findAncestorWithClass(this, CategoryHasCategoryInverseIterator.class);
			pageContext.getOut().print(theCategoryHasCategoryInverseIterator.getHasCategoryInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Category for hasCategory tag ", e);
			throw new JspTagException("Error: Can't find enclosing Category for hasCategory tag ");
		}
		return SKIP_BODY;
	}
}

