package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNameShortITIterator theAcademicArticle = (AcademicArticleNameShortITIterator)findAncestorWithClass(this, AcademicArticleNameShortITIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

