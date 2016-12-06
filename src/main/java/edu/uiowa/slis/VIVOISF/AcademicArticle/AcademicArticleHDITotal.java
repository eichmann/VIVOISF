package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleHDITotalIterator theAcademicArticle = (AcademicArticleHDITotalIterator)findAncestorWithClass(this, AcademicArticleHDITotalIterator.class);
			pageContext.getOut().print(theAcademicArticle.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

