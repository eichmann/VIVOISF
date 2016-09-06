package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleTranslatorIterator theAcademicArticleTranslatorIterator = (AcademicArticleTranslatorIterator)findAncestorWithClass(this, AcademicArticleTranslatorIterator.class);
			pageContext.getOut().print(theAcademicArticleTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for translator tag ");
		}
		return SKIP_BODY;
	}
}

