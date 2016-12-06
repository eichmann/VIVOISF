package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNameOfficialFRIterator theAcademicArticle = (AcademicArticleNameOfficialFRIterator)findAncestorWithClass(this, AcademicArticleNameOfficialFRIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

