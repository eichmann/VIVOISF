package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNameListFRIterator theself_governing = (self_governingNameListFRIterator)findAncestorWithClass(this, self_governingNameListFRIterator.class);
			pageContext.getOut().print(theself_governing.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

