package edu.uiowa.slis.VIVOISF.Name;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NameTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NameTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(NameTelephone.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NameTelephoneIterator theName = (NameTelephoneIterator)findAncestorWithClass(this, NameTelephoneIterator.class);
			pageContext.getOut().print(theName.getTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing Name for telephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Name for telephone tag ");
		}
		return SKIP_BODY;
	}
}

