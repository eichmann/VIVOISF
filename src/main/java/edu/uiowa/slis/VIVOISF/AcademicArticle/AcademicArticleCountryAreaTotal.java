package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleCountryAreaTotalIterator theAcademicArticle = (AcademicArticleCountryAreaTotalIterator)findAncestorWithClass(this, AcademicArticleCountryAreaTotalIterator.class);
			pageContext.getOut().print(theAcademicArticle.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

