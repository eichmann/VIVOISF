package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleGDPNotesIterator theAcademicArticle = (AcademicArticleGDPNotesIterator)findAncestorWithClass(this, AcademicArticleGDPNotesIterator.class);
			pageContext.getOut().print(theAcademicArticle.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

