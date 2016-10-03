package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleReviewOfIterator theEditorialArticleReviewOfIterator = (EditorialArticleReviewOfIterator)findAncestorWithClass(this, EditorialArticleReviewOfIterator.class);
			pageContext.getOut().print(theEditorialArticleReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

