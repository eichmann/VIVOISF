package edu.uiowa.slis.VIVOISF.URL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class URLHasURLInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static URLHasURLInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(URLHasURLInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			URLHasURLInverseIterator theURLHasURLInverseIterator = (URLHasURLInverseIterator)findAncestorWithClass(this, URLHasURLInverseIterator.class);
			pageContext.getOut().print(theURLHasURLInverseIterator.getHasURLInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing URL for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing URL for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

