package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LetterInformationResourceSupportedByIterator theLetterInformationResourceSupportedByIterator = (LetterInformationResourceSupportedByIterator)findAncestorWithClass(this, LetterInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theLetterInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

