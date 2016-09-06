package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			geographical_regionRO_0000056Iterator thegeographical_regionRO_0000056Iterator = (geographical_regionRO_0000056Iterator)findAncestorWithClass(this, geographical_regionRO_0000056Iterator.class);
			pageContext.getOut().print(thegeographical_regionRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

