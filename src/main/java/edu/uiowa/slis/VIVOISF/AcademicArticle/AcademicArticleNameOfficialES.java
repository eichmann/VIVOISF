package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNameOfficialESIterator theAcademicArticle = (AcademicArticleNameOfficialESIterator)findAncestorWithClass(this, AcademicArticleNameOfficialESIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

