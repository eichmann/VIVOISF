package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleCitesIterator theAcademicArticleCitesIterator = (AcademicArticleCitesIterator)findAncestorWithClass(this, AcademicArticleCitesIterator.class);
			pageContext.getOut().print(theAcademicArticleCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for cites tag ");
		}
		return SKIP_BODY;
	}
}

