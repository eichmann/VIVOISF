package edu.uiowa.slis.VIVOISF.ARG_2000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000009InformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000009InformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000009InformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000009InformationResourceSupportedByIterator theARG_2000009InformationResourceSupportedByIterator = (ARG_2000009InformationResourceSupportedByIterator)findAncestorWithClass(this, ARG_2000009InformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theARG_2000009InformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000009 for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000009 for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

