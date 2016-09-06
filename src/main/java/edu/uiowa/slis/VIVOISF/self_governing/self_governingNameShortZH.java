package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNameShortZHIterator theself_governing = (self_governingNameShortZHIterator)findAncestorWithClass(this, self_governingNameShortZHIterator.class);
			pageContext.getOut().print(theself_governing.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

