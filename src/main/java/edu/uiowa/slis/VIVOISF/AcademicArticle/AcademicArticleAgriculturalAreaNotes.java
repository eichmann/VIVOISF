package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleAgriculturalAreaNotesIterator theAcademicArticle = (AcademicArticleAgriculturalAreaNotesIterator)findAncestorWithClass(this, AcademicArticleAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theAcademicArticle.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

