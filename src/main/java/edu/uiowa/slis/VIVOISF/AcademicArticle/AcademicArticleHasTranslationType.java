package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleHasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleHasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleHasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleHasTranslationIterator theAcademicArticleHasTranslationIterator = (AcademicArticleHasTranslationIterator)findAncestorWithClass(this, AcademicArticleHasTranslationIterator.class);
			pageContext.getOut().print(theAcademicArticleHasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

