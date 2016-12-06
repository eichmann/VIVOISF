package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleCodeCurrencyIterator theAcademicArticle = (AcademicArticleCodeCurrencyIterator)findAncestorWithClass(this, AcademicArticleCodeCurrencyIterator.class);
			pageContext.getOut().print(theAcademicArticle.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

