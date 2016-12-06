package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleLandAreaNotesIterator theAcademicArticle = (AcademicArticleLandAreaNotesIterator)findAncestorWithClass(this, AcademicArticleLandAreaNotesIterator.class);
			pageContext.getOut().print(theAcademicArticle.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

