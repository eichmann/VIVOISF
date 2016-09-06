package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleStatusIterator theAcademicArticleStatusIterator = (AcademicArticleStatusIterator)findAncestorWithClass(this, AcademicArticleStatusIterator.class);
			pageContext.getOut().print(theAcademicArticleStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for status tag ");
		}
		return SKIP_BODY;
	}
}

