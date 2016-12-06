package edu.uiowa.slis.VIVOISF.URL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class URLHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static URLHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(URLHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			URLHasURLIterator theURLHasURLIterator = (URLHasURLIterator)findAncestorWithClass(this, URLHasURLIterator.class);
			pageContext.getOut().print(theURLHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing URL for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing URL for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

