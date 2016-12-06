package edu.uiowa.slis.VIVOISF.Addressing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AddressingTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AddressingTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(AddressingTelephone.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AddressingTelephoneIterator theAddressing = (AddressingTelephoneIterator)findAncestorWithClass(this, AddressingTelephoneIterator.class);
			pageContext.getOut().print(theAddressing.getTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing Addressing for telephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Addressing for telephone tag ");
		}
		return SKIP_BODY;
	}
}

