package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleDateTimeValueIterator theAcademicArticleDateTimeValueIterator = (AcademicArticleDateTimeValueIterator)findAncestorWithClass(this, AcademicArticleDateTimeValueIterator.class);
			pageContext.getOut().print(theAcademicArticleDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

