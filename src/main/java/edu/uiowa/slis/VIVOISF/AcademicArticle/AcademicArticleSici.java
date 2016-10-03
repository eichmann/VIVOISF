package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleSici currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleSiciIterator theAcademicArticle = (AcademicArticleSiciIterator)findAncestorWithClass(this, AcademicArticleSiciIterator.class);
			pageContext.getOut().print(theAcademicArticle.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for sici tag ");
		}
		return SKIP_BODY;
	}
}

