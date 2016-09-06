package edu.uiowa.slis.VIVOISF.IAO_0000102;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000102InformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000102InformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000102InformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000102InformationResourceSupportedByIterator theIAO_0000102InformationResourceSupportedByIterator = (IAO_0000102InformationResourceSupportedByIterator)findAncestorWithClass(this, IAO_0000102InformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theIAO_0000102InformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000102 for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000102 for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

