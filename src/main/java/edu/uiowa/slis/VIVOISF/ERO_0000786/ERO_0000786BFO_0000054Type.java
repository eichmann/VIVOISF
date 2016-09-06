package edu.uiowa.slis.VIVOISF.ERO_0000786;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000786BFO_0000054Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000786BFO_0000054Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000786BFO_0000054Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000786BFO_0000054Iterator theERO_0000786BFO_0000054Iterator = (ERO_0000786BFO_0000054Iterator)findAncestorWithClass(this, ERO_0000786BFO_0000054Iterator.class);
			pageContext.getOut().print(theERO_0000786BFO_0000054Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000786 for BFO_0000054 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000786 for BFO_0000054 tag ");
		}
		return SKIP_BODY;
	}
}

