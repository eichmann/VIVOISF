package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteRelatedByIterator theInstituteRelatedByIterator = (InstituteRelatedByIterator)findAncestorWithClass(this, InstituteRelatedByIterator.class);
			pageContext.getOut().print(theInstituteRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

