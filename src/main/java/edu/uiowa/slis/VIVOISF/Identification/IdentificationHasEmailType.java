package edu.uiowa.slis.VIVOISF.Identification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IdentificationHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IdentificationHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(IdentificationHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IdentificationHasEmailIterator theIdentificationHasEmailIterator = (IdentificationHasEmailIterator)findAncestorWithClass(this, IdentificationHasEmailIterator.class);
			pageContext.getOut().print(theIdentificationHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Identification for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Identification for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

