package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticlePopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticlePopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticlePopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticlePopulationNotesIterator theAcademicArticle = (AcademicArticlePopulationNotesIterator)findAncestorWithClass(this, AcademicArticlePopulationNotesIterator.class);
			pageContext.getOut().print(theAcademicArticle.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

