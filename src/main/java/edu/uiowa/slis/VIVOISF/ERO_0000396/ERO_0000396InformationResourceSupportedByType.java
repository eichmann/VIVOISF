package edu.uiowa.slis.VIVOISF.ERO_0000396;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000396InformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000396InformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000396InformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000396InformationResourceSupportedByIterator theERO_0000396InformationResourceSupportedByIterator = (ERO_0000396InformationResourceSupportedByIterator)findAncestorWithClass(this, ERO_0000396InformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theERO_0000396InformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000396 for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000396 for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

