package edu.uiowa.slis.VIVOISF.Identification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IdentificationHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IdentificationHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(IdentificationHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IdentificationHasURLIterator theIdentificationHasURLIterator = (IdentificationHasURLIterator)findAncestorWithClass(this, IdentificationHasURLIterator.class);
			pageContext.getOut().print(theIdentificationHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Identification for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Identification for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

