package edu.uiowa.slis.VIVOISF.ERO_0001254;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001254InformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001254InformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001254InformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0001254InformationResourceSupportedByIterator theERO_0001254InformationResourceSupportedByIterator = (ERO_0001254InformationResourceSupportedByIterator)findAncestorWithClass(this, ERO_0001254InformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theERO_0001254InformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001254 for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001254 for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

