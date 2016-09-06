package edu.uiowa.slis.VIVOISF.ERO_0001255;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001255InformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001255InformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001255InformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0001255InformationResourceSupportedByIterator theERO_0001255InformationResourceSupportedByIterator = (ERO_0001255InformationResourceSupportedByIterator)findAncestorWithClass(this, ERO_0001255InformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theERO_0001255InformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001255 for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001255 for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

