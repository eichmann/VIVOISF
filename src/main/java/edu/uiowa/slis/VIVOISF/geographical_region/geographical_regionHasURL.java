package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			geographical_regionHasURLIterator thegeographical_regionHasURLIterator = (geographical_regionHasURLIterator)findAncestorWithClass(this, geographical_regionHasURLIterator.class);
			pageContext.getOut().print(thegeographical_regionHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

