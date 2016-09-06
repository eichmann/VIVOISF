package edu.uiowa.slis.VIVOISF.OBI_0001554;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0001554InformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0001554InformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0001554InformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0001554InformationResourceSupportedByIterator theOBI_0001554InformationResourceSupportedByIterator = (OBI_0001554InformationResourceSupportedByIterator)findAncestorWithClass(this, OBI_0001554InformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theOBI_0001554InformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0001554 for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0001554 for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

