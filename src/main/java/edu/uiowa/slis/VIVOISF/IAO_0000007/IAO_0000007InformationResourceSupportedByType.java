package edu.uiowa.slis.VIVOISF.IAO_0000007;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000007InformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000007InformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000007InformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000007InformationResourceSupportedByIterator theIAO_0000007InformationResourceSupportedByIterator = (IAO_0000007InformationResourceSupportedByIterator)findAncestorWithClass(this, IAO_0000007InformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theIAO_0000007InformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000007 for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000007 for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

