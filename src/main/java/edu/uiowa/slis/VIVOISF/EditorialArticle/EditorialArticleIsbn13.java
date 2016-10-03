package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleIsbn13Iterator theEditorialArticle = (EditorialArticleIsbn13Iterator)findAncestorWithClass(this, EditorialArticleIsbn13Iterator.class);
			pageContext.getOut().print(theEditorialArticle.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

