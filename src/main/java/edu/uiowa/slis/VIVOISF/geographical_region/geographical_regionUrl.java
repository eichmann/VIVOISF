package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionUrlIterator thegeographical_region = (geographical_regionUrlIterator)findAncestorWithClass(this, geographical_regionUrlIterator.class);
			pageContext.getOut().print(thegeographical_region.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for url tag ");
		}
		return SKIP_BODY;
	}
}

