package edu.uiowa.slis.VIVOISF.ERO_0001262;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001262InformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001262InformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001262InformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0001262InformationResourceSupportedByIterator theERO_0001262InformationResourceSupportedByIterator = (ERO_0001262InformationResourceSupportedByIterator)findAncestorWithClass(this, ERO_0001262InformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theERO_0001262InformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001262 for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001262 for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

