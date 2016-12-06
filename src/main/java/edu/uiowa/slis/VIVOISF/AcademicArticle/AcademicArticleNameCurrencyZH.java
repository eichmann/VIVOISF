package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNameCurrencyZHIterator theAcademicArticle = (AcademicArticleNameCurrencyZHIterator)findAncestorWithClass(this, AcademicArticleNameCurrencyZHIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

