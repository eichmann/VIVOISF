package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleContent currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleContentIterator theEditorialArticle = (EditorialArticleContentIterator)findAncestorWithClass(this, EditorialArticleContentIterator.class);
			pageContext.getOut().print(theEditorialArticle.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for content tag ");
		}
		return SKIP_BODY;
	}
}

