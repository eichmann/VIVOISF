package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingBFO_0000050 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingBFO_0000050 currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingBFO_0000050.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingBFO_0000050Iterator theself_governingBFO_0000050Iterator = (self_governingBFO_0000050Iterator)findAncestorWithClass(this, self_governingBFO_0000050Iterator.class);
			pageContext.getOut().print(theself_governingBFO_0000050Iterator.getBFO_0000050());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

