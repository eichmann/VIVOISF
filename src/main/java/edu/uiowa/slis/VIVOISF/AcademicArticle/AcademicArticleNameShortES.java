package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleNameShortESIterator theAcademicArticle = (AcademicArticleNameShortESIterator)findAncestorWithClass(this, AcademicArticleNameShortESIterator.class);
			pageContext.getOut().print(theAcademicArticle.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

