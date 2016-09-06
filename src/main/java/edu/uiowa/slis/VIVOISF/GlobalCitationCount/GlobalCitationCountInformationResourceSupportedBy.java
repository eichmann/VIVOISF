package edu.uiowa.slis.VIVOISF.GlobalCitationCount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GlobalCitationCountInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GlobalCitationCountInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(GlobalCitationCountInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GlobalCitationCountInformationResourceSupportedByIterator theGlobalCitationCountInformationResourceSupportedByIterator = (GlobalCitationCountInformationResourceSupportedByIterator)findAncestorWithClass(this, GlobalCitationCountInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theGlobalCitationCountInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing GlobalCitationCount for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing GlobalCitationCount for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

