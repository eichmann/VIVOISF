package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNationalityENIterator theAcademicArticle = (AcademicArticleNationalityENIterator)findAncestorWithClass(this, AcademicArticleNationalityENIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

