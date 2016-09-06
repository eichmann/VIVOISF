package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BriefInformationResourceSupportedByIterator theBriefInformationResourceSupportedByIterator = (BriefInformationResourceSupportedByIterator)findAncestorWithClass(this, BriefInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theBriefInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

