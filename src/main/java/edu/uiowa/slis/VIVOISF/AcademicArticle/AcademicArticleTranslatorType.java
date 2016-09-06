package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleTranslatorIterator theAcademicArticleTranslatorIterator = (AcademicArticleTranslatorIterator)findAncestorWithClass(this, AcademicArticleTranslatorIterator.class);
			pageContext.getOut().print(theAcademicArticleTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for translator tag ");
		}
		return SKIP_BODY;
	}
}

