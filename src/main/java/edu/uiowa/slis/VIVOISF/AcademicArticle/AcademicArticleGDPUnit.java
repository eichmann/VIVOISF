package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleGDPUnitIterator theAcademicArticle = (AcademicArticleGDPUnitIterator)findAncestorWithClass(this, AcademicArticleGDPUnitIterator.class);
			pageContext.getOut().print(theAcademicArticle.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

