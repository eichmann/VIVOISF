package edu.uiowa.slis.VIVOISF.ARG_2000379;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000379RO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000379RO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000379RO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000379RO_0002353Iterator theARG_2000379RO_0002353Iterator = (ARG_2000379RO_0002353Iterator)findAncestorWithClass(this, ARG_2000379RO_0002353Iterator.class);
			pageContext.getOut().print(theARG_2000379RO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000379 for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000379 for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

