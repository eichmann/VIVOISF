package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ErratumInformationResourceSupportedByIterator theErratumInformationResourceSupportedByIterator = (ErratumInformationResourceSupportedByIterator)findAncestorWithClass(this, ErratumInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theErratumInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

