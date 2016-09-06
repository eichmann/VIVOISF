package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationERO_0001520Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationERO_0001520Type currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationERO_0001520Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationERO_0001520Iterator theFoundationERO_0001520Iterator = (FoundationERO_0001520Iterator)findAncestorWithClass(this, FoundationERO_0001520Iterator.class);
			pageContext.getOut().print(theFoundationERO_0001520Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for ERO_0001520 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for ERO_0001520 tag ");
		}
		return SKIP_BODY;
	}
}

