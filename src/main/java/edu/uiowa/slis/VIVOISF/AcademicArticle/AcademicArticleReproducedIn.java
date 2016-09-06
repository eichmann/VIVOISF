package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleReproducedIn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleReproducedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleReproducedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleReproducedInIterator theAcademicArticleReproducedInIterator = (AcademicArticleReproducedInIterator)findAncestorWithClass(this, AcademicArticleReproducedInIterator.class);
			pageContext.getOut().print(theAcademicArticleReproducedInIterator.getReproducedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

