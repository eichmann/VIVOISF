package edu.uiowa.slis.VIVOISF.URL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class URLHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static URLHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(URLHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			URLHasAddressIterator theURLHasAddressIterator = (URLHasAddressIterator)findAncestorWithClass(this, URLHasAddressIterator.class);
			pageContext.getOut().print(theURLHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing URL for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing URL for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

