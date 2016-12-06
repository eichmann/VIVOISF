package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNameCurrencyENIterator theAcademicArticle = (AcademicArticleNameCurrencyENIterator)findAncestorWithClass(this, AcademicArticleNameCurrencyENIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

