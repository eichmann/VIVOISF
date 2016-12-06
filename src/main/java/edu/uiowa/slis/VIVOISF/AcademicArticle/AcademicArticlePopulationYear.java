package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticlePopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticlePopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticlePopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticlePopulationYearIterator theAcademicArticle = (AcademicArticlePopulationYearIterator)findAncestorWithClass(this, AcademicArticlePopulationYearIterator.class);
			pageContext.getOut().print(theAcademicArticle.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

