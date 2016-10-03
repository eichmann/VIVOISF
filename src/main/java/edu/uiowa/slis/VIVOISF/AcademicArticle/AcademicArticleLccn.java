package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleLccnIterator theAcademicArticle = (AcademicArticleLccnIterator)findAncestorWithClass(this, AcademicArticleLccnIterator.class);
			pageContext.getOut().print(theAcademicArticle.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for lccn tag ");
		}
		return SKIP_BODY;
	}
}

