package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNameOfficialZHIterator theAcademicArticle = (AcademicArticleNameOfficialZHIterator)findAncestorWithClass(this, AcademicArticleNameOfficialZHIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

