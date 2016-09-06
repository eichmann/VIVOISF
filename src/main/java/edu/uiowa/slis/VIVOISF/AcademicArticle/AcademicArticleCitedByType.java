package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleCitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleCitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleCitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleCitedByIterator theAcademicArticleCitedByIterator = (AcademicArticleCitedByIterator)findAncestorWithClass(this, AcademicArticleCitedByIterator.class);
			pageContext.getOut().print(theAcademicArticleCitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

