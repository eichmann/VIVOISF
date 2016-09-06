package edu.uiowa.slis.VIVOISF.OBI_0000272;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000272InformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000272InformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000272InformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000272InformationResourceSupportedByIterator theOBI_0000272InformationResourceSupportedByIterator = (OBI_0000272InformationResourceSupportedByIterator)findAncestorWithClass(this, OBI_0000272InformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theOBI_0000272InformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000272 for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000272 for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

