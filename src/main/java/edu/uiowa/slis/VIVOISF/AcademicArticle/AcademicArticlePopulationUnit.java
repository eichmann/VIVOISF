package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticlePopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticlePopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticlePopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticlePopulationUnitIterator theAcademicArticle = (AcademicArticlePopulationUnitIterator)findAncestorWithClass(this, AcademicArticlePopulationUnitIterator.class);
			pageContext.getOut().print(theAcademicArticle.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

