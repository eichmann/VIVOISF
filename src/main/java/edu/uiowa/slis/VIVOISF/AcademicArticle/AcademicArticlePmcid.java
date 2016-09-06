package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticlePmcid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticlePmcid currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticlePmcid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticlePmcidIterator theAcademicArticle = (AcademicArticlePmcidIterator)findAncestorWithClass(this, AcademicArticlePmcidIterator.class);
			pageContext.getOut().print(theAcademicArticle.getPmcid());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for pmcid tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for pmcid tag ");
		}
		return SKIP_BODY;
	}
}

