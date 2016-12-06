package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionBFO_0000051 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionBFO_0000051 currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionBFO_0000051.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			geographical_regionBFO_0000051Iterator thegeographical_regionBFO_0000051Iterator = (geographical_regionBFO_0000051Iterator)findAncestorWithClass(this, geographical_regionBFO_0000051Iterator.class);
			pageContext.getOut().print(thegeographical_regionBFO_0000051Iterator.getBFO_0000051());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

