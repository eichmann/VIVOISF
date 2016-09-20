package edu.uiowa.slis.VIVOISF.ERO_0001259;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001259ERO_0000460Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001259ERO_0000460Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001259ERO_0000460Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0001259ERO_0000460Iterator theERO_0001259ERO_0000460Iterator = (ERO_0001259ERO_0000460Iterator)findAncestorWithClass(this, ERO_0001259ERO_0000460Iterator.class);
			pageContext.getOut().print(theERO_0001259ERO_0000460Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001259 for ERO_0000460 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001259 for ERO_0000460 tag ");
		}
		return SKIP_BODY;
	}
}

