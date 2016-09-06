package edu.uiowa.slis.VIVOISF.Category;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CategoryRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CategoryRank currentInstance = null;
	private static final Log log = LogFactory.getLog(CategoryRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CategoryRankIterator theCategory = (CategoryRankIterator)findAncestorWithClass(this, CategoryRankIterator.class);
			pageContext.getOut().print(theCategory.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Category for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Category for rank tag ");
		}
		return SKIP_BODY;
	}
}

