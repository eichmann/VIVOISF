package edu.uiowa.slis.VIVOISF.ARG_2000379;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000379BFO_0000051 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000379BFO_0000051 currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000379BFO_0000051.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000379BFO_0000051Iterator theARG_2000379BFO_0000051Iterator = (ARG_2000379BFO_0000051Iterator)findAncestorWithClass(this, ARG_2000379BFO_0000051Iterator.class);
			pageContext.getOut().print(theARG_2000379BFO_0000051Iterator.getBFO_0000051());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000379 for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000379 for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

