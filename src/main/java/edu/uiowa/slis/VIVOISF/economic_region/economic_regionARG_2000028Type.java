package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			economic_regionARG_2000028Iterator theeconomic_regionARG_2000028Iterator = (economic_regionARG_2000028Iterator)findAncestorWithClass(this, economic_regionARG_2000028Iterator.class);
			pageContext.getOut().print(theeconomic_regionARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

