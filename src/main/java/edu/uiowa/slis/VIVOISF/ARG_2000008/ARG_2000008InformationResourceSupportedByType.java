package edu.uiowa.slis.VIVOISF.ARG_2000008;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000008InformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000008InformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000008InformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000008InformationResourceSupportedByIterator theARG_2000008InformationResourceSupportedByIterator = (ARG_2000008InformationResourceSupportedByIterator)findAncestorWithClass(this, ARG_2000008InformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theARG_2000008InformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000008 for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000008 for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

