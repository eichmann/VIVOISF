package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingIAO_0000115 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingIAO_0000115 currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingIAO_0000115.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingIAO_0000115Iterator theself_governing = (self_governingIAO_0000115Iterator)findAncestorWithClass(this, self_governingIAO_0000115Iterator.class);
			pageContext.getOut().print(theself_governing.getIAO_0000115());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for IAO_0000115 tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for IAO_0000115 tag ");
		}
		return SKIP_BODY;
	}
}

