package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNationalityITIterator theAcademicArticle = (AcademicArticleNationalityITIterator)findAncestorWithClass(this, AcademicArticleNationalityITIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

