package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionHasShortName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionHasShortName currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionHasShortName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionHasShortNameIterator thegeographical_region = (geographical_regionHasShortNameIterator)findAncestorWithClass(this, geographical_regionHasShortNameIterator.class);
			pageContext.getOut().print(thegeographical_region.getHasShortName());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for hasShortName tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for hasShortName tag ");
		}
		return SKIP_BODY;
	}
}

