package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleHasEmailIterator theAcademicArticleHasEmailIterator = (AcademicArticleHasEmailIterator)findAncestorWithClass(this, AcademicArticleHasEmailIterator.class);
			pageContext.getOut().print(theAcademicArticleHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

