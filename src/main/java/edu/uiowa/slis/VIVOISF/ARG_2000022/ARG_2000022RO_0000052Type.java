package edu.uiowa.slis.VIVOISF.ARG_2000022;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000022RO_0000052Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000022RO_0000052Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000022RO_0000052Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000022RO_0000052Iterator theARG_2000022RO_0000052Iterator = (ARG_2000022RO_0000052Iterator)findAncestorWithClass(this, ARG_2000022RO_0000052Iterator.class);
			pageContext.getOut().print(theARG_2000022RO_0000052Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000022 for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000022 for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}

