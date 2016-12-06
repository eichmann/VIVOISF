package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionRO_0001015 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionRO_0001015 currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionRO_0001015.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			geographical_regionRO_0001015Iterator thegeographical_regionRO_0001015Iterator = (geographical_regionRO_0001015Iterator)findAncestorWithClass(this, geographical_regionRO_0001015Iterator.class);
			pageContext.getOut().print(thegeographical_regionRO_0001015Iterator.getRO_0001015());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

