package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleRank currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleRankIterator theAcademicArticle = (AcademicArticleRankIterator)findAncestorWithClass(this, AcademicArticleRankIterator.class);
			pageContext.getOut().print(theAcademicArticle.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for rank tag ");
		}
		return SKIP_BODY;
	}
}

