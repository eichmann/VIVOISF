package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleGeographicFocusIterator theAcademicArticleGeographicFocusIterator = (AcademicArticleGeographicFocusIterator)findAncestorWithClass(this, AcademicArticleGeographicFocusIterator.class);
			pageContext.getOut().print(theAcademicArticleGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

