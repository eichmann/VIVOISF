package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperInformationResourceSupportedByIterator theConferencePaperInformationResourceSupportedByIterator = (ConferencePaperInformationResourceSupportedByIterator)findAncestorWithClass(this, ConferencePaperInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theConferencePaperInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

