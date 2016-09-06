package edu.uiowa.slis.VIVOISF.ERO_0000392;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000392InformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000392InformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000392InformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000392InformationResourceSupportedByIterator theERO_0000392InformationResourceSupportedByIterator = (ERO_0000392InformationResourceSupportedByIterator)findAncestorWithClass(this, ERO_0000392InformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theERO_0000392InformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000392 for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000392 for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

