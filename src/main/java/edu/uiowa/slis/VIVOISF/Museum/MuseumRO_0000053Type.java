package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumRO_0000053Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumRO_0000053Type currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumRO_0000053Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumRO_0000053Iterator theMuseumRO_0000053Iterator = (MuseumRO_0000053Iterator)findAncestorWithClass(this, MuseumRO_0000053Iterator.class);
			pageContext.getOut().print(theMuseumRO_0000053Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

