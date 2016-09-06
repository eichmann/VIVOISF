package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionERO_0000031 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionERO_0000031 currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionERO_0000031.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionERO_0000031Iterator theDivisionERO_0000031Iterator = (DivisionERO_0000031Iterator)findAncestorWithClass(this, DivisionERO_0000031Iterator.class);
			pageContext.getOut().print(theDivisionERO_0000031Iterator.getERO_0000031());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for ERO_0000031 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for ERO_0000031 tag ");
		}
		return SKIP_BODY;
	}
}

