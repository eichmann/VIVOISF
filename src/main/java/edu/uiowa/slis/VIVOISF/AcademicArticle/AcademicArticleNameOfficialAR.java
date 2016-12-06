package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNameOfficialARIterator theAcademicArticle = (AcademicArticleNameOfficialARIterator)findAncestorWithClass(this, AcademicArticleNameOfficialARIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

