package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNameShortARIterator theAcademicArticle = (AcademicArticleNameShortARIterator)findAncestorWithClass(this, AcademicArticleNameShortARIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

