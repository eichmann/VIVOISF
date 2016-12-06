package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNameCurrencyARIterator theAcademicArticle = (AcademicArticleNameCurrencyARIterator)findAncestorWithClass(this, AcademicArticleNameCurrencyARIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

