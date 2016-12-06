package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleLandAreaYearIterator theAcademicArticle = (AcademicArticleLandAreaYearIterator)findAncestorWithClass(this, AcademicArticleLandAreaYearIterator.class);
			pageContext.getOut().print(theAcademicArticle.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

