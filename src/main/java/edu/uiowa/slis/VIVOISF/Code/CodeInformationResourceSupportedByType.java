package edu.uiowa.slis.VIVOISF.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CodeInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CodeInformationResourceSupportedByIterator theCodeInformationResourceSupportedByIterator = (CodeInformationResourceSupportedByIterator)findAncestorWithClass(this, CodeInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theCodeInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

