package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionERO_0001520 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionERO_0001520 currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionERO_0001520.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionERO_0001520Iterator theDivisionERO_0001520Iterator = (DivisionERO_0001520Iterator)findAncestorWithClass(this, DivisionERO_0001520Iterator.class);
			pageContext.getOut().print(theDivisionERO_0001520Iterator.getERO_0001520());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for ERO_0001520 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for ERO_0001520 tag ");
		}
		return SKIP_BODY;
	}
}

