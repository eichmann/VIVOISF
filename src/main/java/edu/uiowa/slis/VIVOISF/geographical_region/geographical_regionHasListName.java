package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionHasListName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionHasListName currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionHasListName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionHasListNameIterator thegeographical_region = (geographical_regionHasListNameIterator)findAncestorWithClass(this, geographical_regionHasListNameIterator.class);
			pageContext.getOut().print(thegeographical_region.getHasListName());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for hasListName tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for hasListName tag ");
		}
		return SKIP_BODY;
	}
}

