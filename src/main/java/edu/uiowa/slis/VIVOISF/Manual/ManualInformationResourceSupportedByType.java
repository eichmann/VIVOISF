package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManualInformationResourceSupportedByIterator theManualInformationResourceSupportedByIterator = (ManualInformationResourceSupportedByIterator)findAncestorWithClass(this, ManualInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theManualInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

