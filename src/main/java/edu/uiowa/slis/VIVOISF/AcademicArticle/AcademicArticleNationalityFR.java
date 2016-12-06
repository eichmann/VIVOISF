package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNationalityFRIterator theAcademicArticle = (AcademicArticleNationalityFRIterator)findAncestorWithClass(this, AcademicArticleNationalityFRIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

