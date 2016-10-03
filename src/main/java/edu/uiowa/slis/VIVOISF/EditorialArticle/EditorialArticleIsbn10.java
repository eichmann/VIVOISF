package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleIsbn10Iterator theEditorialArticle = (EditorialArticleIsbn10Iterator)findAncestorWithClass(this, EditorialArticleIsbn10Iterator.class);
			pageContext.getOut().print(theEditorialArticle.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

