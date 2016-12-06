package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleHasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleHasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleHasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleHasNameIterator theAcademicArticleHasNameIterator = (AcademicArticleHasNameIterator)findAncestorWithClass(this, AcademicArticleHasNameIterator.class);
			pageContext.getOut().print(theAcademicArticleHasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for hasName tag ");
		}
		return SKIP_BODY;
	}
}

