package edu.uiowa.slis.VIVOISF.Telephone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TelephoneHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TelephoneHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(TelephoneHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TelephoneHasURLIterator theTelephoneHasURLIterator = (TelephoneHasURLIterator)findAncestorWithClass(this, TelephoneHasURLIterator.class);
			pageContext.getOut().print(theTelephoneHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Telephone for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Telephone for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

