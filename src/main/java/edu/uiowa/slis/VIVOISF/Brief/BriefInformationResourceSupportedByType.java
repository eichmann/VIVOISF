package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BriefInformationResourceSupportedByIterator theBriefInformationResourceSupportedByIterator = (BriefInformationResourceSupportedByIterator)findAncestorWithClass(this, BriefInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theBriefInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

