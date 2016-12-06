package edu.uiowa.slis.VIVOISF.ARG_2000379;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000379HasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000379HasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000379HasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000379HasNameIterator theARG_2000379HasNameIterator = (ARG_2000379HasNameIterator)findAncestorWithClass(this, ARG_2000379HasNameIterator.class);
			pageContext.getOut().print(theARG_2000379HasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000379 for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000379 for hasName tag ");
		}
		return SKIP_BODY;
	}
}

