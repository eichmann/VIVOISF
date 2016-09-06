package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticlePmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticlePmid currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticlePmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticlePmidIterator theAcademicArticle = (AcademicArticlePmidIterator)findAncestorWithClass(this, AcademicArticlePmidIterator.class);
			pageContext.getOut().print(theAcademicArticle.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for pmid tag ");
		}
		return SKIP_BODY;
	}
}

