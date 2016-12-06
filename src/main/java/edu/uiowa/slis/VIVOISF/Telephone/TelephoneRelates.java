package edu.uiowa.slis.VIVOISF.Telephone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TelephoneRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TelephoneRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(TelephoneRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TelephoneRelatesIterator theTelephoneRelatesIterator = (TelephoneRelatesIterator)findAncestorWithClass(this, TelephoneRelatesIterator.class);
			pageContext.getOut().print(theTelephoneRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing Telephone for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Telephone for relates tag ");
		}
		return SKIP_BODY;
	}
}

