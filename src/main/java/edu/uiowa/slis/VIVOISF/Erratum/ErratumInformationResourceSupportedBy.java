package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ErratumInformationResourceSupportedByIterator theErratumInformationResourceSupportedByIterator = (ErratumInformationResourceSupportedByIterator)findAncestorWithClass(this, ErratumInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theErratumInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

