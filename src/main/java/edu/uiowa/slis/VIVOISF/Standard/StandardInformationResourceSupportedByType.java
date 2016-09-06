package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StandardInformationResourceSupportedByIterator theStandardInformationResourceSupportedByIterator = (StandardInformationResourceSupportedByIterator)findAncestorWithClass(this, StandardInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theStandardInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

