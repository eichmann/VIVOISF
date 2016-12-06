package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingRO_0002234 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingRO_0002234 currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingRO_0002234.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingRO_0002234Iterator theself_governingRO_0002234Iterator = (self_governingRO_0002234Iterator)findAncestorWithClass(this, self_governingRO_0002234Iterator.class);
			pageContext.getOut().print(theself_governingRO_0002234Iterator.getRO_0002234());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

