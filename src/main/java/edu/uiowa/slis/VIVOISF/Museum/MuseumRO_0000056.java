package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumRO_0000056Iterator theMuseumRO_0000056Iterator = (MuseumRO_0000056Iterator)findAncestorWithClass(this, MuseumRO_0000056Iterator.class);
			pageContext.getOut().print(theMuseumRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

