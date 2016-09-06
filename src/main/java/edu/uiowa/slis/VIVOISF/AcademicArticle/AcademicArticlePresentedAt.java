package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticlePresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticlePresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticlePresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticlePresentedAtIterator theAcademicArticlePresentedAtIterator = (AcademicArticlePresentedAtIterator)findAncestorWithClass(this, AcademicArticlePresentedAtIterator.class);
			pageContext.getOut().print(theAcademicArticlePresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

