package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaRO_0001025Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaRO_0001025Type currentInstance = null;
	private static final Log log = LogFactory.getLog(areaRO_0001025Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaRO_0001025Iterator theareaRO_0001025Iterator = (areaRO_0001025Iterator)findAncestorWithClass(this, areaRO_0001025Iterator.class);
			pageContext.getOut().print(theareaRO_0001025Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing area for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

