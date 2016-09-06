package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScreenplayInformationResourceSupportedByIterator theScreenplayInformationResourceSupportedByIterator = (ScreenplayInformationResourceSupportedByIterator)findAncestorWithClass(this, ScreenplayInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theScreenplayInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

