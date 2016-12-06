package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingRO_0002353 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingRO_0002353 currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingRO_0002353.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingRO_0002353Iterator theself_governingRO_0002353Iterator = (self_governingRO_0002353Iterator)findAncestorWithClass(this, self_governingRO_0002353Iterator.class);
			pageContext.getOut().print(theself_governingRO_0002353Iterator.getRO_0002353());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

