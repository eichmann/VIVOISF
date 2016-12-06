package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleDateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleDateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleDateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleDateTimeIntervalIterator theAcademicArticleDateTimeIntervalIterator = (AcademicArticleDateTimeIntervalIterator)findAncestorWithClass(this, AcademicArticleDateTimeIntervalIterator.class);
			pageContext.getOut().print(theAcademicArticleDateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

