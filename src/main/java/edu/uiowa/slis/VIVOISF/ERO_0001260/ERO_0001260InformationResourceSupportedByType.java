package edu.uiowa.slis.VIVOISF.ERO_0001260;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001260InformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001260InformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001260InformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0001260InformationResourceSupportedByIterator theERO_0001260InformationResourceSupportedByIterator = (ERO_0001260InformationResourceSupportedByIterator)findAncestorWithClass(this, ERO_0001260InformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theERO_0001260InformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001260 for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001260 for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

