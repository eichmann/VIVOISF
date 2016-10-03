package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleOclcnumIterator theAcademicArticle = (AcademicArticleOclcnumIterator)findAncestorWithClass(this, AcademicArticleOclcnumIterator.class);
			pageContext.getOut().print(theAcademicArticle.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

