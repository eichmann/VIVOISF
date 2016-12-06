package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNameCurrencyESIterator theAcademicArticle = (AcademicArticleNameCurrencyESIterator)findAncestorWithClass(this, AcademicArticleNameCurrencyESIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

