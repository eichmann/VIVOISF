package edu.uiowa.slis.VIVOISF.Telephone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TelephoneHasTelephoneInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TelephoneHasTelephoneInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(TelephoneHasTelephoneInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TelephoneHasTelephoneInverseIterator theTelephoneHasTelephoneInverseIterator = (TelephoneHasTelephoneInverseIterator)findAncestorWithClass(this, TelephoneHasTelephoneInverseIterator.class);
			pageContext.getOut().print(theTelephoneHasTelephoneInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Telephone for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Telephone for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

