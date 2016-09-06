package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterInformationResourceSupportedByIterator theConferencePosterInformationResourceSupportedByIterator = (ConferencePosterInformationResourceSupportedByIterator)findAncestorWithClass(this, ConferencePosterInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theConferencePosterInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

