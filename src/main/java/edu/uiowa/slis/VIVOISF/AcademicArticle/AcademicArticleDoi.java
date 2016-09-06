package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleDoiIterator theAcademicArticle = (AcademicArticleDoiIterator)findAncestorWithClass(this, AcademicArticleDoiIterator.class);
			pageContext.getOut().print(theAcademicArticle.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for doi tag ");
		}
		return SKIP_BODY;
	}
}

