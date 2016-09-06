package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingBFO_0000051 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingBFO_0000051 currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingBFO_0000051.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingBFO_0000051Iterator theself_governingBFO_0000051Iterator = (self_governingBFO_0000051Iterator)findAncestorWithClass(this, self_governingBFO_0000051Iterator.class);
			pageContext.getOut().print(theself_governingBFO_0000051Iterator.getBFO_0000051());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

