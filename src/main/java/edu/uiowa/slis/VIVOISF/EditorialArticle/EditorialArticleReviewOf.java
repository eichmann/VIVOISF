package edu.uiowa.slis.VIVOISF.EditorialArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorialArticleReviewOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorialArticleReviewOf currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorialArticleReviewOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorialArticleReviewOfIterator theEditorialArticleReviewOfIterator = (EditorialArticleReviewOfIterator)findAncestorWithClass(this, EditorialArticleReviewOfIterator.class);
			pageContext.getOut().print(theEditorialArticleReviewOfIterator.getReviewOf());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorialArticle for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorialArticle for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

