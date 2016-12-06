package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNameOfficialITIterator theAcademicArticle = (AcademicArticleNameOfficialITIterator)findAncestorWithClass(this, AcademicArticleNameOfficialITIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

