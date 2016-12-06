package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNameOfficialENIterator theAcademicArticle = (AcademicArticleNameOfficialENIterator)findAncestorWithClass(this, AcademicArticleNameOfficialENIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

