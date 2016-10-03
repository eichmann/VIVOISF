package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingHasCode extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingHasCode currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingHasCode.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingHasCodeIterator theself_governing = (self_governingHasCodeIterator)findAncestorWithClass(this, self_governingHasCodeIterator.class);
			pageContext.getOut().print(theself_governing.getHasCode());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for hasCode tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for hasCode tag ");
		}
		return SKIP_BODY;
	}
}

