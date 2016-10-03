package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleReviewOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleReviewOf currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleReviewOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleReviewOfIterator theAcademicArticleReviewOfIterator = (AcademicArticleReviewOfIterator)findAncestorWithClass(this, AcademicArticleReviewOfIterator.class);
			pageContext.getOut().print(theAcademicArticleReviewOfIterator.getReviewOf());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

