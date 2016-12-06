package edu.uiowa.slis.VIVOISF.Telephone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TelephoneHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TelephoneHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(TelephoneHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TelephoneHasURLIterator theTelephoneHasURLIterator = (TelephoneHasURLIterator)findAncestorWithClass(this, TelephoneHasURLIterator.class);
			pageContext.getOut().print(theTelephoneHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing Telephone for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Telephone for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

