package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisInformationResourceSupportedByIterator theThesisInformationResourceSupportedByIterator = (ThesisInformationResourceSupportedByIterator)findAncestorWithClass(this, ThesisInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theThesisInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

