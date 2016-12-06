package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleAgriculturalAreaTotalIterator theAcademicArticle = (AcademicArticleAgriculturalAreaTotalIterator)findAncestorWithClass(this, AcademicArticleAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theAcademicArticle.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

