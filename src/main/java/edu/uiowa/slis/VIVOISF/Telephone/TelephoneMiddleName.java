package edu.uiowa.slis.VIVOISF.Telephone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TelephoneMiddleName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TelephoneMiddleName currentInstance = null;
	private static final Log log = LogFactory.getLog(TelephoneMiddleName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TelephoneMiddleNameIterator theTelephone = (TelephoneMiddleNameIterator)findAncestorWithClass(this, TelephoneMiddleNameIterator.class);
			pageContext.getOut().print(theTelephone.getMiddleName());
		} catch (Exception e) {
			log.error("Can't find enclosing Telephone for middleName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Telephone for middleName tag ");
		}
		return SKIP_BODY;
	}
}

