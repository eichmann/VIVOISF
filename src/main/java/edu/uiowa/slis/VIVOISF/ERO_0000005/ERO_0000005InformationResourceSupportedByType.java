package edu.uiowa.slis.VIVOISF.ERO_0000005;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000005InformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000005InformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000005InformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000005InformationResourceSupportedByIterator theERO_0000005InformationResourceSupportedByIterator = (ERO_0000005InformationResourceSupportedByIterator)findAncestorWithClass(this, ERO_0000005InformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theERO_0000005InformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000005 for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000005 for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

