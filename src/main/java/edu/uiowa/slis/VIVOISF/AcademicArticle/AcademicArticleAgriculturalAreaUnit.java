package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleAgriculturalAreaUnitIterator theAcademicArticle = (AcademicArticleAgriculturalAreaUnitIterator)findAncestorWithClass(this, AcademicArticleAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theAcademicArticle.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

