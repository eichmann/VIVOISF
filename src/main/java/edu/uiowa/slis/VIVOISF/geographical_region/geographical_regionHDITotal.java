package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionHDITotalIterator thegeographical_region = (geographical_regionHDITotalIterator)findAncestorWithClass(this, geographical_regionHDITotalIterator.class);
			pageContext.getOut().print(thegeographical_region.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

