package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleDoiIterator theEditorialArticle = (EditorialArticleDoiIterator)findAncestorWithClass(this, EditorialArticleDoiIterator.class);
			pageContext.getOut().print(theEditorialArticle.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for doi tag ");
		}
		return SKIP_BODY;
	}
}

