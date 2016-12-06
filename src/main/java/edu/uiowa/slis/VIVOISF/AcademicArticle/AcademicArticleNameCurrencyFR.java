package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNameCurrencyFRIterator theAcademicArticle = (AcademicArticleNameCurrencyFRIterator)findAncestorWithClass(this, AcademicArticleNameCurrencyFRIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

