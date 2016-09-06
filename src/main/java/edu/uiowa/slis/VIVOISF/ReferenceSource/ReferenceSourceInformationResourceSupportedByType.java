package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceInformationResourceSupportedByIterator theReferenceSourceInformationResourceSupportedByIterator = (ReferenceSourceInformationResourceSupportedByIterator)findAncestorWithClass(this, ReferenceSourceInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theReferenceSourceInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

