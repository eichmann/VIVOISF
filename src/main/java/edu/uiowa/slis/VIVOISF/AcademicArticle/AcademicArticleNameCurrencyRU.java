package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNameCurrencyRUIterator theAcademicArticle = (AcademicArticleNameCurrencyRUIterator)findAncestorWithClass(this, AcademicArticleNameCurrencyRUIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

