package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteRelatedByIterator theInstituteRelatedByIterator = (InstituteRelatedByIterator)findAncestorWithClass(this, InstituteRelatedByIterator.class);
			pageContext.getOut().print(theInstituteRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

