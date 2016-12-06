package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleFreetextKeywordIterator theAcademicArticle = (AcademicArticleFreetextKeywordIterator)findAncestorWithClass(this, AcademicArticleFreetextKeywordIterator.class);
			pageContext.getOut().print(theAcademicArticle.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

