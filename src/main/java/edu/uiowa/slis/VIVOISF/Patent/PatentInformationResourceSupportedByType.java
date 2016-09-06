package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PatentInformationResourceSupportedByIterator thePatentInformationResourceSupportedByIterator = (PatentInformationResourceSupportedByIterator)findAncestorWithClass(this, PatentInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(thePatentInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

