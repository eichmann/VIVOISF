package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExcerptInformationResourceSupportedByIterator theExcerptInformationResourceSupportedByIterator = (ExcerptInformationResourceSupportedByIterator)findAncestorWithClass(this, ExcerptInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theExcerptInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

