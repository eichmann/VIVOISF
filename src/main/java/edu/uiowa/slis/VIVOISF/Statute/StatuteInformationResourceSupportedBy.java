package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StatuteInformationResourceSupportedByIterator theStatuteInformationResourceSupportedByIterator = (StatuteInformationResourceSupportedByIterator)findAncestorWithClass(this, StatuteInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theStatuteInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

