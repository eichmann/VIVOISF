package edu.uiowa.slis.VIVOISF.Telephone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TelephoneUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TelephoneUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(TelephoneUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TelephoneUrlIterator theTelephone = (TelephoneUrlIterator)findAncestorWithClass(this, TelephoneUrlIterator.class);
			pageContext.getOut().print(theTelephone.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Telephone for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Telephone for url tag ");
		}
		return SKIP_BODY;
	}
}

