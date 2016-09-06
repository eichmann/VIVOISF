package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNameShortARIterator theself_governing = (self_governingNameShortARIterator)findAncestorWithClass(this, self_governingNameShortARIterator.class);
			pageContext.getOut().print(theself_governing.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

