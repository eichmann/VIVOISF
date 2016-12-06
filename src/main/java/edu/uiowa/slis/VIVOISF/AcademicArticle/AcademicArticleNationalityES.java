package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNationalityESIterator theAcademicArticle = (AcademicArticleNationalityESIterator)findAncestorWithClass(this, AcademicArticleNationalityESIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

