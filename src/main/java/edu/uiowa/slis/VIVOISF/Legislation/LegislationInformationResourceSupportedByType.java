package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegislationInformationResourceSupportedByIterator theLegislationInformationResourceSupportedByIterator = (LegislationInformationResourceSupportedByIterator)findAncestorWithClass(this, LegislationInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theLegislationInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

