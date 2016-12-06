package edu.uiowa.slis.VIVOISF.URL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class URLTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static URLTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(URLTelephone.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			URLTelephoneIterator theURL = (URLTelephoneIterator)findAncestorWithClass(this, URLTelephoneIterator.class);
			pageContext.getOut().print(theURL.getTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing URL for telephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing URL for telephone tag ");
		}
		return SKIP_BODY;
	}
}

