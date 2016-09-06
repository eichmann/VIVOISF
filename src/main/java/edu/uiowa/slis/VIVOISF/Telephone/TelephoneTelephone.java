package edu.uiowa.slis.VIVOISF.Telephone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TelephoneTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TelephoneTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(TelephoneTelephone.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TelephoneTelephoneIterator theTelephone = (TelephoneTelephoneIterator)findAncestorWithClass(this, TelephoneTelephoneIterator.class);
			pageContext.getOut().print(theTelephone.getTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing Telephone for telephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Telephone for telephone tag ");
		}
		return SKIP_BODY;
	}
}

