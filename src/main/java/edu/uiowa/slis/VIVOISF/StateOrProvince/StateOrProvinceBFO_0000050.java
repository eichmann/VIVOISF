package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceBFO_0000050 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceBFO_0000050 currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceBFO_0000050.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceBFO_0000050Iterator theStateOrProvince = (StateOrProvinceBFO_0000050Iterator)findAncestorWithClass(this, StateOrProvinceBFO_0000050Iterator.class);
			pageContext.getOut().print(theStateOrProvince.getBFO_0000050());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

