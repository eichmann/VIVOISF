package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleCountryAreaYearIterator theAcademicArticle = (AcademicArticleCountryAreaYearIterator)findAncestorWithClass(this, AcademicArticleCountryAreaYearIterator.class);
			pageContext.getOut().print(theAcademicArticle.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

