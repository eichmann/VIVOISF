package edu.uiowa.slis.VIVOISF.ERO_0000778;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000778BFO_0000054 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000778BFO_0000054 currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000778BFO_0000054.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000778BFO_0000054Iterator theERO_0000778BFO_0000054Iterator = (ERO_0000778BFO_0000054Iterator)findAncestorWithClass(this, ERO_0000778BFO_0000054Iterator.class);
			pageContext.getOut().print(theERO_0000778BFO_0000054Iterator.getBFO_0000054());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000778 for BFO_0000054 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000778 for BFO_0000054 tag ");
		}
		return SKIP_BODY;
	}
}

