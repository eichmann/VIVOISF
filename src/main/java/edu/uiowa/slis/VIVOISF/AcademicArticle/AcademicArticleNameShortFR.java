package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNameShortFRIterator theAcademicArticle = (AcademicArticleNameShortFRIterator)findAncestorWithClass(this, AcademicArticleNameShortFRIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

