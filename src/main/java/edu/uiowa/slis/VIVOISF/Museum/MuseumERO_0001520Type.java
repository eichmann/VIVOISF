package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumERO_0001520Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumERO_0001520Type currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumERO_0001520Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumERO_0001520Iterator theMuseumERO_0001520Iterator = (MuseumERO_0001520Iterator)findAncestorWithClass(this, MuseumERO_0001520Iterator.class);
			pageContext.getOut().print(theMuseumERO_0001520Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for ERO_0001520 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for ERO_0001520 tag ");
		}
		return SKIP_BODY;
	}
}

