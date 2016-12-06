package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionHasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionHasName currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionHasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			geographical_regionHasNameIterator thegeographical_regionHasNameIterator = (geographical_regionHasNameIterator)findAncestorWithClass(this, geographical_regionHasNameIterator.class);
			pageContext.getOut().print(thegeographical_regionHasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for hasName tag ");
		}
		return SKIP_BODY;
	}
}

