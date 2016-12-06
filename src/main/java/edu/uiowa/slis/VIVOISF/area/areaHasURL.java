package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(areaHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaHasURLIterator theareaHasURLIterator = (areaHasURLIterator)findAncestorWithClass(this, areaHasURLIterator.class);
			pageContext.getOut().print(theareaHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing area for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

