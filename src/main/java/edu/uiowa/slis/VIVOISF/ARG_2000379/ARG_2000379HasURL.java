package edu.uiowa.slis.VIVOISF.ARG_2000379;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000379HasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000379HasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000379HasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000379HasURLIterator theARG_2000379HasURLIterator = (ARG_2000379HasURLIterator)findAncestorWithClass(this, ARG_2000379HasURLIterator.class);
			pageContext.getOut().print(theARG_2000379HasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000379 for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000379 for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

