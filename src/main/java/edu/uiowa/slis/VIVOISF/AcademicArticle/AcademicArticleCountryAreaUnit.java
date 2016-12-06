package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleCountryAreaUnitIterator theAcademicArticle = (AcademicArticleCountryAreaUnitIterator)findAncestorWithClass(this, AcademicArticleCountryAreaUnitIterator.class);
			pageContext.getOut().print(theAcademicArticle.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

