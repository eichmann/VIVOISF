package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNameListARIterator theself_governing = (self_governingNameListARIterator)findAncestorWithClass(this, self_governingNameListARIterator.class);
			pageContext.getOut().print(theself_governing.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

