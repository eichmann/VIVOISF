package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumERO_0000031 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumERO_0000031 currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumERO_0000031.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumERO_0000031Iterator theMuseumERO_0000031Iterator = (MuseumERO_0000031Iterator)findAncestorWithClass(this, MuseumERO_0000031Iterator.class);
			pageContext.getOut().print(theMuseumERO_0000031Iterator.getERO_0000031());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for ERO_0000031 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for ERO_0000031 tag ");
		}
		return SKIP_BODY;
	}
}

