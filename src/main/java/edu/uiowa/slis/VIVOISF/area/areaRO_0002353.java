package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaRO_0002353 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaRO_0002353 currentInstance = null;
	private static final Log log = LogFactory.getLog(areaRO_0002353.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaRO_0002353Iterator theareaRO_0002353Iterator = (areaRO_0002353Iterator)findAncestorWithClass(this, areaRO_0002353Iterator.class);
			pageContext.getOut().print(theareaRO_0002353Iterator.getRO_0002353());
		} catch (Exception e) {
			log.error("Can't find enclosing area for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

