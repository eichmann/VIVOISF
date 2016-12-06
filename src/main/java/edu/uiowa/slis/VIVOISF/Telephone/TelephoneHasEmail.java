package edu.uiowa.slis.VIVOISF.Telephone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TelephoneHasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TelephoneHasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(TelephoneHasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TelephoneHasEmailIterator theTelephoneHasEmailIterator = (TelephoneHasEmailIterator)findAncestorWithClass(this, TelephoneHasEmailIterator.class);
			pageContext.getOut().print(theTelephoneHasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing Telephone for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Telephone for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

