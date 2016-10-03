package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleReviewOfIterator theAcademicArticleReviewOfIterator = (AcademicArticleReviewOfIterator)findAncestorWithClass(this, AcademicArticleReviewOfIterator.class);
			pageContext.getOut().print(theAcademicArticleReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

