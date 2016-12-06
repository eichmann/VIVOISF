package edu.uiowa.slis.VIVOISF.Identification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IdentificationTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IdentificationTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(IdentificationTelephone.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IdentificationTelephoneIterator theIdentification = (IdentificationTelephoneIterator)findAncestorWithClass(this, IdentificationTelephoneIterator.class);
			pageContext.getOut().print(theIdentification.getTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing Identification for telephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Identification for telephone tag ");
		}
		return SKIP_BODY;
	}
}

