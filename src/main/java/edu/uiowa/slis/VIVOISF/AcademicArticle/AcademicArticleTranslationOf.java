package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleTranslationOfIterator theAcademicArticleTranslationOfIterator = (AcademicArticleTranslationOfIterator)findAncestorWithClass(this, AcademicArticleTranslationOfIterator.class);
			pageContext.getOut().print(theAcademicArticleTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

