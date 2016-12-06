package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNameShortZHIterator theAcademicArticle = (AcademicArticleNameShortZHIterator)findAncestorWithClass(this, AcademicArticleNameShortZHIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

