package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleReproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleReproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleReproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleReproducesIterator theAcademicArticleReproducesIterator = (AcademicArticleReproducesIterator)findAncestorWithClass(this, AcademicArticleReproducesIterator.class);
			pageContext.getOut().print(theAcademicArticleReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

