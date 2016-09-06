package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingRO_0000056Iterator theself_governingRO_0000056Iterator = (self_governingRO_0000056Iterator)findAncestorWithClass(this, self_governingRO_0000056Iterator.class);
			pageContext.getOut().print(theself_governingRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

