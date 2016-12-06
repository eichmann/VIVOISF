package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticlePublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticlePublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticlePublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticlePublicationVenueForIterator theAcademicArticlePublicationVenueForIterator = (AcademicArticlePublicationVenueForIterator)findAncestorWithClass(this, AcademicArticlePublicationVenueForIterator.class);
			pageContext.getOut().print(theAcademicArticlePublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

