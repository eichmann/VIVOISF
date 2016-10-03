package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleSection currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleSectionIterator theEditorialArticle = (EditorialArticleSectionIterator)findAncestorWithClass(this, EditorialArticleSectionIterator.class);
			pageContext.getOut().print(theEditorialArticle.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for section tag ");
		}
		return SKIP_BODY;
	}
}

