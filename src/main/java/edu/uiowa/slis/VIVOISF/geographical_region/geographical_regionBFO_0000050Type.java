package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionBFO_0000050Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionBFO_0000050Type currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionBFO_0000050Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			geographical_regionBFO_0000050Iterator thegeographical_regionBFO_0000050Iterator = (geographical_regionBFO_0000050Iterator)findAncestorWithClass(this, geographical_regionBFO_0000050Iterator.class);
			pageContext.getOut().print(thegeographical_regionBFO_0000050Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

