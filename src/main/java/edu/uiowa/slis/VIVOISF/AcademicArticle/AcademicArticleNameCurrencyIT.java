package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNameCurrencyITIterator theAcademicArticle = (AcademicArticleNameCurrencyITIterator)findAncestorWithClass(this, AcademicArticleNameCurrencyITIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

