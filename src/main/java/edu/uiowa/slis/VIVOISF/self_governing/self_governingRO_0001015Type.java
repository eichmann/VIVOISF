package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingRO_0001015Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingRO_0001015Type currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingRO_0001015Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingRO_0001015Iterator theself_governingRO_0001015Iterator = (self_governingRO_0001015Iterator)findAncestorWithClass(this, self_governingRO_0001015Iterator.class);
			pageContext.getOut().print(theself_governingRO_0001015Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

