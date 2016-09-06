package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNameShortFRIterator theself_governing = (self_governingNameShortFRIterator)findAncestorWithClass(this, self_governingNameShortFRIterator.class);
			pageContext.getOut().print(theself_governing.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

