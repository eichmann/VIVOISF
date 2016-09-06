package edu.uiowa.slis.VIVOISF.OBI_0500000;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0500000InformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0500000InformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0500000InformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0500000InformationResourceSupportedByIterator theOBI_0500000InformationResourceSupportedByIterator = (OBI_0500000InformationResourceSupportedByIterator)findAncestorWithClass(this, OBI_0500000InformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theOBI_0500000InformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0500000 for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0500000 for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

