package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleCountryAreaNotesIterator theAcademicArticle = (AcademicArticleCountryAreaNotesIterator)findAncestorWithClass(this, AcademicArticleCountryAreaNotesIterator.class);
			pageContext.getOut().print(theAcademicArticle.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

