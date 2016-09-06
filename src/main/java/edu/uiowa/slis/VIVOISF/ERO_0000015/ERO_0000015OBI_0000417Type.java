package edu.uiowa.slis.VIVOISF.ERO_0000015;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000015OBI_0000417Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000015OBI_0000417Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000015OBI_0000417Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000015OBI_0000417Iterator theERO_0000015OBI_0000417Iterator = (ERO_0000015OBI_0000417Iterator)findAncestorWithClass(this, ERO_0000015OBI_0000417Iterator.class);
			pageContext.getOut().print(theERO_0000015OBI_0000417Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000015 for OBI_0000417 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000015 for OBI_0000417 tag ");
		}
		return SKIP_BODY;
	}
}

