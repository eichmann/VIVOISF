package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNationalityZHIterator theAcademicArticle = (AcademicArticleNationalityZHIterator)findAncestorWithClass(this, AcademicArticleNationalityZHIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

